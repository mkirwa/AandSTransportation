import React, { Component } from "react";
import NavBarAdmin from "./navbaradmin";
import AllDrivers from "../alldrivers";

class AdminAllAdmins extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <AllDrivers />
      </div>
    );
  }
}

export default AdminAllAdmins;
