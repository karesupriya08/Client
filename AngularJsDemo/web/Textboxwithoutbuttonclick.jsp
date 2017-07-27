<%-- 
    Document   : Textboxwithoutbuttonclick
    Created on : Jul 14, 2017, 9:34:03 AM
    Author     : Sanjay geda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="cookieApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
         <script>
             
             var app = angular.module("cookieApp", []);

app.controller("cookieCtrl", function ($scope) {
	$scope.numbers= [1,2,3,4,5,6];
  $scope.userVals=[];
  $scope.getVal= function(){
  	console.log($scope.userVals);
  }
});
         </script>
    </head>
    <body>
       <div  ng-controller="cookieCtrl">
    <div class="orgevent" ng-repeat="i in numbers  track by $index">
      <input class="dest" type="text" value="Free text" ng-model="userVals[$index]">
    </div>
    <button ng-click="getVal()">Read</button>
</div>g
    </body>
</html>
