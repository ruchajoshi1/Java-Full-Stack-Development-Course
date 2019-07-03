/**
 * Arrays slide 35-40
 */

 //array join() examples
/*
var a = [1,2,3,4,5,6,7,8,9,10];
var x=a.join();
console.log("array.join() result:" + x);

var y=a.join(" ");
console.log("array.join() result:" + y);

var z=a.join("");
console.log("array.join() result:" + z);//concatinates all elements

var b=new Array(10);
console.log(b.join("-"));
*/

/*
//array split() examples
var s="d u t r w";
console.log(s);
var arr=s.split(" ");
console.log(arr);

var t="d,u,t,r,w";
console.log(t);
var arr1=t.split(",");
console.log(arr1);

var u="dutrw";
console.log(u);
var arr2=u.split("");
console.log(arr2);

//array.reverse() - slide 36
var b=[1,2,3];
var c=b.reverse();
//var c=b.reverse().join();
console.log(c);

//array.sort() - slide 37
//if sort() has no argument then it sorts alphabetically.
var b=[3,111,4,200,50];
console.log(b);
b.sort();
console.log(b);

//sort by numerical order
var a=[33,4,1111,222];
a.sort();
a.sort(function(a,b){return a-b;});//numerical order
console.log(a);
var d = a.sort(function(a,b){return b-a;});//reverse numerical order
console.log(d);

//slide 38 array.slice()
var g=[1,2,3,4,5];
console.log(g.slice(0,3));//[1,2,3]
console.log(g.slice(3));//[4,5]
console.log(g.slice(1,-1));//[2,3,4]
console.log(g.slice(-3,-2));//[3]
*/
//slide 39 splice examples

//slide 40
// code from MDN
var a=['a','b','c']
a.forEach(function(element){console.log(element);})

//slide 40
var data=[1,2,3,4,5];
var sum=0;
data.forEach(function(value){sum += value;});
console.log(sum);

data.forEach(function(v,i,a){a[i]=v+1;});
console.log(data);

//slide 41 array.map()
var a =[1,2,3];
var b=a.map(function(x){return x*x;});
console.log(b);

//slide 42 array.filter()
var a=[5,4,3,2,1];
var smallvalues = a.filter(function(x){return x<3;});
console.log(smallvalues);//[2,1]
var everyOther = a.filter(function(x,i){return i%2==0})
console.log(everyOther);//[5,3,1]

