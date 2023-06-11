import './App.css';
import { Component } from 'react';
import Users from './components/Users';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import AddUser from './components/AddUser';

class App extends Component{

  constructor(){
    super()
    this.getAllUsers()
  }

  state = {
    users: [],
  }

  getAllUsers = () => {
    fetch("http://localhost:8080/v1/admin/customer/getAll").then(response => {
      if(response.status == 200){
          console.log("git")
          return response.json();
      }
        throw response;
    }
    ).then(response => {
      this.setState({
        users: response,
        balans: 5
      }) 
    }).catch(err => {
      console.error("Sorry, problem with connection" + err)
    })
  }
  
  render(){
    return(
        <div>
          <Router>
          <Navbar/>
          <Routes>
            <Route exact path="/" element={<Users users = {this.state.users}/>}/>
            <Route exact path="/adduser" element={<AddUser/>}/>
          </Routes>
          </Router>
        </div>
    )
  }
}
export default App;
