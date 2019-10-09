import React, { Component } from "react";
import FormSearch from "./formsearch";
import { Button } from "react-bootstrap";
//import Dropdown from "./dropdown";

class NavBar extends Component {
  render() {
    return (
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark ">
        <a className="navbar-brand mr-auto mr-lg-0" href="#">
          Home
        </a>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <a className="nav-link" href="/loads">
                Loads<span className="sr-only">(current)</span>
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/users">
                Users
              </a>
            </li>

            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                id="navbarDropdown"
                role="button"
                data-toggle="dropdown"
                aria-haspopup="true"
                aria-expanded="false"
              >
                Add User
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="/admin">
                  Admin
                </a>
                <a class="dropdown-item" href="/accountant">
                  Accountant
                </a>
                <a class="dropdown-item" href="/dispatch">
                  Dispatch
                </a>
                <a class="dropdown-item" href="/drivers">
                  Driver
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">
                  Something else here
                </a>
              </div>
            </li>
          </ul>
        </div>
        <FormSearch
          handleSubmit={this.handleSubmit}
          handleInputChange={this.handleInputChange}
        />
      </nav>
    );
  }
}

export default NavBar;
//Stateless Functional Component
//const NavBar = ({totalCounters}) =>{
//return (
// <nav className="navbar navbar-light bg-light">
// <a className="navbar-brand" href="#">
// Navbar <span className="badge badge-pill badge-secondary">
//{totalCounters}</span>
//</a>
//</nav>
///);
//};

//export default NavBar;

//<MenuItem value="firstName" primaryText="First Name"/>
//<MenuItem value="lastName" primaryText="Last Name"/>
//<MenuItem value="email" primaryText="Email"/>
//<MenuItem value="password" primaryText="Password"/>

//<Dropdown as={ButtonGroup}>
///////////<Button variant="success">Split Button</Button>

//<Dropdown.Toggle
// split
// variant="success"
// id="dropdown-split-basic"
//  />

//<Dropdown.Menu>
// <Dropdown.Item href="#/action-1">Action</Dropdown.Item>
//<Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
//<Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
//</Dropdown.Menu>
//</Dropdown>

//import {
//import { Dropdown } from 'dropdown.js';
//import Accountant from './accountant';
//Dropdown,
// DropdownMenu,
//DropdownToggle,
// ButtonGroup,
//// DropdownItem
//} from "reactstrap";
