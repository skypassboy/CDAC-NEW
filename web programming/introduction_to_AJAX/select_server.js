var exp = require("express");
var mysql = require("mysql2");

var app= exp();

app.listen(9000,function(){
    console.log("On server 9000...!")
})

var con = mysql.createConnection({

    host : "localhost",
    user : "root",
    password : "root",
    database : "knowit"

})

con.connect(function(err){

    if(!err){
        console.log("db connected...!")
    }
    else{
        console.log("db not connected...!")
    }

})


app.get("/select_state",function(req,res){

    res.sendFile(__dirname+"/select_state.html");

})

app.get("/getCities",function(req,res){

    var sid = req.query.stateid;

    var query = "select * from city where stateid ="+ sid;

    con.query(query,function(err,result){

        if(!err){
            res.write(`<option>${"select city"}</option>`)
            result.forEach(function(c){
                res.write(`<option value="${c.stateid}">${c.city}</option>`)
            })
            res.end();
        }
    })

})

app.all("*",function(req,res){
    res.send("Wrong url ...!");
})