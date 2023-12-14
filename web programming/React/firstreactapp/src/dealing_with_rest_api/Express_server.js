let exp = require('express');
let mysql = require('mysql2');
let cors = require('cors');

let app = exp();

app.listen(9000, () => {
    console.log("On 9000...!")
})

app.use(cors())

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

app.get('/employee', function (req, res) {
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




