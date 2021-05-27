import React from "react"

const DeveloperTile = props => {

    return (
        <div class = "devCards">
            <h2 class = "devName">{props.devName}</h2>
            <img class = "devImg" src = {props.devImg}></img>
            <p class="aboutDev">{props.aboutDev}</p>
        </div>
    )
}

export default DeveloperTile