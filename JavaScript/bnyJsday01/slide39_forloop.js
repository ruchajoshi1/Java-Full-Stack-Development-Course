/**
 * for loop example 
 */

 for(var index=0; index<=10; index++){
     console.log("index:" + index);
 }

//Output: 0 2 4 6 8 10 ...  - it goes into infinite loop avoid using !=
//use <, >= etc
// for(i = 0; i!=9; i += 2){
//    console.log(i);
//}

//print even numbers upto 100
for(var i=0; i<=100; i++){
    if ((i%2) == 0){
    console.log(i);
    }
}

//print odd numbers upto 100
for(var i=0; i<=100; i++){
    if ((i%2) == 1){
    console.log(i);
    }
}

//Given a number, determine if this number is prime: print Yes or No
//var number=7;
//var divisor = 2;
//var prime = true;

for(number=1;number<100;number++){
    var divisor = 2;
    var prime = true;
for (divisor=2;((divisor<number)&& prime);divisor++){
    if(number%divisor == 0){
        //console.log(divisor);
        prime=false;
    }
}
if(prime){
    console.log(number + " is a prime number.")
}
}

//another way using while
var number=7;
var divisor = 2;
var prime = true;
while((divisor<number)&& prime){
    if(number%divisor++==0){
        prime=false;
    }
}
if(prime){
    console.log(number + " is a prime number.")
}

//Print all number divisible by 4 and 6 for all numbers within 10 and 1000 (Inclusive)

for(var i=10; i<=1000; i++){
    if ((i%4==0)&&(i%6==0)){
        console.log(i + " is divisible by 4 and 6 both.")
    }
}