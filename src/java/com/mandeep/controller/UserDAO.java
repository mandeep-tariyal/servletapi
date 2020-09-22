/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mandeep.controller;

import java.sql.*;


public class UserDAO {
    String url ="jdbc:derby://localhost:1527/mandeep";
    String user = "root";
    String pass = "root";
    String sql = "select * from login where uname=? and pass=?";
    public boolean check(String uname,String password)
    {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,uname);
            st.setString(2,password);
            ResultSet rs  = st.executeQuery();
            if(rs.next())
            {
                return true;
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return false;
    }
    public boolean add( String username ,String password)
    {
       
          try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("insert into login "+"values(?,?)");
            st.setString(1,username);
            st.setString(2,password);
             int result =st.executeUpdate();
              if(result ==1)
              {
                  System.out.println("Added 1 row");
                  return true;
              }
          
           
        } catch (Exception ex) {
            System.err.println(ex);
        }
       return false;
    }
    
}
