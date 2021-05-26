import React from "react"

const DeveloperTile = props => {

    return (
        <div>
            <h2>{props.name}</h2>
            <img src = {props.imgUrl}></img>
            <p>{props.about}</p>
        </div>
    )
}

export default DeveloperTile