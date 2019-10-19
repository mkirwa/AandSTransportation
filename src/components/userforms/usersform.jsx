import React, { Component } from "react";
import FormControl from "react-bootstrap/lib/FormControl";

class UsersForm extends Component {
  render() {
    return (
      <main>
        <div>
          <br />
          <form className>
            <div className="form-row">
              <div className="col-md-5 mb-3">
                <input
                  type="text"
                  className="form-control"
                  placeholder="First name"
                />
              </div>
              <div className="col-md-5 mb-3">
                <input
                  type="text"
                  className="form-control"
                  placeholder="Last name"
                />
              </div>
            </div>
          </form>
        </div>
      </main>
    );
  }
}

const styles = {
  button: {
    margin: 15
  }
};

export default UsersForm;
