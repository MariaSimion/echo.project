<%--
  Created by IntelliJ IDEA.
  User: Maria Simion
  Date: 01.07.2015
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="../cssStyle/loginCss.css"/>
    <title>Login Page</title>

</head>
<body>
<div id="header">


</div>
<div id="center-content-area">
    <form action="login" method="post">Username:
        <input type="text" name="username"><br>
        Password:
        <input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</div>

<div id="footer">


</div>

</body>
</html>

