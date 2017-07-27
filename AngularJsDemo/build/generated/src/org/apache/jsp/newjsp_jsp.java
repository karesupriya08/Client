package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <script src=\"https://code.angularjs.org/1.4.9/angular.min.js\"></script>\n");
      out.write("<script src=\"https://rawgit.com/dwmkerr/angular-modal-service/master/dst/angular-modal-service.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("     var app = angular.module('app', ['angularModalService']);\n");
      out.write("\n");
      out.write("app.controller('Controller', function($scope, ModalService) {\n");
      out.write("    \n");
      out.write("    $scope.show = function() {\n");
      out.write("        ModalService.showModal({\n");
      out.write("            templateUrl: 'modal.html',\n");
      out.write("            controller: \"ModalController\"\n");
      out.write("        }).then(function(modal) {\n");
      out.write("            modal.element.modal();\n");
      out.write("            modal.close.then(function(result) {\n");
      out.write("                $scope.message = \"You said \" + result;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    };\n");
      out.write("    \n");
      out.write("});\n");
      out.write("\n");
      out.write("app.controller('ModalController', function($scope, close) {\n");
      out.write("  \n");
      out.write(" $scope.close = function(result) {\n");
      out.write(" \tclose(result, 500); // close, but give 500ms for bootstrap to animate\n");
      out.write(" };\n");
      out.write("\n");
      out.write("});\n");
      out.write("      </script>  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" ng-app=\"app\" ng-controller=\"Controller\">\n");
      out.write("\n");
      out.write("    <h3>Angular Modal Service</h3>\n");
      out.write("     <a class=\"btn btn-default\" href ng-click=\"show()\">Show a Modal</a>\n");
      out.write("     <p>{{message}}</p>\n");
      out.write("     \n");
      out.write("     <!-- The actual modal template, just a bit o bootstrap -->\n");
      out.write("     <script type=\"text/ng-template\" id=\"modal.html\">\n");
      out.write("         <div class=\"modal fade\">\n");
      out.write("          <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" ng-click=\"close('Cancel')\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Yes or No?</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                <p>It's your call...</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" ng-click=\"close('No')\" class=\"btn btn-default\" data-dismiss=\"modal\">No</button>\n");
      out.write("                <button type=\"button\" ng-click=\"close('Yes')\" class=\"btn btn-primary\" data-dismiss=\"modal\">Yes</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("     </script>\n");
      out.write("    \n");
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
