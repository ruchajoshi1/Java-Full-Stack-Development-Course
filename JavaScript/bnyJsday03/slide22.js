/**
 * slide 22 nested functions
 */

 function sum_of_square(a,b){
     function square(x) {return x*x;}

     return(square(a) + square(b));
 }

 var result = sum_of_square(2,3);
 console.log(result);//answer is 13
 console.log(square(3));//this gives error as it is calling inside function

 