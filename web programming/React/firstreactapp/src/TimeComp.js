
let d = new Date();
let name = "Ritesh"
let TimeComp = ()=>{

    return(


        <div>
            <h1>Welcome from {name}</h1>
            <h2>Current time : {d.getHours()} : {d.getMinutes()} : {d.getSeconds()}</h2>
            <h3>Current date : {d.getDate()} : {d.getMonth()+1} : {d.getFullYear()}</h3>
        </div>




    )
}
export default TimeComp;