package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dynamicAddTextbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>  \n");
      out.write("                    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        var app = angular.module('colour', []);\n");
      out.write("\n");
      out.write("  app.controller('MainCtrl', function($scope) {\n");
      out.write("      \n");
      out.write("\n");
      out.write(" \n");
      out.write("  $scope.order=[{}];\n");
      out.write("  var cnt=1;\n");
      out.write("  \n");
      out.write(" // $scope.choices=[{}];\n");
      out.write("   $scope.choices = [{'colour_way':cnt+'-'+colqty}];\n");
      out.write("   cnt=2;\n");
      out.write("  $scope.addNewChoice = function() {\n");
      out.write("      var colqty= document.getElementById(\"colqty\").value;\n");
      out.write("   \n");
      out.write("      \n");
      out.write("      if(cnt<=colqty){\n");
      out.write("    var newItemNo = $scope.choices.length+1;\n");
      out.write("    $scope.choices.push({'id':'choice'+newItemNo,colour_way:cnt+'-'+colqty});      \n");
      out.write("   \n");
      out.write("     cnt++;\n");
      out.write("      }\n");
      out.write("  };\n");
      out.write("  $scope.add=function(){\n");
      out.write("      $scope.order.push({});\n");
      out.write("  }\n");
      out.write("    \n");
      out.write("  $scope.removeChoice = function() {\n");
      out.write("    var lastItem = $scope.choices.length-1;\n");
      out.write("    $scope.choices.splice(lastItem);\n");
      out.write("  };\n");
      out.write("  \n");
      out.write("  });\n");
      out.write("                  </script>\n");
      out.write("                  <style>\n");
      out.write("                      fieldset{\n");
      out.write("    background: #FCFCFC;\n");
      out.write("    padding: 16px;\n");
      out.write("    border: 1px solid #D5D5D5;\n");
      out.write("}\n");
      out.write(".addfields{\n");
      out.write("    margin: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#choicesDisplay {\n");
      out.write("    padding: 10px;\n");
      out.write("    background: rgb(227, 250, 227);\n");
      out.write("    border: 1px solid rgb(171, 239, 171);\n");
      out.write("    color: rgb(9, 56, 9);\n");
      out.write("}\n");
      out.write(".remove{\n");
      out.write("    background: #C76868;\n");
      out.write("    color: #FFF;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 21px;\n");
      out.write("    border: 0;\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 4px 9px;\n");
      out.write("    vertical-align: top;\n");
      out.write("    line-height: 100%;   \n");
      out.write("}\n");
      out.write("input[type=\"text\"],\n");
      out.write("select{\n");
      out.write("    padding:5px;\n");
      out.write("}\n");
      out.write("                  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Add Colours</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("        <div ng-app=\"colour\" ng-controller=\"MainCtrl\">\n");
      out.write("            colour Quantity<input type=\"text\" ng-model=\"colqty\" id=\"colqty\" name=\"colqty\"/>\n");
      out.write("   <fieldset  data-ng-repeat=\"choice in choices\">\n");
      out.write("         <input type=\"text\" ng-model=\"choice.colour\" name=\"\" placeholder=\"Enter colour code\">\n");
      out.write("      <select ng-model=\"choice.ph\">\n");
      out.write("         <option>Mobile</option>\n");
      out.write("         <option>Office</option>\n");
      out.write("         <option>Home</option>\n");
      out.write("      </select>\n");
      out.write("      <input type=\"text\" ng-model=\"choice.colour_way\"  value=\"1\"  name=\"\">\n");
      out.write("       <input type=\"text\" ng-model=\"choice.colour_qty\" name=\"\" placeholder=\"Enter colour quantity\">\n");
      out.write("      <button class=\"remove\" ng-show=\"$last\" ng-click=\"removeChoice()\" button tiny radius>-</button>\n");
      out.write("   </fieldset>\n");
      out.write("   <button class=\"addfields\" ng-click=\"addNewChoice()\" button tiny radius>Add fields</button>\n");
      out.write("       \n");
      out.write("   <div id=\"choicesDisplay\">\n");
      out.write("      {{ choices }}\n");
      out.write("   </div>\n");
      out.write("     </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("   <div ng-app=\"colour\" ng-controller=\"MainCtrl\">\n");
      out.write("   <fieldset data-ng-repeat=\"data in order\">\n");
      out.write("       <input type=\"text\" ng-model=\"data.name\"/>\n");
      out.write("       \n");
      out.write("   </fieldset>\n");
      out.write("        <button class=\"addfields\" ng-click=\"add()\">Add fields</button>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("    </body>\n");
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
