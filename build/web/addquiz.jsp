
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="dheader.jspf" %>
   <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Set Quiz here </h2>
                    <hr class="star-light">
                </div>
            </div>
               <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
               <form action="SetQuiz" method="post">
                    <div class="form-group">
                        <label for="sel1">Select Course Code</label>
                          <%
try {
      Class.forName("oracle.jdbc.OracleDriver");
                String url="jdbc:oracle:thin:@localhost:1521:xe";
             Connection con=DriverManager.getConnection(url,"system","578352");
               String sql="select courseid from myproject.coursedetail";           
                 PreparedStatement pss=con.prepareStatement(sql);
               ResultSet rs=pss.executeQuery();
                 %>
                 <select  name="courseid" class="form-control" id="sel1">
                     <%
                 while(rs.next()){
                       String courseid=rs.getString("courseid");
                            %>       
                                
                            <option value="<%=courseid%>"><%=courseid%></option>
                              <%
                 }
                   %>
                 </select>
       <%
              }
    catch(Exception e){
        e.printStackTrace();
    }
       %>
                    </div>         
                        <div class="form-group">
                            <label class="text">Enter Question </label>
                            <input type="text" class="form-control" name="question" id="name" placeholder="Enter Question" required>
                        </div>
                        <div class="form-group">
                           <label class="text">Enter Correct Answer</label>
                           <input type="text" class="form-control" name="canswer" id="name" placeholder="Enter Correct Answer" required>
                        </div>
                            
    <div class="form-group">
      <label for="email">Enter Wrong Answer1:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter Wrong Answer" name="wanswer1" required>
    </div>
                <div class="form-group">
                           <label class="text">Enter Wrong Answer2</label>
                           <input type="text" class="form-control" id="phone" name="wanswer2" placeholder="Enter Wrong Answer2"required>
                        </div>
    <div class="form-group">
        <label for="pwd">Enter Wrong Answer 3</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter Wrong Answer3" name="wanswer3" required>
    </div>
                         
                            
                <div class="col-lg-2 text-danger">
                    <button type="reset" class="btn btn-danger">
                        <i class="fa fa-remove"></i>
<span class="sr-only">Loading...</span> Reset Quiz
                    </button>
                </div>
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-arrow-right"></i>
<span class="sr-only">Loading...</span> AddCourse Question
                    </button>
                </div>
            </div>
</form>
        </div>
    </section>
<%@include file="footer.jspf" %>