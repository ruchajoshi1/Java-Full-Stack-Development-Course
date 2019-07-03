/**
 * slide 13 function
 */

 function myjoin(obj){
    /* console.log(obj.firstName);
     console.log(obj["firstName"]);*/
     
     console.log(Object.keys(obj)[0]);
     console.log(Object.values(obj)[0]);
   /*  for (var o in obj)
   console.log(o+" : "+ obj[o] + "\n");*/
 }

 var person = {
     firstName: "Luke",
     lastName: "Lance",
     age: 23
 };

 function myjoin(obj){
     /* different ways to call the property */
    /* console.log(obj.firstName);
     console.log(obj["firstName"]);*/
     
    /* console.log(Object.keys(obj)[0]);
     console.log(Object.values(obj)[0]);*/
     for (var o in obj)
     
     console.log(o+" : "+ obj[o] + "\n");
     }

 var book = {
     book_name: "My first javascript",//property and value for object book
     book_author: "Ethan",
     book_publication: "O'reilly"
 };
 

 myjoin(person);
 myjoin(book); 

 //to print entire object with properties and values
 console.log(book);