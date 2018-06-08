package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/dheader.jspf");
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
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/mycss.css\" type=\"text/css\" media=\"all\"/>\n");
      out.write("</head>   \n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#codebrainery-toggle-nav\" aria-expanded=\"false\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Olearning</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"codebrainery-toggle-nav\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\">My Course</a></li>\n");
      out.write("            <li><a href=\"#\">All Course</a></li>\n");
      out.write("               <li><a href=\"#\">Home Page</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"glyphicon glyphicon-user fa-5x \"></span></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\">Start Learning</a></li>\n");
      out.write("                <li><a href=\"#\">View All Courses</a></li>\n");
      out.write("                <li><a href=\"#\">Chat with a CodeGuide</a></li>\n");
      out.write("                   <li><a href=\"#\">Edit Profile</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div> <!-- close container div -->\n");
      out.write("    </nav> <!-- close navbar nav -->\n");
      out.write("   <!------header----->");
      out.write("\n");
      out.write("   <section class=\"success\" id=\"about\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <h2>Add Course </h2>\n");
      out.write("                    <hr class=\"star-light\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                    <form action=\"AddCourse\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"text\">Course Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"coursename\" id=\"name\" placeholder=\"Enter Course Name\" required>\n");
      out.write("                        </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Course Description</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Course Description\" name=\"coursedescription\" required>\n");
      out.write("    </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                           <label class=\"text\">Course Image</label>\n");
      out.write("                           <input type=\"file\" class=\"form-control\" id=\"phone\" name=\"courseimage\" placeholder=\"Upload Image.\"required size=\"5000\">\n");
      out.write("                        </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Course Price</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Course Price\" name=\"courseprice\" required>\n");
      out.write("    </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Course Duration</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Course duration\" name=\"courseduration\" required>\n");
      out.write("    </div>\n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Course Id</label>\n");
      out.write("      <input type=\"number\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter course Id\" name=\"courseid\" required>\n");
      out.write("    </div>      \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Category</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Course category\" name=\"coursecategory\" required>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                        <i class=\"fa fa-circle-o-notch fa-spin fa-3x fa-fw\"></i>\n");
      out.write("<span class=\"sr-only\">Loading...</span> AddCourse Detail\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
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
