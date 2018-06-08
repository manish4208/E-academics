
<%@page import="java.util.ArrayList"%>
<%@include file="dheader1.jspf" %>
<%@page import="Beans.AddCourseBean" %>
<%@page import="DbConnection.CourseOperation" %>
<jsp:useBean id="showcourse" class="Beans.AddCourseBean"></jsp:useBean>
      <!-- Filter: Category -->
        <div class='pull-left course-filter'>
          <div class="filter-label">
            Category:
          </div>
          <div class="btn-group">
            <button class="btn btn-default btn-lg btn-course-filter dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
              
                All <span class="caret"></span>
              
            </button>
            <ul class="dropdown-menu" role="menu">
              <li><a href="/courses">All</a></li>
              
                
                  <li><a href="detailC++">C++ (1)</a></li>
                
              
                
                  <li><a href="detailJava">Java (2)</a></li>
                
              
                
                  <li><a href="DetailJDK 8">JDK 8 (1)</a></li>
                
              
                
                  <li><a href="detailweb">web development (1)</a></li>
                
              
            </ul>
          </div>
        </div>  
                                          <section id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Our Courses</h2>
                    <hr class="star-primary">
                </div>
            </div>
      
        <%CourseOperation cop=new CourseOperation();
            ArrayList al=cop.Viewcourses();
              for(int i=0;i<al.size();i++){
              
                  showcourse=(AddCourseBean)al.get(i);
        %>
            
                        <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        
              <img src="CourseImage/<%=showcourse.getCourseimage().trim()%>" alt="" class="img-responsive"/>
   
             <div class="text-primary">
                 <h3><%=showcourse.getCoursname()%></h3>
                 <div class="text-desc">
                     <p><%=showcourse.getCoursedescription()%></p>
                     <button type="button" class="btn btn-danger"><i class="fa fa-inr" area-hidden="true"></i><%=showcourse.getCourseprice()%></button>
                <a href="cdeatail.jsp?id=<%=showcourse.getCourseid()%>" class="btn btn-primary">Read More</a>
                 </div>
          </div>
      </div>                                                     
    </div>
                          
                       
           
                                <% } 
              %>
                        </div>
     
    </section>
					
<%@include file="footer.jspf" %>