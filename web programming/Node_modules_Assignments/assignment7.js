var f = require('fs')
var h = require('http')
var u = require('url')

var s = h.createServer(function(req,res){
    if(req.url=='/favicon.ico'){
        console.log(1)
        return
    }

    f.readFile('visit.txt',(err,data)=>{
        if(!err){
            var count = parseInt(data.toString())
            count++
            console.log(count);
            f.writeFile('visit.txt',count+"",function (err){
                console.log("visit count updated");
            })
            res.writeHead(200,{'content-type':'text/html'})
            res.write("<h1>visit count : "+count+"</h1>")
            res.end()
        }
        else{
            res.writeHead(200,{'content-type':'text/html'})
            res.write("<h1>File count not increased</h1>")
            res.end()
        }
        
    })
})

s.listen(9001,function (){
    console.log("server started on 9001...!")
})