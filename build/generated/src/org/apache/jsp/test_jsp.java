package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"source/secApp.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("        <script src=\"source/secApp.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body ng-app=\"testApp\">\r\n");
      out.write("        <h1 ng-controller=\"testCtrl\">{{abc}}</h1>\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Location</th>\r\n");
      out.write("                <th>Sub-Location</th>\r\n");
      out.write("                <th>Plat Size(sq.ft.)</th>\r\n");
      out.write("                <th>Room No.</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Hire Date</th>\r\n");
      out.write("                <th>Action</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr ng-repeat=\"x in homes\"> \r\n");
      out.write("                <td>{{x.location}}</td>\r\n");
      out.write("                <td>{{x.sublocation}}</td>\r\n");
      out.write("                <td>{{x.platsize}}</td>\r\n");
      out.write("                <td>{{x.room}}</td>\r\n");
      out.write("                <td>{{x.price}}</td>\r\n");
      out.write("                <td>{{x.hiredate}}</td>\r\n");
      out.write("                <!--<td><a ng-click=\"updateHome(home)\" class=\"btn btn-link\">Edit</a> | <a ng-click=\"deleteHome(home)\" class=\"\">Delete</a></td>-->\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
