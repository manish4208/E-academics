
package myServlets;

import Beans.UploadBean;
import DbConnection.CourseOperation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Rajat
 */
@WebServlet(name = "AddPdf", urlPatterns = {"/AddPdf"})
public class AddPdf extends HttpServlet {
 final private String  path="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\CoursePdf\\p_";
   private String temp="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\Temp\\";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
               CourseOperation course=new CourseOperation();
                 UploadBean upbean=new UploadBean();
                   int pdfid=course.pdfUploadId();
                     DiskFileItemFactory factory=new DiskFileItemFactory();
                       factory.setSizeThreshold(5000);
                         factory.setRepository(new File(temp));
                          ServletFileUpload uplaod=new ServletFileUpload(factory);
                           List<FileItem> items=uplaod.parseRequest(request);
                            for(FileItem item:items){     
                                
                                   
                                if(item.isFormField()){
                                      String name=item.getFieldName();
                                        String value=item.getString();
                                          if(name.equals("courseid"))
                                          {
                                              int id=Integer.parseInt(value);
                                               upbean.setCourseid(id);
                                  } 
                                            if(name.equals("pdfname")){
                                                upbean.setPdfdescription(value);
                                            }
                                                
        }
                                else{
                                        InputStream is=item.getInputStream();
                                          byte b[]=new byte[5000];
                                             is.read(b);
                                               File f1=new File(path+pdfid+".pdf");
                                                 FileOutputStream fos=new FileOutputStream(f1);
                                                   fos.write(b);
                                                     upbean.setPdfupload(f1.getName());
                                }
                            }
                                         boolean res=course.pdfupload(upbean);
                                          if(res){
                                                
                                                response.sendRedirect("addpdf.jsp");
                                              RequestDispatcher rds=request.getRequestDispatcher("Your Record is successfully updated");
                                                 rds.include(request, response);                                          
                                          }
                                          else{
                                             response.sendRedirect("Error.jsp.jsp");
                                          }
        }
                                           
                            
                                 
        finally {            
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(AddPdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(AddPdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
