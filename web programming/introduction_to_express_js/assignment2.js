var exp = require('express');

var app = exp();

app.listen(9000,function(){
    console.log("express server 9000")
})


// router handler for "/home" - get method
app.get('/home',function(req,res){

    res.send("<h1>Welcome to Express</h1>");

})


// router handler for "/index" -get method

app.get('/index',function(req,res){
    res.send("<h1>router handler for index</h1>");
})

// default router handler

app.get('*',function(req,res){
    res.send("<h1>Please check URL...!</h1>")
})