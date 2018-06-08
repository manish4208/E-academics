
package myServlets;

import Beans.UploadBean;
import DbConnection.CourseOperation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


@WebServlet(name = "AddVideo", urlPatterns = {"/AddVideo"})
public class AddVideo extends HttpServlet {
          final private String  path="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\CourseVideo\\v_";
   private String temp="C:\\Users\\Rajat\\Documents\\NetBeansProjects\\Learning\\web\\Temp\\";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
                CourseOperation courseop=new CourseOperation();
                  UploadBean upbean=new UploadBean();
                     int videoid=courseop.getvideoid();
                       DiskFileItemFactory factory=new DiskFileItemFactory();
                          factory.setSizeThreshold(5000);
                            factory.setRepository(new File(temp));
                               ServletFileUpload upload=new ServletFileUpload(factory);
                                   List<FileItem> items=upload.parseRequest(request);
                                       for(FileItem item:items){
                                           
                                           if(item.isFormField()){
                                               String name=item.getFieldName();
                                                 String value=item.getString();
                                                    if(name.equals("courseid")){
                                                        int courseid=Integer.parseInt(value);
                                                          upbean.setCourseid(courseid);
                                                    }
                                                       if(name.equals("videodescription")){
                                                           upbean.setVideodescription(value);
                                                       }
                                           }
                                                       else{ 
                                                           InputStream ios=item.getInputStream();
                                                             byte[] b=new  byte[5000];
                                                                ios.read(b);
                                                                  File f1=new File(path+videoid+".mp4");
                                                                FileOutputStream fos=new FileOutputStream(f1);
                                                                   fos.write(b);
                                                                      upbean.setVideoupload(f1.getName());
                                                       }      
                                       }
                                              boolean res=courseop.uploadvideo(upbean);
                                                      
                                                  if(res){
                                                      response.sendRedirect("addvideo.jsp");
                                                  }
                                                  else{
                                                         response.sendRedirect("Error.jsp");
                                                      
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
            Logger.getLogger(AddVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(AddVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
