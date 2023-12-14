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
            <h1> Dummy data </h1>
            <table>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Zipcode</th>
                </tr>
                {
                    fetcheddata.map((el) => {
                        return (

                            <div>

                                <tr>
                                    <td>{el.id}</td>
                                    <td>{el.name}</td>
                                    <td>{el.username}</td>
                                    <td>{el.email}</td>
                                    <td>{el.address.zipcode}</td>
                                </tr>

                            </div>

                        )
                    })
                }

            </table>
        </div>

    )

}

export default RestApi;