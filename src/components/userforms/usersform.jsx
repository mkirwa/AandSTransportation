import React, { Component } from "react";
import FormControl from "react-bootstrap/lib/FormControl";

class UsersForm extends Component {
  render() {
    return (
      <div>
        <br />
        <form className>
          <div className="form-row">
            <div className="col">
              <input
                type="text"
                className="form-control"
                placeholder="First name"
              />
            </div>
            <div>
              <input
                type="text"
                className="form-control"
                placeholder="Last name"
              />
            </div>
          </div>
        </form>
      </div>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default UsersForm;
