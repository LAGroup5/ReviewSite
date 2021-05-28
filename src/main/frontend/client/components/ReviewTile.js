import React from "react";
import { Link } from "react-router-dom";

const ReviewTile = (props) => {
  let reviewerName = ""
  if (props.reviewerName === null || props.reviewerName === "") {
    reviewerName = "Anonymous"
  } else {
    reviewerName = props.reviewerName
  }

  return (
    <div>
      <p className="reviewer-name">
        {reviewerName}
        <span className="review-star-rating">{props.starRating} Stars</span>
      </p>
      <p className="review-body">{props.body}</p>
      <hr />
    </div>
  );
};

export default ReviewTile;
