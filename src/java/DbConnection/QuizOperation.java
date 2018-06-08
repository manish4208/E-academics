
package DbConnection;

import Beans.QuizBean;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QuizOperation {
       Connection con=Connect.getConnection();
         int quesid=0;
          public  int getQuesid(){
       try{
        String sql="select MAX(quesid) from myproject.quiz";
          PreparedStatement ps=con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
               if(rs.next()){
                  quesid= rs.getInt(1);
               }      
}
          catch(Exception e){
             System.out.println("exception at getquesid"+e);
}
         
         return ++quesid;
          }  
//       
            public boolean SetQuiz(QuizBean quiz){
                   try{
                           
                         String sql="insert into myproject.quiz(courseid,quesid,question,rightanswer,wronganswer1,wronganswer2,wronganswer3) values(?,?,?,?,?,?,?)";
                    PreparedStatement   ps=con.prepareStatement(sql);
                                ps.setInt(1, quiz.getCourseid());
                                  ps.setInt(2, quiz.getQuesid());
                                    ps.setString(3, quiz.getQuestion());
                                      ps.setString(4, quiz.getRightanswer());
                                          
                                        ps.setString(5,quiz.getWrongansw1());
                                          ps.setString(6, quiz.getWrongansw2());     
                                          ps.setString(7,quiz.getWrongansw3());
                                             int i=ps.executeUpdate();                                      
                                       
                                       if(i>0){
                                           return true;      
                                       }
                   }
                      catch(Exception e){
                          System.out.println("Error in SetQuizOperation"+e);
                      }
                         
                       return false;
                  
            }
          
          
}