/**
 * Slide 11 function example
 */

 /*
function customMessage(custom,times){
   for(var i=0; i<times; i++){
      console.log(i,custom);
        }
}    
customMessage("Useful Message >.>", 5);
*/

var callbacks = [];
(function() {
  for (let i = 0; i < 5; i++) {
    callbacks.push( function() { return i; } );
  }
})();
console.log(callbacks.map( function(cb) { return cb(); } ));