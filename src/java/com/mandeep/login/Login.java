/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mandeep.login;

import com.mandeep.controller.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
    public void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String uname = req.getParameter("name");
        String password = req.getParameter("pass"); 
        UserDAO dao = new UserDAO();
        
       
        if(dao.check(uname, password))
        {
             HttpSession sessionn = req.getSession();
             sessionn.setAttribute("uname", uname);
             res.sendRedirect("welcome.jsp");
       
        }else
        {
            res.sendRedirect("login.jsp");
        }
        
       
       
    }
    
}
