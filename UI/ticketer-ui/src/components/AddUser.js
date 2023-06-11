import Reac, {useState} from 'react'
import {Link, useNavigate} from "react-router-dom";

export default function AddUser() {

    let navigate=useNavigate()

    const [user, setUser] = useState({
        username:"",
        password:"",
        email:""
    })
    
    const{username,password,email}=user

    const onInputChange=(e)=>{
        setUser({...user,[e.target.name]:e.target.value})
    };

    const onSubmit=(e)=>{
        e.preventDefault();
        
        const requestOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(user)

        };
        fetch('http://localhost:8080/v1/customer', requestOptions).then(navigate("/"));
        
        // navigate("/");

    }

  return <div className='container'>

    <div className='row'>
        <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
            <h2 className='text-center m-4'>Create User</h2>
            <form onSubmit={(e)=>onSubmit(e)}>
            <div className="mb-3">
                <label htmlFor="username" className="form-label">
                    Username
                </label>
                <input
                    type={"text"}
                    className="form-control"
                    placeholder='Enter user name'
                    name="username"
                    value={username}
                    onChange={(e)=>onInputChange(e)}
                ></input>
                  <label htmlFor="password" className="form-label">
                    Password
                </label>
                <input
                    type={"password"}
                    className="form-control"
                    placeholder='Enter user password'
                    name="password"
                    value={password}
                    onChange={(e)=>onInputChange(e)}
                ></input>
                  <label htmlFor="email" className="form-label">
                    Email
                </label>
                <input
                    type={"email"}
                    className="form-control"
                    placeholder='Enter user e-mail address'
                    name="email"
                    value={email}
                    onChange={(e)=>onInputChange(e)}
                ></input>
            </div>
            <button type="submit" className='btn btn-outline-primary'>Submit</button>
            <Link type="submit" className="btn btn-outline-danger mx-2" to="/" >Cancel</Link>
            </form>
        </div>
    </div>
  </div>

}
