/**
 * 
 */

 /*console.log("I am here.");  
 var obj={x:1,y:2};
            console.log(obj.x);
            console.log(obj.y);
            console.log(obj.toSting);
            delete obj.x;
            console.log(obj.x);
            console.log(obj.y);
*/
var obj1 = Object.create({x:1,y:2});
for(var i in obj1){
    console.log(i);
    console.log(obj1[i]);
}