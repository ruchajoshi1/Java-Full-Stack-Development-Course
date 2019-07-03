/**
 * 
 */
// code from mdn for call function
function Product(name, price) {
  this.name = name;
  this.price = price;
}

function Food(name, price) {
  Product.call(this, name, price);
  this.category = 'food';
}

console.log(new Food('cheese', 5).name);
// expected output: "cheese"

//code from slide 24
var Person = function(fName, lName){
    this.firstName = fName;
    this.lastName = lName;
    this.info = function(){
        console.log("Inside Info");
        console.log(this.firstName,
            this.lastName,
            this.classesteaching,
            this.employer)
    };
}
var Insrtuctor = function(fName,lName, cT=[]){
    this.classesteaching = cT;
    this.employer = "Platform"
    Person.call(this, fName, lName)
}
var shah = new Insrtuctor("A H M","Shahparan",["Full Stack","DE"])
console.log(shah);
shah.info();