package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class invoiceHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html ng-app=\"testApp\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Invoice Page</title>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"source/secApp.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\n");
      out.write("        <script src=\"source/secApp.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .odd{\n");
      out.write("                background-color: #3DBBE8;\n");
      out.write("            }\n");
      out.write("            .even{\n");
      out.write("                background-color: sandybrown;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body ng-controller=\"testCtrl\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-offset-3 col-md-6 panel\" style=\"margin-top: 25px;\">\n");
      out.write("                <h3 class=\"panel-heading bg-info text-info text-center\">\n");
      out.write("                    House Detail\n");
      out.write("                </h3>\n");
      out.write("                <form ng-submit=\"submitHome()\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"location\">Location:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"location\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"sub-location\">Sub-Location:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"sub-location\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"size\">Plat Size</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"size\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"room\">Room No.</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"room\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"location\">Hire Date</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"location\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"location\">Price:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"location\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-sm\">Submit</button>\n");
      out.write("                    <button class=\"btn btn-danger col-md-offset-9\">Logout</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 panel\" ng-controller=\"testCtrl\">\n");
      out.write("                <h3 class=\"panel-heading text-center\">All Home Information</h3>\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr style=\"background-color: #204d74; color: #fff;\">\n");
      out.write("                        <th>#</th>\n");
      out.write("                        <th>Location</th>\n");
      out.write("                        <th>Sub-Location</th>\n");
      out.write("                        <th>Plat Size(sq.ft.)</th>\n");
      out.write("                        <th>Room No.</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Hire Date</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr ng-repeat=\"x in homes\" ng-class=\"$odd?'odd':'even'\"> \n");
      out.write("                        <td>{{$index + 1}}</td>\n");
      out.write("                        <td>{{x.location}}</td>\n");
      out.write("                        <td>{{x.sublocation}}</td>\n");
      out.write("                        <td>{{x.platsize}}</td>\n");
      out.write("                        <td>{{x.room}}</td>\n");
      out.write("                        <td>{{x.price | currency : '৳'}}</td>\n");
      out.write("                        <td>{{x.hiredate}}</td>\n");
      out.write("                        <td><a ng-click=\"updateHome(home)\" class=\"btn btn-link\">Edit</a> | <a ng-click=\"deleteHome(home)\" class=\"\">Delete</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
