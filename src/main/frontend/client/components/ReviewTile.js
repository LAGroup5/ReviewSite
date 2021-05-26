import React from "react";
import { Link } from "react-router-dom";

const ReviewTile = (props) => {
  return (
    <div>
      <p className="reviewer-name">{props.reviewName}</p>
      <p className="review-star-rating">{props.starRating}</p>
      <p className="review-text">{props.review}</p>
      <br />
    </div>
  );
};

export default ReviewTile;
