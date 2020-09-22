/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mandeep.signup;
import com.mandeep.controller.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/signup")
public class signup extends HttpServlet {
    public void service( HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        HttpSession session = req.getSession();
        
       String Username = session.getAttribute("user").toString();
       String Password = session.getAttribute("pass").toString();
        
     
       UserDAO dao = new UserDAO();
       
      if( dao.add(Username,Password))
      {
       
          res.sendRedirect("login.jsp");
      }
      else
      {
          PrintWriter out = res.getWriter();
          out.print("Try again");
      }
      
       
    }
}
