import React, { Component } from "react";
import NavBar from "./navbar";
import Allcomponents from "./allcomponents";

import "../App.css";

class Admin extends Component {
  render() {
    return (
      <React.Fragment>
        <NavBar />

        <main className="container">
          <Allcomponents
            counters={this.state.allcomponents}
            onReset={this.handleReset}
            onIncrement={this.handleIncrement}
            onDelete={this.handleDelete}
          />
        </main>
      </React.Fragment>
    );
  }
}

export default Admin;
