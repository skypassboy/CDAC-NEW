import { useState } from "react"
import { Navigate, useNavigate } from "react-router-dom";
let LocalStorageSet = () => {
    let Navigate = useNavigate();
    return (

        <div>
            <label htmlFor="name">Enter Name :</label>
            <input type="text" id="name" />
            <button id="btn" onClick={() => {
                let data = JSON.stringify(document.getElementById("name").value);
                localStorage.setItem("name", data);
                // will take you to that url
                // Navigate("/react_routing_get");
            }}>Submit</button>
        </div>



    )

}

export default LocalStorageSet;