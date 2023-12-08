var exp = require('express');
var bp = require('body-parser');

var app = exp();
//req.body gets populated
app.use(bp.urlencoded({ 'extended': false }));
//app.use(bp.json())

app.listen(9000, function () {
    console.log("exp server at 9000");
});

app.get('/login', function (req, res) {
    res.sendFile(__dirname + "/loginform.html");
})

app.post('/logincheck', function (req, res) {
    //validate data in req body
    if (req.body.uid == "ritesh" && req.body.pwd == "ritesh123"){

        res.send("<h1> Success login </h1>");
    }
    else {
        //request redirection
        let time= 5;

        f=setInterval(() => {
            // res.write("<h1>Try after :</h1>"+time);
            res.append('Content-Type', 'text/html');
            res.append("<h1>Try after: " + time + " seconds</h1>");
            if(time==0){
                clearInterval(f);
                res.end();
                res.redirect('/login'); 
            }
            time--;  
        }, 1000);
        
       
    }

})


app.all('*', function (req, res) {
    res.send("<p> Wrong URL </p>");
})



