import React from "react"
const Navbar = props => {
  return (

    <div id= "nav">
    <a href="/" className="brand">
          <h1>Seattle Trails</h1>
        </a>

      <ul>
        <li>
          <a href="/trails">HOME</a>
        </li>
        <li>
          <a href="/aboutUs">ABOUT US</a>
        </li>


        </ul>

    </div>


    )
  }
export default Navbar