import React from "react"
import { Link } from "react-router-dom"

const ReviewTile = props => {
  return (
    <div>
        <p class="reviewer-name">{props.reviewName}</p>
        <p class="review-star-rating">{props.starRating}</p>
        <p class="review-text">{props.review}</p>
        <br/>
    </div>
  )
}

export default ReviewTile