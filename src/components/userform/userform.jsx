import React, { Component } from "react";

class UserForm extends Component {
  state = {
    step: 1,
    firstName: "",
    lastName: "",
    email: ""
  };
  render() {
    return <div>This is the user form</div>;
  }
}

export default UserForm;
