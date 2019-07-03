/**
 * Slide 33 - RegEx example
 */
/*
//slide 32 search()
var text = "Javascript";
console.log(text.search(/script/i));
console.log("JavasCRipt".search(/cr/));
//i for case insensitive; -1 value indicates search not found.

//slide 32 replace()
text.replace(/javascript/gi,"JavaScript");

var text1 = "I Love JavaScript, I Love JavaScript, I Love JavaScript";
console.log(text1.replace(/love/gi,"Like"));
console.log(text1.replace(/love/i,"Like"));
console.log(text1.replace(/love/g,"Like"));

//slide 33 match()
var text2 = "I Love JavaScript, I Love JavaScript, I Love JavaScript,yeah";
var result = text2.match(/Love/g);
console.log(result);
*/
//slide 33 given code example
var url=/(\w+):\/\/([\w.]+)\/(\s*)/;
var text = "Visit my blog at http://www.example.com/~david";
var result = text.match(url);
if(result!= null){
    var fullurl = result[0];
    var protocol = result[1];
    debugger;
    var host = result[2];
    var path = result[3]
}
console.log(fullurl);
console.log(protocol);
console.log(host);
console.log(path);