<%-- 
    Document   : coursedetail
    Created on : Aug 13, 2017, 12:53:06 PM
    Author     : Rajat
--%>

<%@page import="Beans.AddCourseBean"%>
<%@page import="javax.mail.Session"%>
<%@page import="Beans.mybean"%>
<%@page import="DbConnection.CourseOperation"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="dheader1.jspf" %>
<link href="css/mycss.css" rel="stylesheet" type="text/css" media="all" />
    <style>
       table {
    border-collapse:separate;
    background-color: #ffffff ;
}

table, td, th {
    border: 1px solid #000;
    padding :3px;
}

   ul { list-style:outside; }
   h1{
       font-size: 2em;
   } 

    </style>
</head>
<% int courseid=Integer.parseInt(request.getParameter("id"));
    
        CourseOperation cop=new CourseOperation();
    AddCourseBean cb=cop.showcourseinfo(courseid);
    
    HttpSession ht=request.getSession();
    ht.setAttribute("courseid", cb.getCourseid());
    
      
    %>
<form action="enrollcourse.jsp?id=<%=cb.getCourseid()%>" style="margin:5% 10%;padding:30px 30px;border:2px blue solid;background-color: gainsboro;">
    <h1><%=cb.getCoursname()%></h1><br><br>
    <input type="hidden" value="<%=cb.getCourseid()%>" name="id">
    <span style="float: right;font-weight: bold;font-size:2em;color:red;"> $<%=cb.getCourseprice()%></span>

    <img src="CourseImages/<%=cb.getCourseimage().trim()%>" alt="img" />
    <div><input type="submit" class="button"  style="font-size: 1em;" value="Enroll now"/></div><br></br>
    
    <div>
        
           <ul>
                <li>The C programming language is a structure oriented programming language, developed at Bell Laboratories in 1972 by Dennis Ritchie</li>
                <li>C programming language features were derived from an earlier language called “B” (Basic Combined Programming Language – BCPL)</li>
                <li>C language was invented for implementing UNIX operating system</li>
                <li>In 1978, Dennis Ritchie and Brian Kernighan published the first edition  “The C Programming Language” and commonly known as K&R C</li>
                <li>In 1983, the American National Standards Institute (ANSI) established a committee to provide a modern, comprehensive definition of C. The resulting definition, the ANSI standard, or “ANSI C”, was completed late 1988.</li>
            </ul>
            <br>
            <h2 class="font">Features of C programming language:</h2><br>
            <ul>
                <li>Reliability</li>
                <li>Portability</li>
                <li>Flexibility</li>
                <li>Interactivity</li>
                <li>Modularity</li>
                <li>Efficiency and Effectiveness</li>
                
            </ul><br></br>
            <table>
                <tr style="font-weight: bold;">
                   
                    <th>Structure oriented</th>
                    <th>Object oriented</th>
                    <th>Non structure</th>
                </tr>
                <tr>
                    <td>In this type of language, large programs are divided into small programs called functions</td>
                    <td>In this type of language, programs are divided into objects</td>
                    <td>There is no specific structure for programming this language</td>
                </tr>
                <tr>
                    <td>Prime focus is on functions and procedures that operate on the data</td>
                    <td>Prime focus is on functions and procedures that operate on the data</td>
                    <td>N/A</td>
                </tr>
                <tr>
                    <td>Data moves freely around the systems from one function to another</td>
                    <td>Data is hidden and cannot be accessed by external functions</td>
                    <td>N/A</td>
                </tr>
                <tr>
                    <td>Program structure follows “Top Down Approach”</td>
                    <td>Program structure follows “Bottom UP Approach”</td>
                    <td>N/A</td>
                </tr>
            </table><br></br>
           
            
    </div>
</form>
    <%@include file="footer.jspf" %>
  
    
    
    
    
