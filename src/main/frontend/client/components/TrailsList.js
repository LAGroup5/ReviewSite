import React, { useState, useEffect } from "react";
import TrailTile from "./TrailTile.js";

const TrailsList = (props) => {
  const [trails, setTrails] = useState([]);
  const getTrails = async () => {
    try {
      const response = await fetch("/api/v1/trails");
      if (!response.ok) {
        const errMessage = `${response.status} (${response.statusText})`;
        const err = new Error(errMessage);
        throw err;
      }
      const responseBody = await response.json();
      setTrails(responseBody);
    } catch (err) {
      console.error(`Could not complete data fetch.`);
    }
  };

  useEffect(() => {
    getTrails();
  }, [props]);

  const trailObjects = trails.map((trail) => {
    return (
      <TrailTile
        key={trail.id}
        id={trail.id}
        trailName={trail.name}
        difficultyRating={trail.difficulty}
        familyFriendly={trail.familyFriendly}
        petFriendly={trail.petFriendly}
        description={trail.description}
      />
    );
  });

  return (
    <div className= "trails-table">
      <table>
        <colgroup>
          <col style={{ width: 300 }}></col>
          <col style={{ width: 150 }}></col>
          <col style={{ width: 150 }}></col>
          <col style={{ width: 150 }}></col>
        </colgroup>
        <thead>
          <tr>
            <th className="trail-head-style, trail-head-left">Trail Name</th>
            <th className="trail-head-style">Family Friendly</th>
            <th className="trail-head-style">Pet Friendly</th>
            <th className="trail-head-style">Difficulty</th>
          </tr>
        </thead>
      </table>
      {trailObjects}
    </div>
  );
};

export default TrailsList;
