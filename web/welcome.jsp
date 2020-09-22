<%-- 
    Document   : welcome
    Created on : Sep 18, 2020, 6:06:09 PM
    Author     : Mandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>
        
        <%
               response.setHeader("cache-control","no-cache,no-store,must-validate"); // to give instruction to the browsser header is used
            
            if(session.getAttribute("uname")==null)
            {
                response.sendRedirect("login.jsp");
            }
            
        %>
        
        Welcome ${uname}
        <br>
        <form action ="Logout">
            <input type="submit" value="LogOut">
        </form>
        <a href="videos.jsp"> videos</a>
    </body>
</html>
