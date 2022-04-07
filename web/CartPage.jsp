<%-- 
    Document   : CartPage
    Created on : 17 May 2017, 4:20:53 AM
    Author     : LAB1027APC32
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.model.entity.Item"%>
<%@page import="za.ac.tut.model.entity.business.Utility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
    </head>
    <body>
        <h1>View Cart!</h1>
        
         <table>
            <tr>
                <td><b>Product name</td>
                <td><b>Quantity</td>
                <td><b>Unit Price</td>
                <td><b>Subtotal</td>
            </tr>
            <%
                Utility util = (Utility) request.getSession().getAttribute("util");
                ArrayList<Item> cart = util.getCart();
                for (int x = 0; x < cart.size(); x++){
                  session.getAttribute("person");
            %>
            <tr>
                <td><%=cart.get(x).getProduct().getType()%></td>
                <td>
                    <form action="UpdateQuantityServlet.do" method="POST">
                        <input type="hidden" name="index" value="<%=x%>">
                        <input type="number" min="1" name="qty" value="<%=cart.get(x).getQty()%>" onchange="this.form.submit()" width="80px"/>
                    </form>
                </td>
                <td>R<%=cart.get(x).getProduct().getPrice()%>0</td>
                <td>R<%=cart.get(x).getSubtotal()%>0</td>
                <td>
                    <form action="RemoveServlet.do" method="POST">
                        <input type="hidden" name="index" value="<%=x%>">
                        <input type="submit" value="Remove">
                    </form>
                </td>
            </tr>
            
            <%}%>
            
            
            
            <a href="CheckoutPage.jsp">Click here to check Out</a>
        </table>
            <form action="CheckOutServlet.do" method="GET">
                Check out<input type="submit" value="checkout">
            </form>
    </body>
</html>
