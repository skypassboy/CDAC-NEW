var exp = require("express");

var app = exp();

app.listen(9000,function(){

    console.log("welcome to 9000...!")
})

app.use(exp.static("introduction_to_AJAX"))

app.get('/user',function(req,res){
    var username = req.query.username;
    res.sendFile(__dirname+'/userform.html');
    // res.send("username : "+username)
})
app.get('/getdetails',function(req,res){
    var user = req.query.username;
     res.send("Welcome "+user)
   
})
