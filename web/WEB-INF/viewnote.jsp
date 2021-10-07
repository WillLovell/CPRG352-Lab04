<%-- 
    Document   : Simple Note Keeper
    Author     : Will
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
            <label>Title: ${Note.getTitle()}</label>
            <br>
            <label>Contents: <br> ${Note.content}</label>
           
            <br>
            <a href="note?edit">Edit</a>
        
    </body>
</html>
