<%@page import="java.sql.*" %>
<%@include file="dheader.jspf" %>
   <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Add Pdf to Course </h2>
                    <hr class="star-light">
                </div>
            </div>
               <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form action="AddPdf" method="post" enctype="multipart/form-data">
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
                            <label class="text">Enter Pdf Description </label>
                            <input type="text" class="form-control" name="pdfname" id="name" placeholder="Enter pdf description:" required>
                        </div>
                        <div class="form-group">
                           <label class="text">Uploas file Pdf</label>
                           <input type="file" class="form-control" name="pdffile" id="name" placeholder="Chose File" required>
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
<span class="sr-only">Loading...</span> AddPdf
                    </button>
                </div>
            </div>
</form>
        </div>
    </section>
<%@include file="footer.jspf" %>