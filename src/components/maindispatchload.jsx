import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";

class MainDispatchLoad extends Component {
  continue = e => {
    e.preventDefault();
    this.props.nextStep();
  };
  render() {
    const { values, handleChange } = this.props;
    return (
      <MuiThemeProvider>
        <div styles={styles}>
          <div style={style}>
            <h5>Pick Up Address</h5>
          </div>
        </div>

        <React.Fragment>
          <div style={style}>
            <TextField
              hintText="Company name"
              floatingLabelText="Company Name"
              //How react works, everytime the textfield changes
              //everytime we type in it, it will fire off an event
              //of onChange.....You will have firstName in brackets coz
              //handleChange takes in an input
              onChange={handleChange("occupation")}
              defaultValue={values.occupation}
            />
          </div>
          <div>
            <h4></h4>
          </div>

          <div style={style}>
            <TextField
              hintText="Enter Company Street Address"
              floatingLabelText="Street Address"
              //How react works, everytime the textfield changes
              //everytime we type in it, it will fire off an event
              //of onChange.....You will have firstName in brackets coz
              //handleChange takes in an input
              //onChange={this.handleChange("bio")}
              //defaultValue={values.bio}
            />
          </div>

          <div style={style}>
            <TextField
              hintText="Enter Suite Number"
              floatingLabelText="Suite Number"
              //How react works, everytime the textfield changes
              //everytime we type in it, it will fire off an event
              //of onChange.....You will have firstName in brackets coz
              //handleChange takes in an input
              //onChange={this.handleChange("bio")}
              //defaultValue={values.bio}
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
              //onChange={this.handleChange("bio")}
              //defaultValue={values.bio}
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
              //onChange={this.handleChange("bio")}
              //defaultValue={values.bio}
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
              //onChange={this.handleChange("bio")}
              //defaultValue={values.bio}
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
    );
  }
}

const styles = {
  margin: "30px auto"
};

const style = {
  display: "flex",
  justifyContent: "center",
  alignItems: "center"
};

export default MainDispatchLoad;
