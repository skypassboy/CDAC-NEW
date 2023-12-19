let exp = require('express');
let mysql = require('mysql2');
let cors = require('cors');
let bp = require('body-parser');


let app = exp();
app.use(cors())
app.use(bp.json());

app.listen(9000, () => {
    console.log("On 9000...!")
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
    else {
        console.log("db not connected...!");
    }

})

app.get('/emp', function (req, res) {
    console.log("aaa");
    con.query("select * from emp", function (err, result) {
        console.log("h1")
        if (!err) {

            console.log(result + "");
            res.json(result);
        }
        else {
            console.log(err + "");
        }
    })

})

app.post('/insertemp', function (req, res) {

    console.log(req.body.eno);
    con.query("insert into emp(EMPNO,ENAME,SAL,DEPTNO) values(?,?,?,?)", [req.body.eno, req.body.enm, req.body.sal, req.body.dpt], function (err) {
        if (!err) {
            res.send("Success...!");
        }
        else {
            console.log(err.toString())
            res.send("Failed...!");
        }
    })

})

app.all('*', function (req, res) {
    res.send("check URL")
})


// ***********************************************************************************************

// const express = require('express');
// const mysql = require('mysql2');
// const cors = require('cors');

// const app = express();
// app.use(cors());
// app.use(express.json());

// const pool = mysql.createPool({
//     host: "localhost",
//     user: "root",
//     password: "root",
//     database: "knowit",
//     connectionLimit: 10, // Adjust based on your needs
// });

// app.listen(8080, () => {
//     console.log("On 8080...!");
// });

// app.get('/emp', function (req, res) {
//     console.log("Request for /emp");
//     pool.query("SELECT * FROM emp", function (err, result) {
//         if (!err) {
//             console.log(result + "");
//             res.json(result);
//         } else {
//             console.error(err + "");
//             res.status(500).send('Internal Server Error');
//         }
//     });
// });

// app.post('/insertemp', function (req, res) {
//     console.log("Request for /insertemp");
//     const { eno, enm, sal, dpt } = req.body;

//     pool.query("INSERT INTO emp VALUES (?, ?, ?, ?)", [eno, enm, sal, dpt], function (err) {
//         if (!err) {
//             res.send("Success...!");
//         } else {
//             console.error(err + "");
//             res.status(500).send('Internal Server Error');
//         }
//     });
// })