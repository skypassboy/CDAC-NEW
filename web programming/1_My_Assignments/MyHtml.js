
let arr = [2, 5, 6, 7, 8, 9, 15];

arr.sort((a, b) => { return b - a });

arr.forEach((v) => {

    console.log(v);

})
console.log("**********************************************************");

let arrmap = arr.map((v) => {
    return (v * v);
})

let arrsum = arr.reduce((s, v) => {
    return s + v;
}, 100)

console.log(arrsum);


var d = new Date().toJSON().slice(0,10);
console.log(d)
