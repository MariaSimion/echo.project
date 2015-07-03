<%--
  Created by IntelliJ IDEA.
  User: UserA
  Date: 7/2/2015
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome</title>
</head>
<body>
<br/><br/><br/><br/><br/>

  <h2>
    <%
      String a=session.getAttribute("username").toString();
    %>
  </h2>
  <br/>
  <br/>
  <br/><br/><br/><br/><br/>
  <a href="login.jsp">Logout</a>

</body>
</html>


Read more: http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz3eoVg95cV
