package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Textboxwithoutbuttonclick_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>  \n");
      out.write("         <script>\n");
      out.write("             \n");
      out.write("             var app = angular.module(\"cookieApp\", [\"ngCookies\"]);\n");
      out.write("\n");
      out.write("app.controller(\"cookieCtrl\", function ($scope, $cookies) {\n");
      out.write("\t$scope.numbers= [1,2,3,4,5,6];\n");
      out.write("  $scope.userVals=[];\n");
      out.write("  $scope.getVal= function(){\n");
      out.write("  \tconsole.log($scope.userVals);\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("         </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div ng-app=\"cookieApp\" ng-controller=\"cookieCtrl\">\n");
      out.write("    <div class=\"orgevent\" ng-repeat=\"i in numbers  track by $index\">\n");
      out.write("      <input class=\"dest\" type=\"text\" value=\"Free text\" ng-model=\"userVals[$index]\">\n");
      out.write("    </div>\n");
      out.write("    <button ng-click=\"getVal()\">Read</button>\n");
      out.write("</div>\n");
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
