import React, { Component } from "react";
import LoginBox from './loginbox';

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

class LoginBox extends from React.Component{
  
}

export default LoginPage;
