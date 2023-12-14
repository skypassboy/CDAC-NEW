import { useState } from "react";

let LoginForm = () => {
    const [update, setUpdate] = useState("Welcome");

    return (
        <div>
            <form>
                <label htmlFor="">Username :</label>
                <input type="text" id="Username" />
                <label htmlFor="">Password :</label>
                <input type="password" />
                <input
                    type="submit"
                    onClick={(e) => {
                        e.preventDefault();
                        let user = document.getElementById("Username").value;
                        setUpdate(`Welcome ${user}`);
                    }}
                    
                />
                <h1>{update} </h1>
            </form>
        </div>
    );
};

export default LoginForm