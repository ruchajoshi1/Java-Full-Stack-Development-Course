/**
 * Hello, include comments here...
 * This is my first Javascript  script
 */

 // This is inline comment

// console.log(4 + 3);
// console.log(4*5);
// console.log(4/2);

var myNumber = 9;
console.log(myNumber) //9
console.log(10+myNumber++);//19
console.log(10+myNumber);//20

console.log(myNumber);//10
console.log(10+(++myNumber));//21
console.log(10+myNumber);//21

var myNumber = 9;
console.log(myNumber) //9
console.log(10+myNumber--);//19
console.log(10+myNumber);//18

console.log(myNumber);//8
console.log(10+(--myNumber));//17
console.log(10+myNumber);//17

var newNumber = 9;
console.log(newNumber -= 3);//6
console.log(newNumber /= 3);//2
console.log(newNumber *= 3);//6
console.log(newNumber %= 3);//0

let x=1;
if (x===1){
    let x = 2;
    console.log(x); // expected output: 2
}
console.log(x);// expected output: 1

console.log("this is:" + (newNumber * 3));

var myName="Rucha";
var myFlag=true;
var myOther=null;

console.log("this is myName:" + myName);// this is myName:Rucha
console.log("this is myFlag:" + myFlag); //this is myFlag:true
console.log("this is myOther:" + myOther);//this is myOther:null

console.log(true==myFlag); //true
console.log(true===myFlag); //true
console.log("true"===myFlag); //false
console.log(null===myOther); //true

//if else
var option=0;
option = 3;
console.log("option:" + option);
if (option == 1){
    console.log("Deposit Amount = $1.00");
} else if (option == 2){
    console.log("Account balance = $1.00");
} else if (option == 3){
    console.log("Welcome to the ATM Services.");
} else if (option == 4){
    console.log("Thank you for using our services");
} else {
    console.log("ERROR Message: Invalid option. Valid options are 1-4");
}

//switch case
option = 5;
console.log("option:" + option);
switch (option){
    case 1:
            console.log("Deposit Amount = $1.00");
            break;
    case 2:
            console.log("Account balance = $1.00");
            break;
    case 3:
            console.log("Welcome to the ATM Services.");
            break;
    case 4:
            console.log("Thank you for using our services");
            break;
    default:        
            console.log("ERROR Message: Invalid option. Valid options are 1-4");
            break;        
}

//