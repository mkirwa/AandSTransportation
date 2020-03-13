import React, { Component } from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import { List, ListItem } from "material-ui/List";
import RaisedButton from "material-ui/RaisedButton";

class Confirm extends Component {
  continue = e => {
    //prevent default
    e.preventDefault();
    //this is where you would process your form
    //THIS IS WHERE YOU SEND THE DATA TO THE BACK END
    this.props.nextStep();
  };

  back = e => {
    //prevent default
    e.preventDefault();
    this.props.prevStep();
  };

  render() {
    //pulling values from the props in continue
    //doing this so you can use values as a variable
    const {
      values: {
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
        age
      }
    } = this.props;
    return (
      <div className="box-container">
        <MuiThemeProvider>
          <React.Fragment>
            <div className="header">Confirm User Data</div>
            <List>
              <ListItem primaryText="First Name" secondaryText={firstName} />
              <ListItem primaryText="Last Name" secondaryText={lastName} />
              <ListItem primaryText="Email" secondaryText={email} />
              <ListItem
                primaryText="Street Address"
                secondaryText={streetAddress}
              />
              <ListItem primaryText="Apartment" secondaryText={apt} />
              <ListItem primaryText="City" secondaryText={city} />
              <ListItem primaryText="State" secondaryText={state} />
              <ListItem primaryText="zipCode" secondaryText={zipCode} />
              <ListItem
                primaryText="Social Security Number"
                secondaryText={sSN}
              />
              <ListItem
                primaryText="Driving License"
                secondaryText={drivingLicense}
              />
              <ListItem primaryText="Age" secondaryText={age} />
            </List>

            <br />
            <RaisedButton
              label="Confirm & Continue"
              //makes the button blue
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
      </div>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default Confirm;
