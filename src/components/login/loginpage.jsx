import React, { Component } from "react";
//import LoginBox from "./loginbox";

class LoginPage extends Component {
  state = {};
  render() {
    return (
      <div className="root-container">
        <div className="box-controller">
          <div className="controller">Login</div>
          <div className="controller">Register</div>
        </div>
        <div className="box-container"></div>
      </div>
    );
  }
}

class LoginBox extends React.Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    <div className="inner-container">
      <div className="box"></div>
    </div>;
  }
}

export default LoginPage;
