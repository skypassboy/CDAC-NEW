var f = require('fs');
var u = require('url');
var h = require('http');

var server = h.createServer(function (req, res) {

    var url_p = u.parse(req.url, true);
    var path = url_p.pathname;
    var str = `\n Request received for ${path} at ${new Date()}`
    f.appendFile("log.txt", str, function (err) {

        if (!err) {
            console.log("appended...!")
            res.writeHead(200,{'content-type':'text/html'});
			res.write("<h1>Request is logged </h1>");
			res.end();
        }
        else {
            console.log("file not found...!")
        }

    })

})

server.listen(9000, function () {
    console.log("Server stated on 9000...!")
})