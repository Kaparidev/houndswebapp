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
import za.ac.tut.model.entity.Item;
import za.ac.tut.model.entity.business.Utility;

/**
 *
 * @author LAB1027APC32
 */
public class UpdateQuantityServlet extends HttpServlet {

  
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Utility util = (Utility)request.getSession().getAttribute("util");
        ArrayList<Item> cart = util.getCart();
        int qty = Integer.parseInt(request.getParameter("qty"));
        int index = Integer.parseInt(request.getParameter("index"));
        Item item = cart.get(index);
        item.setQty(qty);
        item.calcSubtotal();
        request.getRequestDispatcher("CartPage.jsp").forward(request, response);
        
    }

}
