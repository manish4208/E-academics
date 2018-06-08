
package myServlets;

import Beans.AddCourseBean;
import DbConnection.CourseOperation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "coursefeature", urlPatterns = {"/coursefeature"})
public class coursefeature extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
              CourseOperation cop=new CourseOperation();
                AddCourseBean adc=new AddCourseBean();
            String courseid=request.getParameter("courseid");
              int coourseid=Integer.parseInt(courseid);
                String feature=request.getParameter("feature");
                   adc.setCourseid(coourseid);
                     adc.setFeature(feature);
                       boolean status=cop.coursefeature(adc);
                         if(status){
                             response.sendRedirect("addcoursefeature.jsp");
                         }
                         else{
                             response.sendRedirect("Error.jsp.jsp");
                         }
                  
        } finally {            
            out.close();
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(coursefeature.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(coursefeature.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
