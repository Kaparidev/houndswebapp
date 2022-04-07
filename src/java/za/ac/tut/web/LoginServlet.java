/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LAB0040PC050
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        
          
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
       // Person member=new Person(username, password);
        HttpSession session=request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        
        
       // session.setAttribute("member",member );
      //  memberFacade.create(member);
        
        
        RequestDispatcher dispatcher=request.getRequestDispatcher("/loginOutcome.jsp");
        dispatcher.forward(request, response);
    }

  
}
