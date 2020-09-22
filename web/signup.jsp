<%-- 
    Document   : signup
    Created on : Sep 19, 2020, 10:53:36 AM
    Author     : Mandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-up Page</title>
    </head>
    <body> 
        <form action ="signupValidate" method ="post">
            <div>
                Enter First Name: <Br>
                <input type ="text" name ="fname"><br>
            </div>
            <div>
                Enter Last Name:<br>
                <input type="text" name ="lname"><br>
            </div>
            <div>
                Enter Create Username: <br>
                <input type="text" name ="username"><br>
            </div>
            <div>
                Enter Create Password: <br>
                <input type ="password" name ="pass"><br>
            </div><br>
            
                <input type ="submit" value ="SIGNUP">
        </form>
    </body>
</html>
