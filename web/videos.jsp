<%-- 
    Document   : videos
    Created on : Sep 18, 2020, 6:06:22 PM
    Author     : Mandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Videos</title>
    </head>
    <body> <img src="C:\Users\Mandeep\Pictures/unnamed.jpg">
        <%
             response.setHeader("cache-control","no-cache,no-store,must-validate");
               if(session.getAttribute("uname")==null)
            {
                response.sendRedirect("login.jsp");
            }
            
        %>
        
        NO VIDEO AVAILABLE RIGHT NOW :(
        <br>
        <form action ="Logout">
            <input type="submit" value="LogOut">
        </form>
    </body>
</html>
