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
      <main role="main" className="container">
        <div className="d-flex align-content-center">
          <MuiThemeProvider>
            <React.Fragment>
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
              <br />
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
              <br />
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
              <br />
              <RaisedButton
                label="Continue"
                //makes the button blue
                primary={true}
                style={styles.button}
                //we put contiue up above and what contiunue does
                //is call the next step of userForm and we do that through
                //props
                onClick={this.continue}
              />
            </React.Fragment>
          </MuiThemeProvider>
        </div>
      </main>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default FormUserDetails;
