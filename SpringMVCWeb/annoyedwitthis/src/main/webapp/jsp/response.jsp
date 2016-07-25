<%-- 
    Document   : response
    Created on : Jul 7, 2016, 10:24:35 PM
    Author     : apprentice
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               
       
    </head>
    <body>
        <h1>look at me. im ugly.</h1>
         <a href="${pageContext.request.contextPath}index.jsp">Home</a><br/>
           
             <p>You went broke after  ${countStr} rolls<br/>
            You should have stopped after ${maxMoneyStr} rolls when you had ${maxWalletStr}<br/></p>
    </body>
</html>
