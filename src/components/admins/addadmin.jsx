import React, { Component } from "react";
import UserForm from "../userforms/userform";
import UsersForm from "../userforms/usersform";
import NavBarAdmin from "./navbaradmin";

class AddAdmin extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <UserForm />
      </div>
    );
  }
}

export default AddAdmin;

//In this page, I have to create
// <UsersForm />
