<%-- 
    Document   : CheckoutPage
    Created on : 17 May 2017, 5:49:02 PM
    Author     : LAB0033BPC28
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.model.entity.Person"%>
<%@page import="za.ac.tut.model.entity.Item"%>
<%@page import="za.ac.tut.model.entity.business.Utility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout Page</title>
    </head>
    <body>
        <h1>Check out</h1>

        <%

            ArrayList<Item> cart = (ArrayList<Item>) session.getAttribute("cart");
            Person person = (Person) session.getAttribute("person");

            String name = person.getFirstname();
            String surname = person.getSurname();
            String cell = person.getCellphone();
            String address = person.getAddress();

            double totalPrice = (Double) session.getAttribute("price");
            String username = person.getFirstname() + " " + person.getSurname();
            
        %>

        Customer Name:<%=username%><br/>
        Customer Address:<%=address%>
        <br/>
        Total Amount Due to us:<%=totalPrice%>

    </body>
</html>
