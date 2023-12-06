var u = require('url');
var h = require('http');
var fs = require('fs');

var server = h.createServer(function (req, res) {

    // var file_path = (u.parse(req.url, true)).pathname;
    var url_p = u.parse(req.url, true);
    var file_path = url_p.pathname;
    // console.log(path);
    var fname = file_path.substring(1);

    fs.readFile(fname, function (err, data) {

        if (!err) {

            res.writeHead(200, { "content-type": "text/html" });
            res.write(data.toString());
            console.log(data.toString());
            res.end();
        }
        else {
            res.writeHead(200, { "content-type": "text/html" });
            res.write("<h1>File Not Found</h1>");
            res.end();
        }
    })

}).listen(9000, function () {
    console.log("on port 9000...!")
})