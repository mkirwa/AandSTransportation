import React, { Component } from "react";
import UserForm from "../userforms/userform";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";

import NavBarAdmin from "./navbaradmin";
import RaisedButton from "material-ui/RaisedButton";

class AddAdmin extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <div style={style}>
          <h4>Add Admin</h4>
        </div>
        <UserForm />
        <div style={style}>
          <MuiThemeProvider>
            <RaisedButton
              label="Send Email"
              //makes the button blue
              primary={true}
              //we put contiue up above and what contiunue does
              //is call the next step of userForm and we do that through
              //props
              //onClick it should be sending an email
              //onClick={this.continue}
            />
          </MuiThemeProvider>
        </div>
      </div>
    );
  }
}

const style = {
  display: "flex",
  justifyContent: "center",
  alignItems: "center",
  margin: "30px auto"
};

export default AddAdmin;

//In this page, I have to create
// <UsersForm />
