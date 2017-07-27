<%-- 
    Document   : dynamicAddTextbox
    Created on : Jul 12, 2017, 2:30:11 PM
    Author     : Sanjay geda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

                    <script>
                        var app = angular.module('colour', []);

  app.controller('MainCtrl', function($scope) {
      

 
  $scope.order=[{}];
  var cnt=1;
  
 // $scope.choices=[{}];
   $scope.choices = [{'colour_way':cnt+'-'+colqty}];
   cnt=2;
  $scope.addNewChoice = function() {
      var colqty= document.getElementById("colqty").value;
   
      
      if(cnt<=colqty){
    var newItemNo = $scope.choices.length+1;
    $scope.choices.push({'id':'choice'+newItemNo,colour_way:cnt+'-'+colqty});      
   
     cnt++;
      }
  };
  $scope.add=function(){
      $scope.order.push({});
  }
    
  $scope.removeChoice = function() {
    var lastItem = $scope.choices.length-1;
    $scope.choices.splice(lastItem);
  };
  
  });
                  </script>
                  <style>
                      fieldset{
    background: #FCFCFC;
    padding: 16px;
    border: 1px solid #D5D5D5;
}
.addfields{
    margin: 10px 0;
}

#choicesDisplay {
    padding: 10px;
    background: rgb(227, 250, 227);
    border: 1px solid rgb(171, 239, 171);
    color: rgb(9, 56, 9);
}
.remove{
    background: #C76868;
    color: #FFF;
    font-weight: bold;
    font-size: 21px;
    border: 0;
    cursor: pointer;
    display: inline-block;
    padding: 4px 9px;
    vertical-align: top;
    line-height: 100%;   
}
input[type="text"],
select{
    padding:5px;
}
                  </style>
    </head>
    <body>
          <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Add Colours</h4>
                    </div>
                    <div class="modal-body">

        <div ng-app="colour" ng-controller="MainCtrl">
            colour Quantity<input type="text" ng-model="colqty" id="colqty" name="colqty"/>
   <fieldset  data-ng-repeat="choice in choices">
         <input type="text" ng-model="choice.colour" name="" placeholder="Enter colour code">
      <select ng-model="choice.ph">
         <option>Mobile</option>
         <option>Office</option>
         <option>Home</option>
      </select>
      <input type="text" ng-model="choice.colour_way"  value="1"  name="">
       <input type="text" ng-model="choice.colour_qty" name="" placeholder="Enter colour quantity">
      <button class="remove" ng-show="$last" ng-click="removeChoice()" button tiny radius>-</button>
   </fieldset>
   <button class="addfields" ng-click="addNewChoice()" button tiny radius>Add fields</button>
       
   <div id="choicesDisplay">
      {{ choices }}
   </div>
     </div>
                            </div>
                        </div>

                    </div>
                </div>
   <div ng-app="colour" ng-controller="MainCtrl">
   <fieldset data-ng-repeat="data in order">
       <input type="text" ng-model="data.name"/>
       
   </fieldset>
        <button class="addfields" ng-click="add()">Add fields</button>
</div>
      
    </body>
</html>
