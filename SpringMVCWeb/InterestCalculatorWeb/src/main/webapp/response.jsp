<%-- 
    Document   : response
    Created on : Jul 8, 2016, 12:22:03 PM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>interest stuff</h1>
        <c:forEach var="year" items="${listToReturn}">
            <hr/>
            <c:out value="${year.year}"/><br/>
            <c:out value="${year.balance}"/><br/>
            <c:out value="${year.interest}"/><br/>
        </c:forEach>
    </body>
</html>
