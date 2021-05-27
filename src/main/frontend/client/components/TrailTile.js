import React from "react";
import { Link } from "react-router-dom";

const TrailTile = (props) => {
  let familySafe;
  if (props.familyFriendly) {
    familySafe = "Yes";
  } else {
    familySafe = "No";
  }

  let petSafe;
  if (props.petFriendly) {
    petSafe = "Yes";
  } else {
    petSafe = "No";
  }

  let difficulty;
  if (props.difficultyRating === 1) {
    difficulty = "easy";
  } else if (props.difficultyRating === 2) {
    difficulty = "intermediate";
  } else {
    difficulty = "advanced";
  }

  return (
    <div>
      <table>
        <colgroup>
          <col style={{ width: 300 }}></col>
          <col style={{ width: 150 }}></col>
          <col style={{ width: 150 }}></col>
          <col style={{ width: 150 }}></col>
        </colgroup>
        <tbody>
          <tr>
            <td>
              <Link to={`/trails/${props.id}`}>{props.trailName}</Link>
            </td>
            <th className="family-safe, trail-column-style">{familySafe}</th>
            <th className="pet-safe, trail-column-style">{petSafe}</th>
            <th className="difficulty-style, trail-column-style">
              {difficulty}
            </th>
          </tr>
        </tbody>
      </table>
    </div>
  );
};
export default TrailTile;
