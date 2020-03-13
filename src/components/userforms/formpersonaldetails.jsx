import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";

class FormPersonalDetails extends Component {
  continue = e => {
    e.preventDefault();
    this.props.nextStep();
  };

  back = e => {
    e.preventDefault();
    this.props.prevStep();
  };
  render() {
    const { values, handleChange } = this.props;

    return (
      <div className="box-container">
        <MuiThemeProvider>
          <React.Fragment>
            <div style={style}>
              <TextField
                hintText="Enter Your Street Address"
                floatingLabelText="Street Address"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("streetAddress")}
                defaultValue={values.streetAddress}
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Apt Number"
                floatingLabelText="Apt"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("apt")}
                defaultValue={values.apt}
              />
            </div>

            <div style={style}>
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
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your State"
                floatingLabelText="State"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("state")}
                defaultValue={values.state}
              />
            </div>
            <div style={style}>
              <TextField
                hintText="Zip Code"
                floatingLabelText="Zip Code"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("zipCode")}
                defaultValue={values.zipCode}
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Social Security Number"
                floatingLabelText="Social Security Number"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("sSN")}
                defaultValue={values.sSN}
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Driving License Number"
                floatingLabelText="Driving License Number"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("drivingLicense")}
                defaultValue={values.drivingLicense}
              />
            </div>

            <div style={style}>
              <TextField
                hintText="Enter Your Age"
                floatingLabelText="Age"
                //How react works, everytime the textfield changes
                //everytime we type in it, it will fire off an event
                //of onChange.....You will have firstName in brackets coz
                //handleChange takes in an input
                onChange={handleChange("age")}
                defaultValue={values.age}
              />
            </div>

            <div style={style}>
              <RaisedButton
                label="Continue"
                primary={true}
                style={styles.button}
                //we put contiue up above and what contiunue does
                //is call the next step of userForm and we do that through
                //props
                onClick={this.continue}
              />
            </div>

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
      </div>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

const style = {
  display: "flex",
  justifyContent: "center",
  alignItems: "center"
};

export default FormPersonalDetails;
