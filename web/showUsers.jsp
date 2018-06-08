
<%@page import="Beans.RecordBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DbConnection.DbOperation"%>
<jsp:useBean id="showdata" class="Beans.RecordBean"></jsp:useBean>
<table border="2">
    <tr>
    <th>FirstName</th>
    <th>LastName</th>
    <th>Email</th>
    <th>Mobno.</th>
    <th>Password</th>
    </tr>
   
        <%DbOperation dbo=new DbOperation();
            ArrayList al1=dbo.getUsers();     
              for(int i=0;i<al1.size();i++){
            showdata=(RecordBean)al1.get(i);
%>
<tr>
    <td>
        <%=showdata.getFirstname()
          
        
        %>
    </td>
    <td> <%=showdata.getLastname()
              %>
</td>
<td>
    <%=showdata.getEmail()
                  %>
</td>
<td> <%=showdata.getMobno()%></td>
<td> <%=showdata.getPassword()%></td>
</tr>
         
<%
      }
         %>
</table>