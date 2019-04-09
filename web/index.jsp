<%--
  Created by IntelliJ IDEA.
  User: HOANG SON
  Date: 3/20/2019
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HomePage</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  </head>
  <body>
  <h1> WELCOME TO  <%=request.getAttribute("user")%></h1>
  </body>
</html>
