import React from "react"
import { Link } from "react-router-dom"

const ReviewTile = (props) => {
  return (
    <div>
      <p className="reviewer-name">{props.reviewerName}</p>
      <p className="review-star-rating">{props.starRating}</p>
      <p className="review-body">{props.body}</p>
      <br />
    </div>
  )
}

export default ReviewTile
