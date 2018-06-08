
package DbConnection;
import java.sql.*;

public class Connect {
    public static Connection con=null;
         public static Connection getConnection(){
             try{
                 Class.forName("oracle.jdbc.OracleDriver");
                   String url="jdbc:oracle:thin:@localhost:1521:xe";
                   con=DriverManager.getConnection(url,"system","578352");
                    
             }
               catch(Exception e){
                   System.out.println("exception at Connection is"+e.toString());
               }
         
          return con;
}
}
