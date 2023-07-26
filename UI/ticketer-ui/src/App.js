import './App.css';
import { Component } from 'react';
import Users from './components/Users';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import AddUser from './components/AddUser';
import HomePage from './components/HomePage';
import MyProfile from './components/MyProfile';

class App extends Component{
  
  render(){
    return(
        <div>
          <Router>
          <Navbar/>
          <Routes>
            <Route exact path="/" element={<HomePage/>} />
            <Route exact path="/profile" element={<MyProfile/>} />
            <Route exact path="/admin" element={<Users/>}/>
            <Route exact path="/adduser" element={<AddUser/>}/>
          </Routes>
          </Router>
        </div>
    )
  }
}
export default App;
