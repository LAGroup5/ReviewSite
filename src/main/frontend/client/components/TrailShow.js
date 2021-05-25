import React, { useState, useEffect } from "react"
import { Link } from "react-router-dom"

const TrailShow = props => {
  const [trail, setTrail] = useState([])

  const getTrail = async () => {
    try {
      const trailId = props.match.params.id
      const response = await fetch(`/api/v1/trails${trailId}`)
      if (!response.ok) {
        const errorMessage = `${response.status} (${response.statusText})`
        const error = new Error(errorMessage)
        throw error
      }
      const responseBody = await response.json()
      setTrail(responseBody.trail)
    } catch (err) {
      console.error(`Error in Fetch: ${err.message}`)
    }
  }

  useEffect(() => {
    getTrail()
  }, [])

  let petFriendly
  if (trail.petFriendly) {
    petFriendly = "Yes"
  } else {
    petFriendly = "No"
  }

  let familyFriendly
  if (trail.familyFriendly) {
    familyFriendly = "Yes"
  } else {
    familyFriendly = "No"
  }

  let passesRequired
  if (trail.passesRequired) {
    passesRequired = "Pass Required For Entry"
  } else {
    passesRequired = "Free Entry, Np Pass Required"
  }

  return (
    <div>
      <div className="trail-show">
        <h1>{trail.name}</h1>
        <p>Difficulty Level: {trail.difficulty}</p>
        <ul className="no-bullet trail-details">
          <li>{trail.hikeLengthMiles} miles</li>
          <li>{trail.elevationGainFt} ft</li>
        </ul>
        <ul className="no-bullet">
          <li>Family Friendly: {familyFriendly}</li>
          <li>Pet Friendly: {petFriendly}</li>
          <li>{passesRequired}</li>
        </ul>
      <div>
      <div>
        <Link to={`/trails/${trail.id}/review`}>Add A Review</Link>
      </div>
      <div>
        <h2>Reviews</h2>
        <ul>
        </ul>
      </div>
    </div>
  )
}

export default TrailShow