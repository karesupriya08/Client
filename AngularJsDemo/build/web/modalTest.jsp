<%-- 
    Document   : modalTest
    Created on : Jul 13, 2017, 10:29:12 AM
    Author     : Sanjay geda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
     <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.11.0/ui-bootstrap-tpls.js"></script>
   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
        <script>
            angular.module('ui.bootstrap.demo', ['ui.bootstrap']);
            angular.module('ui.bootstrap.demo').controller('ModalDemoCtrl', function ($scope, $modal, $log) {
                 var cnt = 1;
              $scope.choices = [{'colour_way': cnt + '-' }];

                $scope.open = function (size) {

                    var modalInstance = $modal.open({
                        templateUrl: 'trymodal.jsp',
                        controller: 'ModalInstanceCtrl',
                        size: size,
                        resolve: {
                            choices: function () {
                                return $scope.choices;
                            }
                        }
                    });

                    modalInstance.result.then(function (selectedItem) {
                        $scope.selected = selectedItem;
                    }, function () {
                        $log.info('Modal dismissed at: ' + new Date());
                    });
                };
            });

// Please note that $modalInstance represents a modal window (instance) dependency.
// It is not the same as the $modal service used above.

            angular.module('ui.bootstrap.demo').controller('ModalInstanceCtrl', function ($scope, $modalInstance, choices) 
            {
                var cnt = 1;

                // $scope.choices=[{}];
                $scope.choices = [{'colour_way': cnt + '-' + 5}];
                cnt = 2;
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
                }

                $scope.removeChoice = function () {
                    var lastItem = $scope.choices.length - 1;
                    $scope.choices.splice(lastItem);
                };

            });
        </script>
    </head>
    <body>
   <div ng-controller="ModalDemoCtrl" ng-app="ui.bootstrap.demo">
    

    <button class="btn btn-default" ng-click="open()">Open me!</button>
    <button class="btn btn-default" ng-click="open('lg')">Large modal</button>
    <button class="btn btn-default" ng-click="open('sm')">Small modal</button>
    <div ng-show="selected">Selection from a modal: {{ selected }}</div>
</div>
        <script type="text/ng-template" id="myModalContent.html">
        <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
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
     
    </script>
    </body>
</html>
