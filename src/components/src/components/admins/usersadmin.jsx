import React, { Component } from "react";
import NavBarAdmin from "./navbaradmin";

class UsersAdmin extends Component {
  state = {};
  render() {
    return (
      <div>
        <NavBarAdmin />
        <div style={style}>
          <h4>Users</h4>
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

export default UsersAdmin;
