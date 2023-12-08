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
    res.sendFile(__dirname + "/empform_jquery.html");
})

app.get('/getEmpDetails', function (req, res) {
    var eno = req.query.empno;
    var query = "select * from emp where empno = " + eno;

    con.query(query, function (err, result) {
        // console.log(result);
        if (!err) {
            
                res.write("<p> Emp name : " + result[0].ENAME + "</p>");
                res.write("<p> Dept no : " + result[0].DEPTNO + "</p>");
                res.write("<p> Salary : " + result[0].SAL + "</p>");
                res.end();
            
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
