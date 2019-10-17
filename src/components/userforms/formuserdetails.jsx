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
    const { values, handleChange } = this.props;
    return (
      <MuiThemeProvider>
        <React.Fragment>
          <AppBar title="Enter User Details" />
          <TextField
            hintText="Enter Your First Name"
            floatingLabelText="First Name"
            //How react works, everytime the textfield changes
            //everytime we type in it, it will fire off an event
            //of onChange.....You will have firstName in brackets coz
            //handleChange takes in an input
            onChange={handleChange("firstName")}
            defaultValue={values.firstName}
          />
        </React.Fragment>
      </MuiThemeProvider>
    );
  }
}

export default FormUserDetails;
