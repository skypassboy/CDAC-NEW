import { useState, useReducer } from "react";

const init = {
  email: "",
  password: "",
  gender: "",
  city: ""
};

const reducer = (state, action) => {
  switch (action.type) {
    case "update":
      //partial updation
      //get the current state and modify only the mentioned field
      return { ...state, [action.fld]: action.val };
    case "reset":
      return init;
  }
};

let RegForm = () => {
  const [user, dispatch] = useReducer(reducer, init);
  const [flag, setFlag] = useState(false);
  const submitData = (e) => {
    e.preventDefault();
    if (flag == true) {
      console.log(JSON.stringify(user));
      document.getElementById("head").innerText = JSON.stringify(user) + "";
    } else {
      document.getElementById("head").innerText = "Not agreed Terms...!";
    }
  };

  return (
    <div>
      <form action="">
        <label htmlFor="email">Email :</label>
        <input
          type="email"
          id="email"
          value={user.email}
          onChange={(e) => {
            dispatch({ type: "update", fld: "email", val: e.target.value });
          }}
        />

        <label htmlFor="password">Password :</label>
        <input
          type="password"
          id="password"
          value={user.password}
          onChange={(e) => {
            dispatch({ type: "update", fld: "password", val: e.target.value });
          }}
        />
        <br />

        <label htmlFor="gender">Gender : </label>

        <input
          type="radio"
          name="gender"
          value="male"
          id="male"
          onClick={(e) => {
            dispatch({ type: "update", fld: "gender", val: "male" });
          }}
        />
        <label htmlFor="Male">Male</label>

        <input
          type="radio"
          value="female"
          name="gender"
          id="female"
          onClick={(e) => {
            dispatch({ type: "update", fld: "gender", val: "female" });
          }}
        />
        <label htmlFor="Female">Female</label>
        <br />
        <label htmlFor="select">Select City :</label>
        <select
          name="select"
          id="select"
          onChange={(e) => {
            dispatch({ type: "update", fld: "city", val: e.target.value });
          }}
        >
          <option value="Select City">Select City</option>
          <option value="Kolhapur">Kolhapur</option>
          <option value="Pune">Pune</option>
          <option value="Mumbai">Mumbai</option>
        </select>
        <br />

        <input
          type="checkbox"
          id="agree"
          checked={flag}
          onClick={() => {
            setFlag(!flag);
          }}
        />
        <label htmlFor="agree">If Agree Tick </label>
        <br />
        <input
          type="submit"
          value="Insert"
          onClick={(e) => {
            submitData(e);
          }}
        />
      </form>
      <h2 id="head"></h2>
    </div>
  );
};

export default RegForm;
