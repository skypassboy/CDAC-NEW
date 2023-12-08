var exp = require('express');

var app = exp();

app.listen(9000, function () {
    console.log("hie server from port 9000...!");
})

app.use(exp.static('images'));
app.use(exp.static('scripts'));
app.use(exp.static('styles'));


app.get('/img',function(req,res){ 
    res.send(`<img src="Desert.jpeg">`)
})



app.get('/page', function (req, res) {
    res.sendFile(__dirname + '/login_form.html')
})