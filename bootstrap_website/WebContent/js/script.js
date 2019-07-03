/**
 * 
 */
 var app = angular.module('myApp', []);  
        app.controller('studentController', function($scope, $http, $location,$window) {

            //buttons setting
            $scope.submit = true;
            $scope.update = false;
            $scope.cancel = false;
            //$scope.userid = true;

            //Getting User List
            //$http GET function
            $http.get('https://jsonplaceholder.typicode.com/users').then(
                function successCallback(response) {
                $scope.users = response.data;
                }, function errorCallback(response) {  alert("Error. Try Again!");
                });
             

            //Create New User
            $scope.createUser = function() {
            //$http POST function
            //to check error message edit the url
            //$http.post('https://jsonplaceholder.typicode.com/user', $scope.user).then(
            $http.post('https://jsonplaceholder.typicode.com/users', $scope.user).then(
                function successCallback(response) {
                $scope.users.push(response.data);  
                alert("User has created Successfully");
                $window.location.href("user_data.html");
                }, function errorCallback(response) {
                alert("Error. while created user Try Again!");
                });
                };

            //update user
            $scope.updateUser = function(){
                //$http PUT function
                $http.put('https://jsonplaceholder.typicode.com/users/' + $scope.user.id)
                .then(function successCallback(response){
                    //$window.alert("Testing")
                    //$window.location.href("user_data.html");
                    alert("User has updated successfully")},
                    function errorCallback(response){
                        alert("Error. while updating the user. Try again.")
                    });
            };

            //Delete User
            $scope.deleteUser = function(){
                //$http DELETE function
                $http.delete('https://jsonplaceholder.typicode.com/users/' + $scope.user.id)
                .then(function successCallback(response){
                    alert("User has deleted successfully");
                    var index = $scope.users.indexOf(user);
                    $scope.users.splice(index,1);
                },
                    function errorCallback(response){
                        alert("Error. while deleting the user. Try again.")
                    });
            };

            //set $scope on Edit button click
            $scope.editUser = function(user){
                $scope.user = user;
                $scope.submit = false;
                $scope.update = true;
                $scope.cancel = true;  
                //$window.location.href("home_page.html");              
                //$scope.userid = false;
            };

            //cancel update
            $scope.cancelUpdate = function(){
                $scope.user = null;
                $scope.submit = true;
                $scope.update = false;
                $scope.cancel = false;
            // $scope.userid = true;
            };
        });