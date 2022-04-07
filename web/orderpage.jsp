<%-- 
    Document   : chihuahuas
    Created on : 16 May 2017, 7:53:52 PM
    Author     : LAB0040PC050
--%>

<%@page import="za.ac.tut.model.entity.business.Utility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
    </head>
    <body>
        <h1>Choose your favorite breed!</h1>
        
        <form action="CartPage.jsp" method="GET" >
            <input type="submit" value="View Cart"/>
        </form>

        <table border="1">

            <tr>
                <td><b>Dog Image</td>
                <td><b>Type</td>
                <td><b>Price</b></td>
                <td>Cart</td>

            </tr>
            <%
                 Utility util = (Utility) request.getSession().getAttribute("util");
                if (util == null) {
                    util = new Utility();
                    request.getSession().setAttribute("util", util);
                }

                for (int x = 0; x < Utility.products.size(); x++) {

            %>
            
            <tr>
                <td><img src="<%=Utility.getProduct().get(x).getImage()%>" width="400px" height="350px"/></td>
                <td><%=Utility.products.get(x).getType()%></td>
                <td>R<%=Utility.products.get(x).getPrice()%>0</td>
                <td>
                    <form action="AddToCartServlet.do" method="POST">
                        <input type="hidden" name="index" value="<%=x%>">
                        <input type="submit" value="Add to Cart"/>
                    </form></td>
                
            </tr>
            <%}%>
    
            <img src=/>
            <img src=>
            <img src=/>
            <img src=/>

  
    </body>
</html>
