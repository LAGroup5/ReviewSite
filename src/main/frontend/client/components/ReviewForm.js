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
        <label htmlFor="rating">
          Rating:
          </label>
          <input
            type="text"
            name="starRating"
            id="starRating"
            value={newReview.starRating}
            onChange={handleChange}
          />
          </div>


<div className="inputGroup">
        <label htmlFor="body"><br />
          Review: <br/>
          </label>
        <textarea
            name="body"
            id="body"
            rows="5" cols="33"
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
