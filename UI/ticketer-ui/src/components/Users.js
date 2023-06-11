const Users = (props) =>{
    
    
    const createUser = () =>{
        console.log("Bedzie create")
        
    }

    const thStyle = {
        backgroundColor: 'grey',
        border: '1px solid #ddd',
        borderCollapse: 'collapse',
        width: '100%',
        padding: '8px'
    }
    const tableStyle = {
        border: '1px solid #ddd',
        borderCollapse: 'collapse',
        width: '100%',
        padding: '8px'
    }
    const buttonConfirmStyle = {
        backgroundColor: 'green',
        borderCollapse: 'collapse',
        border: 'none',
        textAlign: 'center',
        fontSize: '16px',
        margin: '4px 2px',
        cursor: "pointer",
        color: "white"
    }
    const buttonAlertStyle = {
        backgroundColor: 'red',
        borderCollapse: 'collapse',
        border: 'none',
        textAlign: 'center',
        fontSize: '16px',
        margin: '4px 2px',
        cursor: "pointer",
        color: "white"
    }
    const users = props.users.map(user => (
      
        <tr key={user.id} style={tableStyle}>
              <td style={tableStyle}>{user.username}</td>
              <td style={tableStyle}>{user.password}</td>
              <td style={tableStyle}><button onClick={(e) => {
                console.log("Deleting ... " + user.id)
                const url = "http://localhost:8080/v1/customer/" + user.id;
                fetch(url, {method: 'DELETE'})
                .then((response) => {
                    if(!response.ok) {
                        throw new Error('Something went wrong during delete operation')
                    }
                    window.location.reload();
                })
              }} style={buttonAlertStyle}>Delete</button></td>
              <td style={tableStyle}><button style={buttonConfirmStyle}>Edit</button></td>
        </tr>
       ))
       
    return(
        <table style={tableStyle}>
            <tr>
                <th style={thStyle}>
                    Name
                </th>
                <th style={thStyle}>
                    Password
                </th>
                <th style={thStyle}>
                    delete
                </th>
                <th style={thStyle}>
                    edit
                </th>
            </tr>
                {users}
        </table>
    ) 
}
export default Users;