import React, { Component } from "react";
import Loads from "../loads";

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
  //event parameter attached to it
  handleChange = input => e => {
    //take whatever the input is
    //set it to whatever the value is
    //we can get that using the event parameter and using target.value
    //be it firstName, lastName, whatever value is entered
    this.setState({ [input]: e.target.value });
  };

  //figure out what step we are on and depending on what step we are on
  //that's going to decide on which component we want to display
  render() {
    //pull the step out of the state by destructuring
    const { step } = this.state;
    const { firstName, lastName, email, occupation, city, bio } = this.state;
    //this is how we can pass the values into the components and
    //render them into the inputs
    const values = { firstName, lastName, email, occupation, city, bio };

    return <div>This is the user form</div>;
  }
}

export default UserForm;
