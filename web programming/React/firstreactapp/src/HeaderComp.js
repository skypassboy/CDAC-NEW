
import shiva from './shiva.jpg'
import TimeComp from './TimeComp'
let HeaderComponent = ()=>{

    return(
        
        <div id="headerdiv">
            <img src={shiva} id="header-img"/>
            <h1>Welcome</h1>  
            <TimeComp/>
        </div>

    )

}

function one(){

return(
    <div>
        <h1>
            Hello from React
        </h1>
        <h2>
            
        </h2>
    </div>
)
}
export default HeaderComponent; 