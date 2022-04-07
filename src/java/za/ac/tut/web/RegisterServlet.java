/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.entity.Person;

/**
 *
 * @author LAB0040PC050
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstname=request.getParameter("firstname");
        String surname=request.getParameter("surname");
        String cellphone=request.getParameter("cellphone");
        String address=request.getParameter("address");
        
        HttpSession session=request.getSession();
      /*  session.setAttribute("firstname", firstname);
        session.setAttribute("surname", surname);
        session.setAttribute("cellphone", cellphone);
        session.setAttribute("address", address);*/
        
        Person person=new Person(firstname, surname, cellphone, address);
        session.setAttribute("person", person);
        
        RequestDispatcher dispatcher=request.getRequestDispatcher("registerOutcome.jsp");
        dispatcher.forward(request, response);
    }
}
