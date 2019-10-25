import React, { Component } from "react";
import NavBarDriver from "./navbardriver";
import FormPersonalDetails from "../userforms/formpersonaldetails";

import UserForm from "../userforms/userform";

class Drivers extends Component {
  state = {};
  render() {
    return (
      <div>
        <NavBarDriver />
        <UserForm />
        <FormPersonalDetails />
      </div>
    );
  }
}

export default Drivers;
