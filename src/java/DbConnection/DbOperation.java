
package DbConnection;
import Beans.RecordBean;
import Beans.RegisterBean;
import Beans.UploadBean;
import Beans.mybean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
                                                                                
public class DbOperation {
      Connection con=Connect.getConnection();
        boolean status;
            int row;
            String query;
              PreparedStatement ps;
          public boolean chechLogin(mybean login){
                try{
                     query="select * from learning where email=? and password=?";
                       ps=con.prepareStatement(query);
                          ps.setString(1, login.getUserName());
                            ps.setString(2, login.getPassword());
                             ResultSet rs=ps.executeQuery();
                                status=rs.next();
                }
                  catch(Exception e){
                      System.out.println("Exception at Data Operation"+e.toString());
                  }
                 if(status){
                     return true;
                 }
                 else{
                     return false;
                 }
          }
            public int register(RegisterBean rgb){
               
               try{ 
                   query="insert into learning values(?,?,?,?,?)";
                     ps=con.prepareStatement(query);
                   ps.setString(1, rgb.getFirstname());
                    ps.setString(2, rgb.getLastname());
                      ps.setString(3, rgb.getEmail());
                        ps.setString(4, rgb.getMobno());
                          ps.setString(5, rgb.getPassword());
                       row  = ps.executeUpdate();
                                                                                
               }
                 catch(Exception e){
                     e.printStackTrace();
                 }
                 return row;
            }
               public ArrayList getUsers(){
                   ArrayList al=new ArrayList();
                     try{
                           query="select * from learning";
                              ps=con.prepareStatement(query);
                               ResultSet rs=ps.executeQuery();
                                 while(rs.next()){
                                       RecordBean rec=new RecordBean();
                                       rec.setFirstname(rs.getString(1));
                                          rec.setLastname(rs.getString(2));
                                            rec.setEmail(rs.getString(3));
                                              rec.setMobno(rs.getString(4));
                                                rec.setPassword(rs.getString(5));
                                                   al.add(rec);
                                                   
                                 }
                     }
                       catch(Exception e){
                           System.out.println("Exception at getUssers"+e.toString());
                       }
                         return al;
               }
                  public RecordBean userinfo(String s)
                  {
                      RecordBean recb=new RecordBean();
                       try{
                           String sql="select *from learning where email=?";
                              PreparedStatement ps=con.prepareStatement(sql);
                                 ps.setString(1,s);
                                   ResultSet rs=ps.executeQuery();
                                     while(rs.next()){
                                           
                                            recb.setFirstname(rs.getString(1));
                                              recb.setLastname(rs.getString(2));
                                                recb.setEmail(rs.getString(3));
                                                  recb.setMobno(rs.getString(4));
                                                    recb.setPassword(rs.getString(5));
                                     }
                       }
                         catch(Exception e){
                             System.out.println("Exception at userinfo in DbOperation"+e);
                         }
                      
                      return recb;
                      
                  }
  
                 
}
