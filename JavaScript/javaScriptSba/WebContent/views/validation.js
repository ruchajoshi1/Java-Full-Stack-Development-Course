/**
 * Registration form validation using javascript
 */

//form validation function
function formValidation()
{
    //alert("Inside form validation.");
var fname = document.registration.firstname;
var lname = document.registration.lastname;
var uname = document.registration.username;
var upwd = document.registration.pwd;
var uconfirmpwd = document.registration.confirmpwd;
var uemail = document.registration.email;
var ubirthdate = document.registration.birthdate;
var ucheckbox = document.registration.checkbox;
//var usubmit = document.registration.mysubmit;

if(name_validation(fname)){
if(name_validation(lname)){
if(username_validation(uname,5,20)){
if(pwd_validation(upwd,8,20)){
if(pwd_validation(uconfirmpwd,8,20)){
if(email_validation(uemail)){
if(birthdate_validation(ubirthdate)){
if(checkbox_validation(ucheckbox)){
}
}
}
}
}
} 
}
}
return false;
}

//validate first name and last name
function name_validation(name){
    var letters = /^[A-Za-z]+$/;
    if(name.value.match(letters))
        {
            return true;
        }
    else
        {
            alert('Name must have alphabet characters only');
            name.focus();
            return false;
        }
}

//validate username
function username_validation(uname,mx,my){
    var uname_len = uname.value.length;
    var letters = /^[A-Za-z0-9]+$/;
    if (uname_len == 0 || uname_len >= my || uname_len < mx) 
    {
        alert("User Name should not be empty / length should be between "+mx+" to "+my);
        uname.focus();
        return false;
    }else if(uname.value.match(letters)){
        return true;
    }else {
            alert('Username must have alphabet characters or digits only');
            uname.focus();
            return false;
        }
}

//validate password
function pwd_validation(upassword,mx,my){
    var upassword_len = upassword.value.length;
    var letters = /^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$/;
    //var letters = /^(?=.*\d)(?=.*[a-zA-Z])+$/;
    if (upassword_len == 0 ||upassword_len >= my || upassword_len < mx)
    {
        alert("Password should not be empty / length should be between "+mx+" to "+my);
        upassword.focus();
        return false;
    }else if (upassword.value.match(letters)){
        return true;
    }else {
        alert("Password must have at least 1 letter and 1 number");
        upassword.focus();
        return false;
    }
}
/*check if both passwords are same or not.
if(upwd != uconfirmpwd){
    alert("Your passwords are not matching.");
    return false;
} else{
    return true;
};
*/

//validate email
function email_validation(uemail){
    var emailformat = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]+$/;
    if (uemail.value.match(emailformat)){
        return true;
    } else {
        alert("You have entered an invalid email address!");
    uemail.focus();
    return false;
    }
}

//validate birthdate
function birthdate_validation(ubirthdate){
    var udob_len = ubirthdate.value.length;
    if(udob_len == 0){
        alert("Please enter date of birth");
        ubirthdate.focus();
        return false;
    } 
    return true;
}

