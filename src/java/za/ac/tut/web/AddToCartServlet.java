/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.tut.web;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.entity.Item;
import za.ac.tut.model.entity.Product;
import za.ac.tut.model.entity.business.Utility;

/**
 *
 * @author LAB0040PC050
 */
public class AddToCartServlet extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session=request.getSession();
        Utility util = (Utility)request.getSession().getAttribute("util");
        ArrayList<Item> cart = util.getCart();
        int index = Integer.parseInt(request.getParameter("index"));
        ArrayList<Product> products = Utility.products;
        Product p = products.get(index);
        
        if(!isProductInCart(p, cart)){
            Item item = new Item();
            item.setProduct(p);
            item.calcSubtotal();
            
            cart.add(item);
        }
        session.getAttribute("person");
       request.getRequestDispatcher("orderpage.jsp").forward(request, response);
    }
    public boolean isProductInCart(Product p, ArrayList<Item> cart){
        for (Item item : cart) {
            if(item.getProduct().getId() == p.getId()){
                item.setQty(item.getQty()+1);
                item.calcSubtotal();
                return true;
            }
        }
        return false;
    }

}
