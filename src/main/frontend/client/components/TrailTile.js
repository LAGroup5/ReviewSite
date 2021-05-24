import React from "react"
import { Link } from "react-router-dom"

const TrailTile = props => {
    let familySafe
    if(props.familyFriendly) {
        familySafe = "Yes"
    }else {
        familySafe= "No"
    }

    let petSafe
    if(props.petFriendly) {
       petSafe = "Yes"
    }else {
        petSafe= "No"
    }

    let difficulty
    if(props.difficultyRating == 1){
        difficulty = "easy"
    } else if(props.difficultyRating == 2){
        difficulty = "intermediate"
    } else {
        difficulty = "advanced"
    }

    return (
        <div>
            <h2><Link to={`/trails/${id}`}>{props.trailName}</Link></h2>
            <p>Family Friendly: {familySafe} </p>
            <p>Pet Friendly: {petSafe}</p>
            <p>Difficulty: {difficulty}</p>
            <br/>
        </div>
    )

}
export default TrailTile