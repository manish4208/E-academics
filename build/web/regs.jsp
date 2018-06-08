<%-- 
    Document   : regs
    Created on : Jun 30, 2017, 7:05:05 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="RegisterServlet">
            Enter firstname: <input type="text" name="firstname"><br>
            Enter lastname  <input type="text" name="lastname"><br>
            Enter email: <input type="email" name="email"><br>
           Enter mobno. <input type="number" name="mobno"><br>
         enter password:   <input type="password" name="pass"><br>
            <input type="submit" value="Register">
        </form>
    </body>
</html>
