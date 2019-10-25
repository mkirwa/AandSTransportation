import React, { Component } from "react";
import NavBarAdmin from "./navbaradmin";

class LoadsAdmin extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <div style={style}>
          <h4>Loads</h4>
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

export default LoadsAdmin;
