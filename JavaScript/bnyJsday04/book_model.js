/**
 * write a model for book
 */

var Book = function(title="Book Name",author="",year=""){
    this.title = title;
    this.author = author;
    this.year = year;
    this.category = "Programming Language";
    this.printInfo = function(){
        console.log("\n","********************************************","\n",
                    "*     Title:", this.title,"                *","\n",
                    "*    Author:", this.author,"               *","\n",
                    "*      Year:", this.year,"                 *","\n",
                    "*  Category:", this.category,"             *","\n",
                    "*************************************************","\n");
        //console.log(this);
    }
    /*this.printValue = function(){
        for(var val in this){
            console.log(this[val]);
        } 
    }*/
}

var Javascript = new Book("JavaScript-the definite guide","David Flanagan",2005);
var Java = new Book("Java","Flanagan",2005);
var Book1 = new Book("David");

//console.log(Javascript);
Javascript.printInfo();
//Java.printValue();
Java.printInfo();
Book1.printInfo();

//----------------------------------------------------------
for(var i=0;i<100;i++){
    Java.printInfo();
}