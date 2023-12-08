var mysql = require('mysql2');
var exp = require('express');
var app = exp();

app.listen(9000, function () {
    console.log("on 9000");
})
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "knowit"
})

con.connect(function (err) {


    if (!err) {
        console.log("db connected...!");
    }
})

app.get('/employee', function (req, res) {

    con.query("select * from emp", function (err, result) {

        if (!err) {
            res.write("<table border=1>");
            result.forEach(function (emp) {
                res.write("<tr>");
                res.write("<td>" + emp.EMPNO + "</td>");
                res.write("<td>" + emp.ENAME + "</td>");
                res.write("<td>" + emp.JOB + "</td>");
                res.write("<td>"+emp.HIREDATE+"</td>");
                res.write("<td>" + emp.SAL + "</td>");
                res.write("</tr>")
            })
            res.write("</table>");
            res.end();
        }

    })



})

