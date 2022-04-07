<%-- 
    Document   : registerOutcome
    Created on : 16 May 2017, 8:35:47 PM
    Author     : LAB0040PC050
--%>

<%@page import="za.ac.tut.model.entity.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration  Outcome</title>
    </head>
    <body>
        <h1>Registration successful!</h1>
        
        <%
            Person person=(Person)session.getAttribute("person");
            
            String name=person.getFirstname();
            String surname=person.getSurname();
            String cell=person.getCellphone();
            String address=person.getAddress();
            
          
           session.setAttribute("person",person);
            
        %>
        
          <p>Hi <%=name +" "+surname%></p>
          <p>Cell no:<%=cell%></p>
          <p>Adress:<%=address%></p>
          <p>You have successfully registered!</p>
          
          
          <br><p>Click <a href="orderpage.jsp">here</a> to place your order</p></br>
    </body>
</html>
