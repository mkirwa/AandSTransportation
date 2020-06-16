import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";
import makeStyles from "@material-ui/core/styles";

class FormUserDetails extends Component {
  handleValidation = () => {
    const {
      firstName,
      lastName,
      streetAddress,
      email,
      apt,
      city,
      state,
      zipCode,
      sSN,
      drivingLicense,
      age,
    } = this.state;
  };

  continue = (e) => {
    e.preventDefault();
    //this is where we will process our forms
    //send the data to the back end platform firebase php blah blah blha
    this.props.nextStep();
  };

  render() {
    //pulling values from the props in continue
    //doing this so you can use values as a variable
    const { values, handleChange, errors } = this.props;

    return (
      <div className="box-container">
        <MuiThemeProvider>
          <React.Fragment>
            <div style={style}>
              <TextField
                error
                id="filled-error-helper-text"
                label="error"
                hintText="Enter Your First Name"
                floatingLabelText="First Name"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input

                onChange={handleChange("firstName")}
                defaultValue={values.firstName}
                HelperText="Incorrect entry"
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Last Name"
                floatingLabelText="Last Name"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("lastName")}
                defaultValue={values.lastName}
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Email"
                floatingLabelText="Email"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("email")}
                defaultValue={values.email}
              />
            </div>

            <RaisedButton
              label="Continue"
              primary={true}
              style={styles.button}
              onClick={this.continue}
            />
          </React.Fragment>
        </MuiThemeProvider>
      </div>
    );
  }
}

const styles = {
  button: {
    margin: 15,
  },
};

const style = {
  display: "flex",
  justifyContent: "center",
  alignItems: "center",
};

export default FormUserDetails;
