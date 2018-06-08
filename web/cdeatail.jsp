
<%@page import="Beans.AddCourseBean"%>
<%@page import="javax.mail.Session"%>
<%@page import="Beans.mybean"%>
<%@page import="DbConnection.CourseOperation"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dheader1.jspf" %>
<% String id=request.getParameter("id");
   int courseid=Integer.parseInt(id);
    
        CourseOperation cop=new CourseOperation();
    AddCourseBean cb=cop.showcourseinfo(courseid);
    
    
    HttpSession ht=request.getSession();
    ht.setAttribute("courseid", cb.getCourseid());
    
      
    %>
    <div class="row">
        <div class="col-lg-6">
            <div class="thumbnail">
    <h1 style="color: #00ccff">  <%=cb.getCoursname()%></h1>
    <p style="color: red;font-style: oblique;font-variant: small-caps;background-color: greenyellow;"> <%=cb.getCoursedescription()%></p>
        
    <input type="hidden" value="<%=cb.getCourseid()%>" name="id">
    <img src="CourseImage/<%=cb.getCourseimage().trim()%>" alt="" class="img-responsive" height="500px" width="500px"/>
  
        
          
            </div> 
        </div>
    <div class="col-lg-6">
        <form action="enroll.jsp?id=<%=cb.getCourseid()%>">
            <input type="hidden" value="<%=cb.getCourseid()%>" name="id"/>
            <button type="submit" class="btn btn-hg btn-primary btn-header-enroll payment-scroller"><i class="fa fa-shopping-cart" area-hidden="true"></i>Enroll in Course</button>
                    
        </form>
        
        
        
        
    </div>
    </div>          
    <%@include file="footer.jspf" %>
  
    
    
    
    
