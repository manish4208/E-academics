
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="dheader.jspf" %>
   <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Add Video Here </h2>
                    <hr class="star-light">
                </div>
            </div>
               <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
               <form action="#" method="post">
                    <div class="form-group">
                        <label for="sel1">Select Course Code</label>
                          <%
try {
      Class.forName("oracle.jdbc.OracleDriver");
                String url="jdbc:oracle:thin:@localhost:1521:xe";
             Connection con=DriverManager.getConnection(url,"system","578352");
               String sql="select countyr from rajat.country";           
                 PreparedStatement pss=con.prepareStatement(sql);
               ResultSet rs=pss.executeQuery();
                 %>
                 <select class="form-control" id="sel1">
                     <%
                 while(rs.next()){
                       String countryname=rs.getString("countyr");
                            %>       
                                
                            <option value="<%=countryname%>"><%=countryname%></option>
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
                            <label class="text">Video Description </label>
                            <input type="text" class="form-control" name="question" id="name" placeholder="Enter Video Description" required>
                        </div>
                        <div class="form-group">
                           <label class="text">Upload Video</label>
                           <input type="text" class="form-control" name="canswer" id="name" placeholder="Upload video" required>
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
<span class="sr-only">Loading...</span> Add Video
                    </button>
                </div>
            </div>
</form>
        </div>
    </section>
       <%@include file="footer.jspf" %>