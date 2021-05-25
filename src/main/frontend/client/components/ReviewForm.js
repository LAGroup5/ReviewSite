import React, { useState, useEffect } from "react"
import _ from "lodash"

const ReviewForm = props => {
  const defaultFormValues = {
    name: "",
    rating: "",
    review: ""

   }
   const [newReview, setNewReview] = useState(defaultFormValues)
   const [formSubmitted, setFormSubmitted] = useState(false)

   const handleChange = event => {
      setNewReview({
        ...newReview,
        [event.currentTarget.name]: event.currentTarget.value
      })
     }

   const handleSubmit = event => {
       event.preventDefault()
       addNewReview(newReview)
     }

     const clearForm = () => {
       setNewReview(defaultFormValues)
     }

     if (!formSubmitted) {
         return (
           <form className="new-review" onSubmit={handleSubmit}>
           <label htmlFor="name">
           Your Name:
          <input name="name" id="name" type="text" value={newReview.name} onChange={handleChange} />
           </label>
          <label htmlFor="rating">
          Rating:
          <input
            type="text"
            name="rating"
            id="rating"
            value={newReview.rating}
            onChange={handleChange}
          />
        </label>

        <label htmlFor="review">
          Review:
        <input
            type="text"
            name="review"
            id="review"
            value={newReview.rating}
            onChange={handleChange}
          />
        </label>


        <div>
          <input className="button" type="submit" value="Submit Review" />
        </div>
      </form>
         )
     }
    }

  export default ReviewForm