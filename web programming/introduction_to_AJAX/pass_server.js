var exp = require('express');
var mysql = require('mysql2');
var app = exp();

app.listen(9000, function () {
    console.log('Express Server: 9000');
})

app.use(exp.static('introduction_to_AJAX'));

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
    res.sendFile(__dirname + "/passform.html");
})

app.get('/getEmpDetails', function (req, res) {
    var username = req.query.username;
    var query = "select * from emp where ENAME = " + '"' + username + '"';

    con.query(query, function (err, result) {
        console.log(query + "")
        console.log(result + "");
        console.log("11");
        if (!err) {
            if (result.length > 0) {

                res.write("Emp already exists");
                res.end();
            } else {
                res.write("");
                res.end();
            }
        }
        else {

        }
    })
})

app.all('*', function (req, res) {
    res.send("<p> URL unidentified </p>");
})
