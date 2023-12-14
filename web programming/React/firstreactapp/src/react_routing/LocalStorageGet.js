import { useEffect, useState } from "react"

let LocalStorageGet = () => {

    const [nm, setName] = useState("");
    useEffect(() => {
        let n = JSON.parse(localStorage.getItem("name"));
        setName(n);
    }, [])
    return (

        <div>{

            <h1>{nm}</h1>

        }
        </div>



    )

}

export default LocalStorageGet;