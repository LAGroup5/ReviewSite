import React from "react"

const DeveloperTile = props => {

    return (
        <div>
            <h2>{props.devName}</h2>
            <img src = {props.devImg}></img>
            <p>{props.aboutDev}</p>
        </div>
    )
}

export default DeveloperTile