import React from "react";

const DeveloperTile = (props) => {
  return (
    <div className="devCards">
      <h2 className="devName">{props.devName}</h2>
      <img className="devImg" src={props.devImg}></img>
      <p className="aboutDev">{props.aboutDev}</p>
    </div>
  );
};

export default DeveloperTile;
