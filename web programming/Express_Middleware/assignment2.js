var exp = require('express');
var f = require('fs');
var u = require('url');

var app = exp();

// dont use this
app.use(exp.static('log'))

app.get('/log', function (req, res) {

    var url_p = u.parse(req.url, true);
    var path = url_p.pathname;
    var str = `\n Request received for ${path} at ${new Date()}`
    f.appendFile("log.txt", str, function (err) {

        if (!err) {
            console.log("appended...!")
            res.writeHead(200, { 'content-type': 'text/html' });
            res.write("<h1>Request is logged </h1>");
            res.end();
        }
        else {
            console.log("file not found...!")
        }

    })


})

app.listen(9000, function () {
    console.log("hie server from port 9000...!");
})


