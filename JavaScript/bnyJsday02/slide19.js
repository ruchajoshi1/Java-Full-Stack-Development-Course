/**
 * Arrays
 * slide 19,20,21
 */
//slide 19
/*var a = [23,32,45,67,22,77,99,67,98,56,12];
for(let i=0; i<a.length; i++){
    console.log(a[i]);
}

//slide 20
var a = [23,32,45,67,22,77,,99,67,98,56,12];//no element prints undefined
for(let i=0; i<a.length; i++){
    console.log(a[i]);
}*/

/*
//slide 21
var a = [23,32,45,67,22,77,,99,67,98,56,12];
for(let i=0;i<a.length;i++){
    if(!a[i]){
        continue;
    }
    console.log(a[i]);
}
*/
//sum of all the elements including undefined is NaN so need to check 
//for undefined values in the array 

//slide 21
//var a = [23,32,45,67,22,77,,99,67,98,56,12];
var a = [23,32,45,67,22,77,,99,67,98,56,12];
var sumOutside=0;
var sumInside=0;
for(let i=0;i<a.length;i++){
    sumOutside += a[i];
    if(a[i] === undefined){
        continue;
    }
        sumInside += a[i];
        console.log(a[i]);
}
console.log("length of a is:" + a.length); //12
console.log("Sum outside if including undefined: " + sumOutside);//Nan
console.log("Sum inside if excluding undefined: " + sumInside);//598