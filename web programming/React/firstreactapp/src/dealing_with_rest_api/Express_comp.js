import { useEffect, useState } from "react"

let ExpressComp = () => {


    const [fetcheddata, setData] = useState([]);

    useEffect(() => {
        let url = "http://localhost:9000/emp"
        fetch(url)
            .then((resp) => { console.log(JSON.stringify(resp)); return resp.json() })
            .then((data) => setData(data))
    }, [])

    // useEffect(() => {
    //     let url = "http://localhost:9001/employee";

    //     fetch(url)
    //         .then((resp) => {
    //             if (!resp.ok) {
    //                 throw new Error(`Network response was not ok: ${resp.status}`);
    //             }
    //             return resp.json();
    //         })
    //         .then((data) => setData(data))
    //         .catch((error) => console.error("Fetch error:", error));
    // }, []);

    return (

        <div>
            <table className="table table-bordered">
                <thead >
                    <tr>
                        <th>Emp No</th>
                        <th>Name</th>
                        <th>Job</th>
                        <th>Hire Date</th>
                        <th>Salary</th>
                        <th>Dept No</th>
                    </tr>
                </thead>
                {
                    fetcheddata.map((el) => {
                        return (

                            <tr >

                                <td>{el.EMPNO}</td>
                                <td>{el.ENAME}</td>
                                <td>{el.JOB}</td>
                                <td>{el.HIREDATE}</td>
                                <td>{el.SAL}</td>
                                <td>{el.DEPTNO}</td>
                            </tr>

                        )
                    })
                }

            </table>
        </div>

    )

}

export default ExpressComp;