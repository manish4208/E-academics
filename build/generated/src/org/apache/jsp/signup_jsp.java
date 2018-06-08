package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/header.jspf");
    _jspx_dependants.add("/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Freelancer - Start Bootstrap Theme</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Theme CSS -->\n");
      out.write("    <link href=\"css/freelancer.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");
      out.write("<div id=\"skipnav\"><a href=\"#maincontent\">Skip to main content</a></div>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top navbar-custom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header page-scroll\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span> Menu <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#page-top\">WeLearn</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"hidden\">\n");
      out.write("                        <a href=\"#page-top\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"page-scroll\">\n");
      out.write("                        <a href=\"#portfolio\">Courses</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"page-scroll\">\n");
      out.write("                        <a href=\"#about\">Sign In</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"page-scroll\">\n");
      out.write("                        <a href=\"#contact\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("  ");
      out.write("\n");
      out.write(" <section class=\"success\" id=\"about\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <h2>Sign In</h2>\n");
      out.write("                    <hr class=\"star-light\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                    <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"text\">Frist Nmae</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"name\" placeholder=\"Enter First Nmae here\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                           <label class=\"text\">Last Nmae</label>\n");
      out.write("                           <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"name\" placeholder=\"Enter Last Nmae here\" required>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\" required>\n");
      out.write("    </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                           <label class=\"text\">Mobno.</label>\n");
      out.write("                           <input type=\"text\" class=\"form-control\" id=\"phone\" name=\"mobno\" placeholder=\"Enter Mobno.\"required>\n");
      out.write("                        </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Password:</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pwd\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("      <label><input type=\"checkbox\" name=\"remember\"> Remember me</label>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                        <i class=\"fa fa-circle-o-notch fa-spin fa-3x fa-fw\"></i>\n");
      out.write("<span class=\"sr-only\">Loading...</span> SignUp\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"col-lg-4 col-lg-offset-2\" >\n");
      out.write("                       <h4>Already have an Account Click on Sign</h4>\n");
      out.write("                       <a href=\"index.jsp\">Login</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("  <!-- Footer -->\n");
      out.write("    <footer class=\"text-center\">\n");
      out.write("        <div class=\"footer-above\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>Location</h3>\n");
      out.write("                        <p>\n");
      out.write("                            <br>Fgiet</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>Around the Web</h3>\n");
      out.write("                        <ul class=\"list-inline\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><span class=\"sr-only\">Facebook</span><i class=\"fa fa-fw fa-facebook\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><span class=\"sr-only\">Google Plus</span><i class=\"fa fa-fw fa-google-plus\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><span class=\"sr-only\">Twitter</span><i class=\"fa fa-fw fa-twitter\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><span class=\"sr-only\">Linked In</span><i class=\"fa fa-fw fa-linkedin\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><span class=\"sr-only\">Dribble</span><i class=\"fa fa-fw fa-dribbble\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>About Welearn</h3>\n");
      out.write("                        <p>Learn new skills and get certified and get ahead <a href=\"http://startbootstrap.com\">Start Bootstrap</a>.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-below\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        Copyright &copy; Rajat\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>");
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
