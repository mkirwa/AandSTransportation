import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";

class FormPersonalDetails extends Component {
  continue = e => {
    //prevent default
    e.preventDefault();
    this.props.nextStep();
  };

  back = e => {
    //prevent default
    e.preventDefault();
    this.props.prevStep();
  };

  render() {
    const { values, handleChange } = this.props;
    return (
      <MuiThemeProvider>
        <React.Fragment>
          <AppBar title="Enter Personal Details" />
          <TextField
            hintText="Enter Your Your Occupation"
            floatingLabelText="First Occupation"
            //How react works, everytime the textfield changes
            //everytime we type in it, it will fire off an event
            //of onChange.....You will have firstName in brackets coz
            //handleChange takes in an input
            onChange={handleChange("occupation")}
            defaultValue={values.occupation}
          />
          <br />
          <TextField
            hintText="Enter Your City"
            floatingLabelText="City"
            //How react works, everytime the textfield changes
            //everytime we type in it, it will fire off an event
            //of onChange.....You will have firstName in brackets coz
            //handleChange takes in an input
            onChange={handleChange("city")}
            defaultValue={values.city}
          />
          <br />
          <TextField
            hintText="Enter Your Bio"
            floatingLabelText="Bio"
            //How react works, everytime the textfield changes
            //everytime we type in it, it will fire off an event
            //of onChange.....You will have firstName in brackets coz
            //handleChange takes in an input
            onChange={handleChange("bio")}
            defaultValue={values.bio}
          />
          <br />
          <RaisedButton
            label="Continue"
            primary={true}
            style={styles.button}
            //we put contiue up above and what contiunue does
            //is call the next step of userForm and we do that through
            //props
            onClick={this.continue}
          />
          <RaisedButton
            label="Back"
            //makes the button a white
            primary={false}
            style={styles.button}
            //we put contiue up above and what contiunue does
            //is call the next step of userForm and we do that through
            //props
            onClick={this.back}
          />
        </React.Fragment>
      </MuiThemeProvider>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default FormPersonalDetails;
