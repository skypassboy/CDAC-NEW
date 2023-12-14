let Two = function() {
    var names = ["Ritesh","Aniket","Manasvi","Nikhil","Anup"];
    return (
        <div>
            <h1>Welcome from functional expression</h1> 
            <ul> 
                {
                    names.map((v)=>{
                        return <li key={v}> {v} </li>
                    })
                }        
            </ul>
        </div>
    )
}

export default Two;