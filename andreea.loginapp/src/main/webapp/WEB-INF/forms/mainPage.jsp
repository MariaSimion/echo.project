<%--
  Created by IntelliJ IDEA.
  User: UserA
  Date: 7/1/2015
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>

<html>
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="login" %>
  <title>MainPage LoginApp</title>
</head>
<body>
<form action="mainPage" method="get">
  <h2><login:out value="${content}"></login:out></h2>
</form>
</body>
</html>