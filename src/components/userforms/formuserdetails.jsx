import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";

class FormUserDetails extends Component {
  continue = e => {
    //prevent default
    e.preventDefault();
    this.props.nextStep();
  };

  render() {
    //pulling values from the props in continue
    //doing this so you can use values as a variable
    const { values } = this.props;
    return (
      <MuiThemeProvider>
        <React.Fragment>
          <AppBar title="Enter User Details" />
          <TextField
            hintText="Enter Your First Name"
            floatingLabelText="First Name"
          />
        </React.Fragment>
      </MuiThemeProvider>
    );
  }
}

export default FormUserDetails;
