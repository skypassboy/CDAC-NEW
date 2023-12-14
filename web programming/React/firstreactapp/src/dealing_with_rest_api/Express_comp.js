import { useEffect, useState } from "react"

let ExpressComp = () => {


    const [fetcheddata, setData] = useState([]);

    useEffect(() => {
        let url = "http://localhost:9000/employee"
        fetch(url)
            .then((resp) => { console.log(JSON.stringify(resp)); return resp.json() })
            .then((data) => setData(data))
    }, [])



    return (

        <div>
            {console.log({ fetcheddata })}
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