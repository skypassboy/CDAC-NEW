import { useState, useReducer } from "react"

//info - about one emp, initial state
const init = {
    EMPNO: 0,
    ENAME: "",
    SAL: 0,
    DEPTNO: ""
}

const reducer = (state, action) => {
    switch (action.type) {
        case 'update':
            //partial updation
            //get the current state and modify only the mentioned field
            return { ...state, [action.fld]: action.val }
        case 'reset':
            return init;
    }
}

let FormValidation = () => {

    const [emp, dispatch] = useReducer(reducer, init);
    const [msg, setMsg] = useState("")
    const submitData = (e) => {
        //default behavior submit - cancelling
        e.preventDefault();
        const reqData = {
            method: "POST",
            headers: {
                "content-type": "application/json"
            },
            body: JSON.stringify({
                "eno": emp.EMPNO,
                "enm": emp.ENAME,
                "sal": emp.SAL,
                "dpt": emp.DEPTNO
            })

        }
        fetch("http://localhost:9000/insertemp", reqData)
            .then((res) => { res.text() })
            .then((str) => { setMsg(str) })
        console.log(JSON.stringify(emp));
    }

    return (
        <div>
            <h1> Emp Form </h1>
            <form>
                Empid : <input type="number" name="EMPNO"
                    value={emp.EMPNO}
                    onChange={(e) => { dispatch({ type: 'update', fld: "EMPNO", val: e.target.value }) }} />
                <br />

                Ename : <input type="text" name="ENAME"
                    value={emp.ENAME}
                    onChange={(e) => { dispatch({ type: 'update', fld: "ENAME", val: e.target.value }) }} />
                <br />

                Salary : <input type="number" name="SAL"
                    value={emp.SAL}
                    onChange={(e) => { dispatch({ type: 'update', fld: "SAL", val: e.target.value }) }} />
                <br />

                Dept : <input type="text" name="DEPTNO"
                    value={emp.DEPTNO}
                    onChange={(e) => { dispatch({ type: 'update', fld: "DEPTNO", val: e.target.value }) }} />
                <br />

                <input type="submit" value="Insert"
                    onClick={(e) => { submitData(e) }} />
                <input type="reset" value="Clear"
                    onClick={() => { dispatch({ type: "reset" }) }} />
            </form>
            <p> {JSON.stringify(emp)} </p>
            <p>{msg}</p>
        </div>
    )
}
export default FormValidation;