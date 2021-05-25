import React from "react";
import { Route, Switch, BrowserRouter, Redirect } from "react-router-dom";
import "regenerator-runtime/runtime";
import { hot } from "react-hot-loader/root";
import TrailsList from "./TrailsList.js";
import NavBar from "./Navbar.js";
import ReviewForm from "./ReviewForm.js";


const App = (props) => {
  return (
    <BrowserRouter>
      <NavBar />
      <ReviewForm />
      <Switch>
        <Route exact path="/trails" component={TrailsList} />
        <Route exact path="/trails/{id}/new" component={ReviewForm} />
      </Switch>
    </BrowserRouter>
  );
};
export default hot(App);
