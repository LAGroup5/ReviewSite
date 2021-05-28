import React, { useState, useEffect } from "react";
import _ from "lodash";

const ReviewForm = (props) => {
  const defaultFormValues = {
    reviewerName: "",
    starRating: "",
    body: ""
   }
   const [newReview, setNewReview] = useState(defaultFormValues)
   const [formSubmitted, setFormSubmitted] = useState(false)

  const addNewReview = async () => {
    try {
      const id = props.id;
      const trailId = props.trailId;
      const response = await fetch(`/api/v1/trails/${id}/review`, {
        method: "POST",
        headers: new Headers({
          "Content-Type": "application/json",
        }),
        body: JSON.stringify(newReview),
      });
      if (!response.ok) {
        if (response.status === 422) {
          const data = await response.json();
          return setErrors(data.errors);
        } else {
          const errorMessage = `${response.status} (${response.statusText})`;
          const error = new Error(errorMessage);
          throw error;
        }
      } else {
        const data = await response.json();
        if (data) {
          props.handleWhatToShow();
        }
      }
    } catch (error) {
      console.error(`Error in fetch: ${error}`);
    }
  };

  const handleChange = (event) => {
    setNewReview({
      ...newReview,
      [event.currentTarget.name]: event.currentTarget.value,
    });
  };

  const handleSubmit = (event) => {
    if (newReview.starRating === "") {
      newReview.starRating = 5
    }
    event.preventDefault();
    addNewReview(newReview);
  };

  const clearForm = () => {
    setNewReview(defaultFormValues);
  };

  if (!formSubmitted) {
    return (
      <form className="new-review" onSubmit={handleSubmit}>
        <div className="inputGroup">
          <label htmlFor="name">
            Your Name:
          </label>
          <input
            name="reviewerName"
            id="reviewerName"
            type="text"
            value={newReview.reviewerName}
            onChange={handleChange}
          />
          <p className="errorForm"></p>
        </div>


        <div className="inputGroup">
          <label htmlFor="starRating">
            Rating:
          </label>
          <select name="starRating" id="starRating" value={newReview.starRating} onChange={handleChange}>
            <option value="5">5 stars</option>
            <option value="4">4 stars</option>
            <option value="3">3 stars</option>
            <option value="2">2 stars</option>
            <option value="1">1 star</option>
          </select>
        </div>


        <div className="inputGroup">
          <label htmlFor="body"><br />
            Review: <br/>
          </label>
          <textarea
            name="body"
            id="body"
            rows="5" cols="31"
            value={newReview.body}
            onChange={handleChange}
          />
        </div>


        <div className= "inputGroup">
          <input className="button" type="submit" value="Submit Review" />
        </div>
      </form>
    );
  }
};

export default ReviewForm;
