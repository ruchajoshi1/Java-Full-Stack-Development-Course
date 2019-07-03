/**
 * Write a for loop to separate each character in a given expression.
 */
var expression="23+3-3^";
var operand="";
var numbers="";

//var expression="2*5";, ""; "2"; "23";
console.log("Length of expression: " + expression.length)
for(var i=0; i<expression.length; i++){
    console.log(expression[i]);
    if (expression[i] == "+" || expression[i] == "-" || expression[i] == "^"){
        //console.log("It is an operator");
        operand = operand + expression[i] +"|";
        //
        numbers = numbers + "|";
    } else{
        //console.log("It is a number.");
        numbers= numbers + expression[i];
    }
}
// to add last pipe in the numbers
if (numbers[numbers.length - 1] != "|"){
    numbers = numbers + "|";}
console.log("operands are: " + operand);
console.log("numbers are: " + numbers);