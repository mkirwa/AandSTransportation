import React, { Component } from "react";
import FormPersonalDetails from "../userforms/formpersonaldetails";

import UserForm from "../userforms/userform";
import DispatchNavbar from "./dispatchnavbar";

class DispatchLoad extends Component {
  render() {
    return (
      <div>
        <DispatchNavbar />
        <div style={style}>
          <h4>Dispatch Load</h4>
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

export default DispatchLoad;
