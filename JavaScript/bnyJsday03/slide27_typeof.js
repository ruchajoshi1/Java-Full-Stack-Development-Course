/**
 * slide 27
 * 
 */

var str="123";
var num=Number(str);

console.log(typeof str);
console.log(typeof num);

//---------------------------------------------------
//slide 28 Date object

var first = new Date('January 1, 2019 04:30:00');//Date is a constructor
var second = new Date('2019-01-01T04:30:00');

console.log(first);
console.log(first===second);
console.log(second.getHours());
console.log(second.getDay());

var today = new Date();//new object of Date constructor
console.log(today);

//to find yesterday's date
var date = new Date();
date.setDate(today.getDate()-1)//this gives yesterday's date
console.log(date);

//to get tomorrow's date
var tomorrow = new Date();
tomorrow.setDate(today.getDate()+1)//this gives yesterday's date
console.log(tomorrow);

//how to get last year from a date
var year = new Date();
year.setFullYear(year.getFullYear()-1);
console.log(year);

//what is today's year, month, day
console.log("today's day:" + today.getDay());//zero based Sunday is 0; 0-6
console.log("today's date:" + today.getDate());
console.log("today's month:" + today.getMonth());// zero based so jan is 0; 0-11
console.log("today's year:" + today.getFullYear());

//print day and month name

//see example for date.parse()
