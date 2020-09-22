/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mandeep.signup;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/signupValidate")
public class signupValidate extends HttpServlet {
    public void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String username= req.getParameter("username");
        String password = req.getParameter("pass");
        
         HttpSession session = req.getSession();
         session.setAttribute("user", username);
         session.setAttribute("pass", password);
         
        if( username == "" || password == "")
        {
            res.sendRedirect("signup.jsp");
        }
        else{
         
         res.sendRedirect("signup");
    }
    }
}
