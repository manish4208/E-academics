
<%@page import="DbConnection.DbOperation"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="Beans.mybean" %>
<%@page import="Beans.RecordBean" %>
<%@page import="Beans.AddCourseBean" %>
<%@page import="DbConnection.CourseOperation" %>
<%@include file="dheader1.jspf" %>
  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<div clclass="row">
    <div class="col-lg-offset-4">
        <form action="paypal.jsp">
            <% String id=request.getParameter("id");
               int courseid=Integer.parseInt(id);
                CourseOperation cop=new CourseOperation();
                  AddCourseBean cb=cop.showcourseinfo(courseid);
                    %>
                    <%
                        HttpSession ses=request.getSession();
                          String m=(String)ses.getAttribute("email");
                            DbOperation dbo=new DbOperation();
                                 RecordBean rec=dbo.userinfo(m);                     
             
            %>
            <input type="hidden" value="<%=cb.getCoursname()%>" name="coursename"/>
            <input type="hidden" value="<%=cb.getCourseid()%>" name="courseid"/>
            <input type="hidden" value="<%=cb.getCourseprice()%>" name="courseprice"/>
            <h1 style="color: blueviolet;">Course Name:<%=cb.getCoursname()%></h1>
            <p style="color:blue;">Course Price:<%=cb.getCourseprice()%></p>
            <p>User name:<%=rec.getFirstname()%> <%=rec.getLastname()%></p>  
            <p>Email id:<%=rec.getEmail()%></p>
            <button type="submit" class="btn btn-hg btn-primary"><i class="fa fa-paypal" area-hidden="true"></i>Payment</button>
        </form>
        
        
        
    
    </div>
</div>  
<%@include file="footer.jspf" %>
