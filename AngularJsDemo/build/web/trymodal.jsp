<%-- 
    Document   : trymodal
    Created on : Jul 13, 2017, 10:01:03 AM
    Author     : Sanjay geda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

          <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
              <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-filter/0.5.16/angular-filter.js"></script>  
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://rawgit.com/dwmkerr/angular-modal-service/master/dst/angular-modal-service.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
        <link rel="stylesheet" type="text/css href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css"/>
    
                  
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
      <input type="text" ng-model="choice.colour_way"  value="1" ng-value="choice.colour_way"  name="">
       <input type="text" ng-model="choice.colour_qty" name="" placeholder="Enter colour quantity">
      <button class="remove" ng-show="$last" ng-click="removeChoice()" button tiny radius>-</button>
   </fieldset>
   <button class="addfields" ng-click="addNewChoice()" >Add fields</button>
       
   <div id="choicesDisplay">
      {{ choices }}
   </div>
            </div>
     
    </body>
</html>
