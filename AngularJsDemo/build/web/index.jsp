<!DOCTYPE html>
<html>
    <head>
            <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>  
              <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-filter/0.5.16/angular-filter.js"></script>  
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://rawgit.com/dwmkerr/angular-modal-service/master/dst/angular-modal-service.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
        <link rel="stylesheet" type="text/css href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css"/>
      <script src="https://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.6.0.js" type="text/javascript"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.11.0/ui-bootstrap-tpls.js"></script>

<style>
.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
 var counter=0;
    $scope.elements = [ {id:counter, value : ''} ];

    $scope.newItem = function(){
        counter++;
        $scope.elements.push(  { id:counter,value:''} );
        
    }
    
    $scope.show=function(elements)
    {
        alert(JSON.stringify(elements));
        
    }
  
});

 $(document).ready(function() {
       var iCnt = 0;
        // CREATE A "DIV" ELEMENT AND DESIGN IT USING jQuery ".css()" CLASS.
        var container = $(document.createElement('div')).css({
            padding: '5px', margin: '20px', width: '170px', border: '1px dashed',
            borderTopColor: '#999', borderBottomColor: '#999',
            borderLeftColor: '#999', borderRightColor: '#999'
  });

        $('#btAdd').click(function() {
            if (iCnt <= 3) {

                iCnt = iCnt + 1;

                // ADD TEXTBOX.
                $(container).append('<input type=text class="input" id=tb' + iCnt + ' ' +
                            'value="Text Element ' + iCnt + '" />');

                // SHOW SUBMIT BUTTON IF ATLEAST "1" ELEMENT HAS BEEN CREATED.
                if (iCnt == 1) {

                    var divSubmit = $(document.createElement('div'));
                    $(divSubmit).append('<input type=button class="bt"' + 
                        'onclick="GetTextValue()"' + 
                            'id=btSubmit value=Submit />');

                }

                // ADD BOTH THE DIV ELEMENTS TO THE "main" CONTAINER.
                $('#main').after(container, divSubmit);
            }
            // AFTER REACHING THE SPECIFIED LIMIT, DISABLE THE "ADD" BUTTON.
            // (20 IS THE LIMIT WE HAVE SET)
            else {      
                $(container).append('<label>Reached the limit</label>'); 
                $('#btAdd').attr('class', 'bt-disable'); 
                $('#btAdd').attr('disabled', 'disabled');
            }
        });
    });
    // PICK THE VALUES FROM EACH TEXTBOX WHEN "SUBMIT" BUTTON IS CLICKED.
    var divValue, values = '';

    function GetTextValue() {

        $(divValue) 
            .empty() 
            .remove(); 
        
        values = '';

        $('.input').each(function() {
            divValue = $(document.createElement('div')).css({
                padding:'5px', width:'200px'
            });
            values += this.value + '<br />'
        });

        $(divValue).append('<p><b>Your selected values</b></p>' + values);
        $('body').append(divValue);
    }

</script>
</head>
<body  data-ng-controller="myCtrl1">

<h2>Hoverable Dropdown</h2>
<p>Move the mouse over the button to open the dropdown menu.</p>

<div class="dropdown">
  <button class="dropbtn">Dropdown</button>
  <div class="dropdown-content">
    <a href="newjsp.jsp">Link 1</a>
    <a href="#">Link 2</a>
    <a href="#">Link 3</a>
  </div>
</div>
<fieldset>
        <div class="row">
        <section class="col col-4" ng-repeat="n in [] | range:5">
        <label class="input">
            <input type="text" placeholder="Names" ng-model="pd.names[$index]" >
        </label>
        </section>
        </div>
    </fieldset>
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" href="trymodal.jsp" data-target="#myModal">Open Modal</button>

<div ng-app="myApp" ng-controller="myCtrl">

<ol>
<li ng-repeat="element in elements">
    <input type="text" ng-model="element.value"/>
    </li>
</ol>
<br/>
<b>Click here to add Textbox:</b><br/><input type="button" value="New Item" ng-click="newItem()"/>
<br/>
<br/>

<b>Click here to see ng-model value:</b><br/>
<input type="button" value="submit" ng-click="show(elements)">
 <div id="main">
        <input type="button" id="btAdd" value="Add Element" class="bt" />
        <input type="button" id="btRemove" value="Remove Element" class="bt" />
        <input type="button" id="btRemoveAll" value="Remove All" class="bt" /><br />
    </div>
</div>
  <div id="myModal" class="modal fade text-center">
    <div class="modal-dialog">
      <div class="modal-content">
      </div>
    </div>
  </div>
</body>
</html>
