import React from "react";
import { Route, Switch, BrowserRouter, Redirect } from "react-router-dom";
import "regenerator-runtime/runtime";
import TrailsList from "./TrailsList.js";
import NavBar from "./Navbar.js";
import ReviewForm from "./ReviewForm.js";
import { hot } from "react-hot-loader/root";
import TrailShow from "./TrailShow.js";

const App = (props) => {
  return (
    <BrowserRouter>
      <NavBar />
      <ReviewForm />
      <Switch>
        <Route exact path="/trails" component={TrailsList} />
        <Route exact path="/trails/:id" component={TrailShow} />
        <Route exact path="/trails/:id/review" component= {ReviewForm} />
      </Switch>
    </BrowserRouter>
  );
};
export default hot(App);
