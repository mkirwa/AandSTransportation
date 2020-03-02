import React, { Component } from "react";

class RegisterBox extends React.Component {
  usertypes = {
    //instead of hard coding all the counters in the render method
    //div section,
    //just use an array instead and render them using the map method
    //array will have counter objects
    //add a new property allcomponents
    // Use this to uniquely identify each
    //counter
    step: 1,
    label: "Driver",

    step: 2,
    label: "Admin",

    step: 3,
    label: "Dispatch",

    step: 4,
    label: "Accountant"
  };

  constructor(props) {
    super(props);
    this.setState = {};
  }

  submitRegister(e) {}

  render() {
    return (
      <div className="inner-container">
        <div className="header">Register</div>
        <div className="box">
          <div className="input-group">
            <label htmlFor="CompanyCode">Company Code</label>
            <input
              type="text"
              name="CompanyCode"
              className="login-input"
              placeholder="Company Code"
            />
          </div>

          <div className="input-group">
            <label htmlFor="RandomGeneratedCode">Random Generated Code</label>
            <input
              type="text"
              name="RandomGeneratedCode"
              className="login-input"
              placeholder="Random Generated Code"
            />
          </div>
          <div className="input-group">
            <label htmlFor="username">Username</label>
            <input
              type="text"
              name="username"
              className="login-input"
              placeholder="Username"
            />
          </div>

          <div className="input-group">
            <label htmlFor="email">Email</label>
            <input
              type="text"
              name="email"
              className="login-input"
              placeholder="Email"
            />
          </div>

          <div className="input-group">
            <label htmlFor="password">Password</label>
            <input
              type="text"
              name="password"
              className="login-input"
              placeholder="Password"
            />
          </div>

          <div className="input-group">
            <label htmlFor="password"> Confirm Password</label>
            <input
              type="password"
              name="password"
              className="login-input"
              placeholder="Password"
            />
            <button
              type="button"
              className="login-btn"
              onClick={this.submitRegister.bind(this)}
            >
              Register
            </button>
          </div>
        </div>
      </div>
    );
  }
}

export default RegisterBox;
