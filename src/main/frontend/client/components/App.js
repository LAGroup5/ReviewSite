import React from "react"

const App = props => {
  return (
   <BrowserRouter>
    <Switch>
      <Route exact path = "/">
        <Redirect to="/trails" />
      </Route>
      <Route exact path = "/trails" component = {TrailsList} />
    </Switch>
   </BrowserRouter>
  )
}