<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/24/2021
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="convert" method="post">
    <input type="text" name="usd">
    <input type="text" name="vnd" value="21000" readonly>
    <input type="submit" value="Change">
    <br>
  </form>
  <input type="text" value="${result}" readonly>
  </body>
</html>
