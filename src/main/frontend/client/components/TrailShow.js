import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import ReviewTile from "./ReviewTile.js";
import ReviewForm from "./ReviewForm.js";
import SuccessTile from "./SuccessTile.js";

const TrailShow = (props) => {
  const [trail, setTrail] = useState([]);
  const [reviews, setReviews] = useState([]);
  const [showReviewForm, setReviewShowForm] = useState(false);
  const [afterSubmission, setAfterSubmission] = useState(false);
  const [showResponse, setShowResponse] = useState(null);
  const trailId = props.match.params.id;

  const getTrail = async () => {
    try {
      const response = await fetch(`/api/v1/trails/${trailId}`);
      if (!response.ok) {
        const errorMessage = `${response.status} (${response.statusText})`;
        const error = new Error(errorMessage);
        throw error;
      }
      const responseBody = await response.json();
      setTrail(responseBody);
    } catch (err) {
      console.error(`Could not complete data fetch.`);
    }
  };

  const getReviews = async () => {
    try {
      const response = await fetch(`/api/v1/trails/${trailId}/all-reviews`);
      if (!response.ok) {
        const errMessage = `${response.status} (${response.statusText})`;
        const err = new Error(errMessage);
        throw err;
      }
      const responseBody = await response.json();
      setReviews(responseBody);
    } catch (err) {
      console.error(`Could not complete data fetch`);
    }
  };

  useEffect(() => {
    getTrail();
    getReviews();
  }, [props]);

  const showNewReviewForm = (event) => {
    event.preventDefault();
    setReviewShowForm(true);
  };

  const handleWhatToShow = () => {
    setAfterSubmission(true);
  };

  let reviewFormDisplay = "";
  if (showReviewForm) {
    reviewFormDisplay = (
      <ReviewForm
        id={props.match.params.id}
        handleWhatToShow={handleWhatToShow}
      />
    );
  }

  let whatToShow = "";
  if (afterSubmission) {
    whatToShow = <SuccessTile />;
  } else {
    whatToShow = (
      <div>
        <button onClick={showNewReviewForm} className="button round">
          Add Review!
        </button>
        {reviewFormDisplay}
      </div>
    );
  }

  const ReviewObjects = reviews.map((review) => {
    return (
      <ReviewTile
        key={review.id}
        id={review.id}
        reviewerName={review.reviewerName}
        starRating={review.starRating}
        body={review.body}
      />
    );
  });

  let petFriendly;
  if (trail.petFriendly) {
    petFriendly = "Yes";
  } else {
    petFriendly = "No";
  }

  let familyFriendly;
  if (trail.familyFriendly) {
    familyFriendly = "Yes";
  } else {
    familyFriendly = "No";
  }

  let difficultyRating;
  if (trail.difficulty === 1) {
    difficultyRating = "Easy";
  } else if (trail.difficulty === 2) {
    difficultyRating = "Intermediate";
  } else {
    difficultyRating = "Advanced";
  }

  let passesRequired;
  if (trail.passesRequired) {
    passesRequired = "Pass Required For Entry";
  } else {
    passesRequired = "Free Entry, No Pass Required";
  }

  return (
    <div>
      <div className="trail-show">
        <h1>{trail.name}</h1>
        <span>{trail.description}</span>
        <ul></ul>
        <table>
          <colgroup>
            <col style={{ width: 150 }}></col>
            <col style={{ width: 100 }}></col>
            <col style={{ width: 150 }}></col>
          </colgroup>
          <thead>
            <tr>
              <th className="trail-details-head, trail-details-left">
                Difficulty Level
              </th>
              <th className="trail-details-head">Distance</th>
              <th className="trail-details-head">Elevation Gain</th>
            </tr>
          </thead>
          <tbody>
            <tr className="trail-body">
              <th className="trail-details-left">{difficultyRating} </th>
              <th className="trail-details">{trail.hikeLengthMiles} miles</th>
              <th className="trail-details">{trail.elevationGainFt} ft</th>
            </tr>
          </tbody>
        </table>

        <ul className="no-bullet">
          <li>Family Friendly: {familyFriendly}</li>
          <li>Pet Friendly: {petFriendly}</li>
          <li>{passesRequired}</li>
        </ul>
        <div>{whatToShow}</div>
        <div>
          <h2>Reviews</h2>
          {ReviewObjects}
        </div>
      </div>
    </div>
  );
};

export default TrailShow;
