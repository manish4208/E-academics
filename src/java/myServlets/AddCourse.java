
package myServlets;

import Beans.AddCourseBean;
import DbConnection.CourseOperation;
import DbConnection.DbOperation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Rajat
 */
@WebServlet(name = "AddCourse", urlPatterns = {"/AddCourse"})
public class AddCourse extends HttpServlet {
 final private String  path="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\CourseImage\\c_";
   private String temp="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\CourseImage\\";
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
                   CourseOperation db=new CourseOperation();
            AddCourseBean cb=new AddCourseBean();
            int courseid=db.getCourseid();
            
           DiskFileItemFactory factory=new DiskFileItemFactory();
            
            factory.setSizeThreshold(500000);
            factory.setRepository(new File(temp));
            
            ServletFileUpload upload=new ServletFileUpload(factory);
            
            
            
            List<FileItem> items=upload.parseRequest(request);
                for(FileItem item:items)
                {  
                    if(item.isFormField())
                    {
                    String name=item.getFieldName();
                    String value=item.getString();
                    if(name.equals("coursename"))
                    {
                       cb.setCoursname(value);
                    }
                    if(name.equals("coursedescription"))
                    {
                       cb.setCoursedescription(value);
                    }
                     if(name.equals("courseprice"))
                    {
                       cb.setCourseprice(value);
                    }
                     if(name.equals("courseduration"))
                    {
                       cb.setCourseduration(value);
                    }
                     if(name.equals("courseid"))
                    {
                           int id=Integer.parseInt(value);
                       cb.setCourseid(id);
                    }
                     if(name.equals("coursecategory"))
                    {
                       cb.setCategory(name);
                    }
                      
                    }
                
               else
                {
                    InputStream is=item.getInputStream();
                        byte[] b=new byte[5000000];
                        is.read(b);
                        File f1=new File(path+courseid+".jpg");
                        FileOutputStream fo=new FileOutputStream(f1);
                        fo.write(b);
                    cb.setCourseimage(f1.getName());
                    
                
               
            }
            }
            boolean res=db.Addcourse(cb);
          if(res){
                     response.sendRedirect("addcourse.jsp");
                   RequestDispatcher rds=request.getRequestDispatcher("success.jsp");
                     rds.include(request, response);
               
            }
            else {
                response.sendRedirect("Error.jsp");
            }
        }   
        catch(Exception ex)
        {
            System.out.println(ex);
        }        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
