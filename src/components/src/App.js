import React from "react";
import MuiThemeProvider from "material-ui/styles/MuiThemeProvider";
import AppBar from "material-ui/AppBar";
import TextField from "material-ui/TextField";
import RaisedButton from "material-ui/RaisedButton";

import { Route, Switch } from "react-router-dom";
import NavBar from "./components/admins/navbaradmin";
import AddAdmin from "./components/admins/addadmin";
import AddDriver from "./components/admins/adddriver";
import AddAccountant from "./components/admins/addaccountant";
import AddDispatch from "./components/admins/adddispatch";
import LoadsAdmin from "./components/admins/loadsadmin";

import Dispatch from "./components/dispatchs/dispatch";
import Drivers from "./components/driver/drivers";
import Loads from "./components/loads";
import Users from "./components/users";
import Admin from "./components/admins/admin";
import Allcomponents from "./components/allcomponents";
import FormSearch from "./components/formsearch";
import UserForm from "./components/userforms/userform";
import UsersForm from "./components/userforms/usersform";
//import "../App.css";
import Accountant from "./components/accountants/accountant";
import UsersAdmin from "./components/admins/usersadmin";

class App extends Allcomponents {
  state = {
    //instead of hard coding all the counters in the render method
    //div section,
    //just use an array instead and render them using the map method
    //array will have counter objects
    //add a new property allcomponents
    // Use this to uniquely identify each
    //counter
    allcomponents: [
      //counter objects
      //we use id to uniquely identify each counter
      //value property sets the intial value for each counter
      { id: 1, value: 4 },
      { id: 2, value: 0 },
      { id: 3, value: 0 },
      { id: 4, value: 0 }
    ],
    step: 1,
    firstName: "",
    lastName: "",
    email: "",
    occupation: "",
    city: "",
    bio: ""
  };

  //has a method to proceed to the next step
  nextStep = () => {
    const { step } = this.state;
    this.setState({
      step: step + 1
    });
  };

  back = e => {
    //prevent default
    e.preventDefault();
    this.props.prevStep();
  };

  continue = e => {
    //prevent default
    e.preventDefault();
    this.props.nextStep();
  };

  //1st lifecycle hooks
  constructor(props) {
    super(props);
    console.log("App-Constructor", this.props);
  }

  //2nd lifecycle hooks
  //called after the component is rendered into the DOM
  //this is the perfect place to make Ajax calls to get data from the server

  componentDidMount() {
    //ajax call
    console.log("App-Constructor", this.props);
  }

  handleIncrement = counter => {
    //creating a new counters array and giving it
    //to the set state method and have react update
    //the state
    //... this is the spread operator clones
    //this.state.allcomponents
    //with these, you will get a new array of counters
    //the object in the new array(counters) are the same
    //objects we have in allcomponents
    const counters = [...this.state.allcomponents];
    const index = counters.indexOf(counter);
    counters[index] = { ...counter };
    counters[index].value++;
    this.setState({ allcomponents: counters });
  };

  handleReset = () => {
    //this.state.allcomponents - this refers to the existing
    //counters
    //we use the map method to get each counter and reset
    //its value to zero and then return it
    //this give you a new array of counters
    //You store them in counters.
    //
    const counters = this.state.allcomponents.map(c => {
      c.value = 0;
      return c;
    });
    //here you call this.setState with this new array
    this.setState({ allcomponents: counters });
  };

  handleDelete = counterId => {
    const counters = this.state.allcomponents.filter(c => c.id !== counterId);
    this.setState({ allcomponents: counters });
  };

  handleSubmit = event => {
    event.preventDefault();
    const data = this.state;
  };

  handleInputChange = event => {
    event.preventDefault();
    this.setState({ [event.target.name]: event.target.value });
  };

  handleChange = input => e => {
    //take whatever the input is
    //set it to whatever the value is
    //we can get that using the event parameter and using target.value
    //be it firstName, lastName, whatever value is entered
    this.setState({ [input]: e.target.value });
  };

  render() {
    //render method
    console.log("App-rendered");
    //const { search } = this.state;

    return (
      <React.Fragment>
        <main className="container">
          <Allcomponents
            counters={this.state.allcomponents}
            onReset={this.handleReset}
            onIncrement={this.handleIncrement}
            onDelete={this.handleDelete}
          />
        </main>
        <div className="content">
          <Switch>
            <Route path="/admins/admin" component={Admin} />
            <Route path="/accountants/accountant" component={Accountant} />
            <Route path="/admins/addadmin" component={AddAdmin} />
            <Route path="/admins/addaccountant" component={AddAccountant} />
            <Route path="/admins/adddispatch" component={AddDispatch} />
            <Route path="/admins/adddriver" component={AddDriver} />
            <Route path="/admins/loadsadmin" component={LoadsAdmin} />
            <Route path="/admins/usersadmin" component={UsersAdmin} />
            <Route path="/dispatchs/dispatch" component={Dispatch} />
            <Route path="/driver/drivers" component={Drivers} />
            <Route path="/formsearch" component={FormSearch} />
            <Route path="/loads" component={Loads} />
            <Route path="/navbar" component={NavBar} />
            <Route path="/users" component={Users} />
          </Switch>
        </div>
      </React.Fragment>
    );
  }
}

export default App;

//<NavBar
// totalCounters={
// this.state.allcomponents.filter(c => c.value > 0).length
// }
///>
