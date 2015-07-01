<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>

<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>MainPage LoginApp</title>
</head>
<body>
<form action="mainPage" method="get">
    <h2><c:out value="${content}"></c:out></h2>
</form>
</body>
</html>
