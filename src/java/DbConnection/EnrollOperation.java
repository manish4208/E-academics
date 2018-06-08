
package DbConnection;

import Beans.EnrollBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rajat
 */
public class EnrollOperation {
     Connection con=Connect.getConnection(); 
       int enrollid=0;
         public int getEnrollid() throws SQLException{
             try
             {
                 String sql="select MAX(enrollid) myproject.enroll";
                   PreparedStatement ps=con.prepareStatement(sql);
                     ResultSet rs=ps.executeQuery();
                       if(rs.next()){
                           enrollid=rs.getInt(1);
                       }
             }
                         catch(Exception e){
                             System.out.println("Exception at getEnrollid"+e);
                         }
                return ++enrollid;
             }
         
       public boolean enrollform(EnrollBean enroll){
             try{
                   String sql="insert into myproject.enroll values(?,?,?,?)";
                 PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1, enroll.getEmailid());
                      ps.setInt(2, enroll.getCourseid());
                       ps.setString(3, enroll.getQuizscore());
                         ps.setInt(4, enroll.getEnrollid());
                         int i=ps.executeUpdate();
                           if(i>0)
                           {
                               return true;
                           }
             }
               catch(Exception e){
                  System.out.println("Exception at enrollform in Enrolloperation"+e);
               }
            
           
           return false;
           
       }
     
       
       
       
       
       
       
       
       
       
}
