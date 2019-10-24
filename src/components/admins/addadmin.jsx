import React, { Component } from "react";
import UserForm from "../userforms/userform";
import UsersForm from "../userforms/usersform";
import NavBarAdmin from "./navbaradmin";

class AddAdmin extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <div style={style}>
          <h4>Add Admin</h4>
        </div>
        <UserForm />
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

export default AddAdmin;

//In this page, I have to create
// <UsersForm />
