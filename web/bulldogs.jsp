<%-- 
    Document   : bulldogs
    Created on : 16 May 2017, 7:53:18 PM
    Author     : LAB0040PC050
--%>

<%@page import="za.ac.tut.model.entity.business.Utility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bulldogs</title>
    </head>
    <body>
        <h1>Choose your favorite bulldog!</h1>
 
        <form action="CartPage.jsp" method="GET" >
            <input type="submit" value="View Cart">
        </form>


        <table border="1">

            <tr>
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
                <td><img src="<%=Utility.getBulldog().get(x).getImage()%>" width="400px" height="350px"></td>
                <td>R<%=Utility.products.get(x).getPrice()%>0</td>
                <td><form action="AddToCartServlet.do" method="POST">
                        <input type="submit" value="Add to Cart"/>
                    </form></td>
                
            </tr>
            <%}%>

            <img src=/>
            <img src=>
            <img src=/>
            <img src=/>

        <p>To choose different breeds please click<a href="dogbreeds.html"> here</a></p>
    </body>
</html>
