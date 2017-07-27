<html>
  <head>
    <meta charset='utf-8'>
                <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
      <script src="angular.js"></script>

    <script src="angular-ui-bootstrap-modal.js"></script>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap.css">
    <script>
      var app = angular.module("MyApp", ["ui.bootstrap.modal"]);

app.controller("MyCtrl", function($scope) {
 var cnt = 1;

                // $scope.choices=[{}];
                $scope.choices = [{'colour_way': cnt + '-' + 5}];
                cnt = 2;
  $scope.open = function() {
    $scope.showModal = true;
  };
 $scope.addNewChoice = function () {

                    var colqty = document.getElementById("colqty").value;


                    if (cnt <= colqty) {
                        var newItemNo = $scope.choices.length + 1;
                        $scope.choices.push({'id': 'choice' + newItemNo, colour_way: cnt + '-' + colqty});

                        cnt++;
                    }
                };
                $scope.add = function () {
                    $scope.order.push({});
                };

                $scope.removeChoice = function () {
                    var lastItem = $scope.choices.length - 1;
                    $scope.choices.splice(lastItem);
                };

  $scope.ok = function() {
    $scope.showModal = false;
  };

  $scope.cancel = function() {
    $scope.showModal = false;
  };

});


    </script>
  </head>
  <body ng-app="MyApp" ng-controller="MyCtrl">

    <button class="btn" ng-click="open()">Open Modal</button>

    <div modal="showModal" close="cancel()">
       <div class="modal-header">
                       
                        <h4 class="modal-title">Add Colours</h4>
                    </div>
                    <div class="modal-body">

        
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
   <button class="addfields" ng-click="addNewChoice()" >Add fields</button>
       
   <div id="choicesDisplay">
      {{ choices }}
   </div>
   
                            </div>
      <div class="modal-footer">
        <button class="btn btn-success" ng-click="ok()">Okay</button>
        <button class="btn" ng-click="cancel()">Cancel</button>
      </div>
    </div>

  </body>
</html>