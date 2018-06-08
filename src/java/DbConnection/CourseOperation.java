
package DbConnection;
import java.util.*;
import Beans.AddCourseBean;
import Beans.UploadBean;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date.*;

public class CourseOperation {
    Connection con=Connect.getConnection();
      public int getCourseid(){
        int courseid=0;
          try{
              String sql="select MAX(courseid) from myproject.coursedetail";
          PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
              if(rs.next()){
                  courseid=rs.getInt(1);
              }
}
           catch(Exception e){
          System.out.println("excetion at getcourseid"+e);
      }
           return ++courseid;
}
        public boolean Addcourse(AddCourseBean adcourse){
            try{
                String sql="insert into myproject.coursedetail values(?,?,?,?,?,?,?)";
                  PreparedStatement ps=con.prepareStatement(sql);  
                    ps.setString(1, adcourse.getCoursname());
                      ps.setString(2, adcourse.getCoursedescription());
                           ps.setString(3, adcourse.getCourseduration());
                             ps.setString(4, adcourse.getCategory());
                               ps.setInt(5, adcourse.getCourseid());
                                  ps.setString(6, adcourse.getCourseimage());
                                    ps.setString(7, adcourse.getCourseprice());
                         int i=ps.executeUpdate();
                           if(i>0){
                               return true;
                           }
                                
                      
            }
              catch(Exception e){
                  System.out.println("Exception in AddCourse"+e);
              }
               return false;
        }
                   public int pdfUploadId() {
                      int pdfid=0;
                         try{
                               String sql="select MAX(pdfid) from myproject.uploadpdf";
                             PreparedStatement ps=con.prepareStatement(sql);
                               ResultSet rs=ps.executeQuery();
                                 if(rs.next()){
                                     rs.getInt(1);
                                 }
                         }
                                 catch(Exception e){
                                       System.out.println("Exception at pdfUploadId"+e);
                         }
                           return ++pdfid;
                  }
                    public  boolean pdfupload(UploadBean ub) throws SQLException{
                          try{
                          String sql="insert into myproject.uploadpdf values(?,?,?)";
                             PreparedStatement ps=con.prepareStatement(sql);
                               ps.setString(1, ub.getPdfdescription());
                                 ps.setString(2, ub.getPdfupload());
                                 
                                   ps.setInt(3, ub.getCourseid());
                                  
                                       int i=ps.executeUpdate();
                      
                        if(i>0){
                                return true;
}
                          }
                           catch(Exception e){
    System.out.println("Exception in pdfupload operation"+e);
}
    return false;
}
                        public int getvideoid() {
                               int videoid=0;
                                  try{
                                      String sql="select MAX(videoid) from myproject.uploadvideo";
                                        PreparedStatement ps=con.prepareStatement(sql);
                                          ResultSet rs=ps.executeQuery();
                                            if(rs.next()){
                                                rs.getInt(1);
                                            }
                                              
                                      
                                  }
                                    catch(Exception e){
                                        System.out.println("exception at getvideoId"+e);
                                        
                                    }
                                       return ++videoid;
                        } 
                           public boolean uploadvideo(UploadBean upbean){
                                    try{
                                           String sql="insert into myproject.uploadvideo values(?,?,?,?)";
                                          PreparedStatement ps=con.prepareStatement(sql);        
                                           ps.setInt(1, upbean.getCourseid());
                                             ps.setString(2, upbean.getVideodescription());
                                               ps.setString(3, upbean.getVideoupload());
                                                ps.setInt(4, upbean.getVideoid());
                                                 int i=ps.executeUpdate();
                                                    if(i>0){
                                                        return true;
                                                    }
                                        
                                    }
                                       catch(Exception e){
                                         System.out.println("Exception at uploadvideo operaation");                 
                          
                                       }
                                          
                               return false;
                              
                           }
                    
                    
                    public ArrayList Viewcourses(){
                          ArrayList al=new ArrayList();
                           try{
                                 String sql="select *from myproject.coursedetail";
                            PreparedStatement ps=con.prepareStatement(sql);  
                            ResultSet rs=ps.executeQuery();
                              while(rs.next()){
                             AddCourseBean adc=new AddCourseBean();
                               adc.setCoursname(rs.getString(1));
                                 adc.setCoursedescription(rs.getString(2));
     
                                     adc.setCourseduration(rs.getString(3));
                                         adc.setCategory(rs.getString(4));
                                             adc.setCourseid(rs.getInt(5));
                                       adc.setCourseimage(rs.getString(6));
                                         adc.setCourseprice(rs.getString(7));
                                      
                                al.add(adc);                
                              }      
                        
                    }    
                           catch(Exception e){
                               System.out.println("Exception at ViewCourses operation");
                                  }
                        
                        return al;
                    }
                     public AddCourseBean showcourseinfo(int s) {
                           AddCourseBean cb=new AddCourseBean();
                           try{
                                 String sql="select *from myproject.coursedetail where courseid=?";
                               PreparedStatement ps=con.prepareStatement(sql);
                                 ps.setInt(1, s);
                                   ResultSet rs=ps.executeQuery();
                                     while(rs.next()){
                                        cb.setCoursname(rs.getString(1));
                                          cb.setCoursedescription(rs.getString(2));
                                              cb.setCourseduration(rs.getString(3));
                                                cb.setCategory(rs.getString(4));
                                                  cb.setCourseid(rs.getInt(5));
                                                    cb.setCourseimage(rs.getString(6));
                                                      cb.setCourseprice(rs.getString(7));
                                                
                                     }
                               
                               
                           }
                              catch(Exception e){
                         System.out.println("Exception at showcourseinfo:"+e);
                     }
                         return cb;
                         
                     }
                       public boolean coursefeature(AddCourseBean adc) throws SQLException{
                           try{
         
                                 String sql="insert into myproject.coursefeature values(?,?)";
                                 PreparedStatement ps=con.prepareStatement(sql);
                                   ps.setInt(1, adc.getCourseid());
                                    ps.setString(2, adc.getFeature());
                                      int i=ps.executeUpdate();
                                        if(i>0){
                                            return true;
                                        }
                           }
                                          catch(Exception e){
                                              System.out.println("exception at cooursefeature"+e);
                                          }
                                      
                           return false;
}
                    
       public ArrayList showvideo(String s){
             ArrayList al=new ArrayList();
               try{
                   String sql="select *from myproject.uploadvideo where courseid=?";
                     PreparedStatement ps=con.prepareStatement(sql);
                       ps.setString(1,s);
                   ResultSet rs=ps.executeQuery();
                     while(rs.next()){
                         UploadBean up=new UploadBean();
                           up.setCourseid(rs.getInt(1));
                             up.setVideodescription(rs.getString(2));
                             up.setVideoupload(rs.getString(3));
                               up.setVideoid(rs.getInt(4));
                              al.add(up);
                     }
                   
               }
                 catch(Exception e)
                 {
                     System.out.println("Exception at showvideo in dboperation"+e);
                 }
           return al;
       }
                       
}