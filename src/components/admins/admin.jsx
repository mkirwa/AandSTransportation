import React, { Component } from "react";
import NavBar from "../navbar";
import Allcomponents from "../allcomponents";
import { Button } from "react-bootstrap";
import Counter from "../counter";

//import "./App.css";

//from this page, I will be adding users.
//Add drivers
//Add dispatch
//add admin
//

class Admin extends Component {
  render() {
    return (
      <div>
        <NavBar />
        <h1>This is the admin page</h1>
      </div>
    );
  }
}

export default Admin;
