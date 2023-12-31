import { joinPaths } from "@remix-run/router";
import { useEffect, useState } from "react"

let RestApi = () => {


    const [fetcheddata, setData] = useState([]);

    useEffect(() => {
        let url = "https://jsonplaceholder.typicode.com/users"
        fetch(url)
            .then((resp) => { console.log(JSON.stringify(resp)); return resp.json() })
            .then((data) => setData(data))
    }, [])



    return (

        <div>
            {/* {console.log({fetcheddata})} */}
            <table className="table table-bordered">
                <thead >
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Username</th>
                        <th>Email</th>
                        <th>Zipcode</th>
                    </tr>
                </thead>
                {
                    fetcheddata.map((el) => {
                        return (

                            <tr >
                                <td>{el.id}</td>
                                <td>{el.name}</td>
                                <td>{el.username}</td>
                                <td>{el.email}</td>
                                <td>{el.address.zipcode}</td>
                            </tr>

                        )
                    })
                }

            </table>
        </div>

    )

}

export default RestApi;