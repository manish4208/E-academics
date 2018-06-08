<%-- 
    Document   : addcoursefeature
    Created on : Aug 14, 2017, 12:56:37 PM
    Author     : Rajat
--%>

<%@page import="java.sql.*" %>
<%@include file="dheader.jspf" %>
   <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Add Features to Course </h2>
                    <hr class="star-light">
                </div>
            </div>
               <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form action="coursefeature" method="post">
                    <div class="form-group">
                        
                        <label for="sel1">Select Course Id</label>
                          <%
try {
      Class.forName("oracle.jdbc.OracleDriver");
                String url="jdbc:oracle:thin:@localhost:1521:xe";
             Connection con=DriverManager.getConnection(url,"system","578352");
               String sql="select courseid from myproject.coursedetail";           
                 PreparedStatement pss=con.prepareStatement(sql);
               ResultSet rs=pss.executeQuery();
                 %>
                 <select name="courseid" class="form-control" id="sel1">
                     <%
                 while(rs.next()){
                       String id=rs.getString("courseid");
                            %>       
                                
                            <option value="<%=id%>"><%=id%></option>
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
                            <label class="text">Enter Course Feature </label>
                            <input type="text" class="form-control" name="feature" id="name" placeholder="Enter course Featue" required>
                        </div>
                      
                                               
                <div class="col-lg-2 text-danger">
                    <button type="reset" class="btn btn-danger">
                        <i class="fa fa-remove"></i>
<span class="sr-only">Loading...</span> Reset 
                    </button>
                </div>
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-arrow-right"></i>
<span class="sr-only">Loading...</span> AddCourseFeature
                    </button>
                </div>
                    </form>
                </div>
        </div>
    </section>
<%@include file="footer.jspf" %>