var exp = require('express');
var mysql = require('mysql2');
var bp = require('body-parser');
var app = exp();

app.listen(9000, function () {
    console.log('Express Server: 9000');
})

app.use(exp.static('Introduction_to_json'));
app.use(bp.urlencoded({ extended: false }));


var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "knowit"
})

con.connect(function (err) {
    if (!err)
        console.log("db connected");
    else
        console.log("dn con failed : " + err.toString());
})



app.get('/empform', function (req, res) {
    //res.sendFile(__dirname+"/empform.html");
    res.sendFile(__dirname + "/empform.html");
})

app.post('/getEmpDetails', function (req, res) {
    var eno = req.body.empno;

    var query = "select * from emp where empno = " + eno;

    con.query(query, function (err, result) {
        // console.log(result);
        if (!err) {

            //var data = JSON.stringify(result);
            res.send(result);
        }
        else {
            res.write("<h1>Emp not present</h1>");
            res.end();
        }
    })
})

app.all('*', function (req, res) {
    res.send("<p> URL unidentified </p>");
})
