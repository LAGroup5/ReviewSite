import React from "react";
import { Link } from "react-router-dom";

const ReviewTile = (props) => {
  return (
    <div>
      <p className="reviewer-name">
        {props.reviewerName}
        <span className="review-star-rating">{props.starRating} Stars</span>
      </p>
      <p className="review-body">{props.body}</p>
      <hr />
    </div>
  );
};

export default ReviewTile;
