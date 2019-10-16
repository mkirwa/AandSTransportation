import React, { Component } from "react";

class UserForm extends Component {
  state = {
    step: 1,
    firstName: "",
    lastName: "",
    email: "",
    occupation: "",
    city: "",
    bio: ""
  };

  //has a method to proceed to the next step
  nextStep = () => {
    const { step } = this.state;
    this.setState({
      step: step + 1
    });
  };

  //go back to previous step
  prevStep = () => {
    const { step } = this.state;
    this.setState({
      step: step - 1
    });
  };

  //handle fields change
  //each input will have their own state which would be the firstName etc
  handleChange = input => e => {
    this.setState({ [input]: e.target.value });
  };

  render() {
    return <div>This is the user form</div>;
  }
}

export default UserForm;
