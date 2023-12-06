var u = require('url');
var h = require('http');

var server = h.createServer(function (req, res) {

    var url_p = u.parse(req.url, true);

    var nm = url_p.query.name;
    var cl = url_p.query.color;

    res.writeHead(200, { 'content-type': 'text/html' });
    res.write("<h1>Welcome</h1>")
    res.write(`<h1 style="color: ${cl}">Name : ${nm}</h1>`);
    res.end;
})

server.listen(9000, function () {
    console.log("server 9000 started...!")
})