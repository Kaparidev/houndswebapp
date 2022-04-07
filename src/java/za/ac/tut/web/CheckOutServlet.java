/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.entity.Item;
import za.ac.tut.model.entity.Person;
import za.ac.tut.model.entity.business.Utility;

/**
 *
 * @author LAB0033BPC28
 */
public class CheckOutServlet extends HttpServlet {
 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           HttpSession session = request.getSession();
           Utility util = (Utility)request.getSession().getAttribute("util");
           ArrayList<Item> cart = util.getCart();
        
           
            double totalPrice = Utility.getTotalPrice(cart);
            Person person=util.getThePerson();
          session.setAttribute("price", totalPrice);
          session.setAttribute("cart", cart);
          session.setAttribute("util", util);
       
        request.getRequestDispatcher("CheckoutPage.jsp").forward(request, response);
    }
 
}
