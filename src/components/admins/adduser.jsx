import React, { Component } from "react";
import UserForm from "../userforms/userform";
import UsersForm from "../userforms/usersform";
import NavBarAdmin from "./navbaradmin";

class Adduser extends Component {
  render() {
    return (
      <div>
        <NavBarAdmin />
        <UserForm />
        <UsersForm />
      </div>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default Adduser;

//In this page, I have to create
