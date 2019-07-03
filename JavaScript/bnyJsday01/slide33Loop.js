/**
 * An investment problem:
Starting with $10,000, how many years until we have at least $20,000, at 5% interest?
The algorithm:
 Start with a year value of 0 and a balance of $10,000. 
Repeat the following steps while the balance is less than $20,000: 
Add 1 to the year value
Compute the interest by multiplying the balance value by 0.05 (5 percent interest) (will be a const, of course) 
Add the interest to the balance
Report the final year value as the answer. 
 */

var year = 0;
var balance = 10000;

while(balance<=20000){
    balance = balance + ((0.05)*balance);
    year++;
}

console.log("years:" + year);
console.log("balance:" + balance);
