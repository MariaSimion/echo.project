<%--
  Created by IntelliJ IDEA.
  User: UserA
  Date: 7/1/2015
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="header">


</div>
<div id="center">

    <form action="login" method="post">Username:
        <input type="text" class="login-input" name="username"><br>
        Password:
        <input type="password" class="login-input" name="password"><br>
        <input type="submit" value="Login" class="login-submit">
    </form>
</div>

<div id="footer">


</div>

</body>
</html>