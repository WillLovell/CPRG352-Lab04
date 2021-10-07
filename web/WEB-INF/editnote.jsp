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
        <h2>Edit Note</h2>
        
        
        <form method="POST" action="note">
         <label>Title: </label> 
        <input type="text" value="${Note.getTitle()}" name="title">
            <br>
            <label>Contents: </label>
            <input type="text" value="${Note.content}" name="content">
           
            <br>
            <input type="submit" value="Save" >
        </form>
    </body>
</html>
