package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>  \n");
      out.write("              <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-filter/0.5.16/angular-filter.js\"></script>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://rawgit.com/dwmkerr/angular-modal-service/master/dst/angular-modal-service.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css\"/>\n");
      out.write("      <script src=\"https://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.6.0.js\" type=\"text/javascript\"></script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.11.0/ui-bootstrap-tpls.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".dropbtn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("var app = angular.module('myApp', []);\n");
      out.write("app.controller('myCtrl', function($scope) {\n");
      out.write(" var counter=0;\n");
      out.write("    $scope.elements = [ {id:counter, value : ''} ];\n");
      out.write("\n");
      out.write("    $scope.newItem = function(){\n");
      out.write("        counter++;\n");
      out.write("        $scope.elements.push(  { id:counter,value:''} );\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    $scope.show=function(elements)\n");
      out.write("    {\n");
      out.write("        alert(JSON.stringify(elements));\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("  \n");
      out.write("});\n");
      out.write("\n");
      out.write(" $(document).ready(function() {\n");
      out.write("       var iCnt = 0;\n");
      out.write("        // CREATE A \"DIV\" ELEMENT AND DESIGN IT USING jQuery \".css()\" CLASS.\n");
      out.write("        var container = $(document.createElement('div')).css({\n");
      out.write("            padding: '5px', margin: '20px', width: '170px', border: '1px dashed',\n");
      out.write("            borderTopColor: '#999', borderBottomColor: '#999',\n");
      out.write("            borderLeftColor: '#999', borderRightColor: '#999'\n");
      out.write("  });\n");
      out.write("\n");
      out.write("        $('#btAdd').click(function() {\n");
      out.write("            if (iCnt <= 3) {\n");
      out.write("\n");
      out.write("                iCnt = iCnt + 1;\n");
      out.write("\n");
      out.write("                // ADD TEXTBOX.\n");
      out.write("                $(container).append('<input type=text class=\"input\" id=tb' + iCnt + ' ' +\n");
      out.write("                            'value=\"Text Element ' + iCnt + '\" />');\n");
      out.write("\n");
      out.write("                // SHOW SUBMIT BUTTON IF ATLEAST \"1\" ELEMENT HAS BEEN CREATED.\n");
      out.write("                if (iCnt == 1) {\n");
      out.write("\n");
      out.write("                    var divSubmit = $(document.createElement('div'));\n");
      out.write("                    $(divSubmit).append('<input type=button class=\"bt\"' + \n");
      out.write("                        'onclick=\"GetTextValue()\"' + \n");
      out.write("                            'id=btSubmit value=Submit />');\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // ADD BOTH THE DIV ELEMENTS TO THE \"main\" CONTAINER.\n");
      out.write("                $('#main').after(container, divSubmit);\n");
      out.write("            }\n");
      out.write("            // AFTER REACHING THE SPECIFIED LIMIT, DISABLE THE \"ADD\" BUTTON.\n");
      out.write("            // (20 IS THE LIMIT WE HAVE SET)\n");
      out.write("            else {      \n");
      out.write("                $(container).append('<label>Reached the limit</label>'); \n");
      out.write("                $('#btAdd').attr('class', 'bt-disable'); \n");
      out.write("                $('#btAdd').attr('disabled', 'disabled');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    // PICK THE VALUES FROM EACH TEXTBOX WHEN \"SUBMIT\" BUTTON IS CLICKED.\n");
      out.write("    var divValue, values = '';\n");
      out.write("\n");
      out.write("    function GetTextValue() {\n");
      out.write("\n");
      out.write("        $(divValue) \n");
      out.write("            .empty() \n");
      out.write("            .remove(); \n");
      out.write("        \n");
      out.write("        values = '';\n");
      out.write("\n");
      out.write("        $('.input').each(function() {\n");
      out.write("            divValue = $(document.createElement('div')).css({\n");
      out.write("                padding:'5px', width:'200px'\n");
      out.write("            });\n");
      out.write("            values += this.value + '<br />'\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(divValue).append('<p><b>Your selected values</b></p>' + values);\n");
      out.write("        $('body').append(divValue);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body  data-ng-controller=\"myCtrl1\">\n");
      out.write("\n");
      out.write("<h2>Hoverable Dropdown</h2>\n");
      out.write("<p>Move the mouse over the button to open the dropdown menu.</p>\n");
      out.write("\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">Dropdown</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"newjsp.jsp\">Link 1</a>\n");
      out.write("    <a href=\"#\">Link 2</a>\n");
      out.write("    <a href=\"#\">Link 3</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<fieldset>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <section class=\"col col-4\" ng-repeat=\"n in [] | range:5\">\n");
      out.write("        <label class=\"input\">\n");
      out.write("            <input type=\"text\" placeholder=\"Names\" ng-model=\"pd.names[$index]\" >\n");
      out.write("        </label>\n");
      out.write("        </section>\n");
      out.write("        </div>\n");
      out.write("    </fieldset>\n");
      out.write("            <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" href=\"trymodal.jsp\" data-target=\"#myModal\">Open Modal</button>\n");
      out.write("\n");
      out.write("<div ng-app=\"myApp\" ng-controller=\"myCtrl\">\n");
      out.write("\n");
      out.write("<ol>\n");
      out.write("<li ng-repeat=\"element in elements\">\n");
      out.write("    <input type=\"text\" ng-model=\"element.value\"/>\n");
      out.write("    </li>\n");
      out.write("</ol>\n");
      out.write("<br/>\n");
      out.write("<b>Click here to add Textbox:</b><br/><input type=\"button\" value=\"New Item\" ng-click=\"newItem()\"/>\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<b>Click here to see ng-model value:</b><br/>\n");
      out.write("<input type=\"button\" value=\"submit\" ng-click=\"show(elements)\">\n");
      out.write(" <div id=\"main\">\n");
      out.write("        <input type=\"button\" id=\"btAdd\" value=\"Add Element\" class=\"bt\" />\n");
      out.write("        <input type=\"button\" id=\"btRemove\" value=\"Remove Element\" class=\"bt\" />\n");
      out.write("        <input type=\"button\" id=\"btRemoveAll\" value=\"Remove All\" class=\"bt\" /><br />\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("  <div id=\"myModal\" class=\"modal fade text-center\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
