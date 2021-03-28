<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/1/2021
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <hr>
    <button type="submit" name="val" value="+">+</button>
    <button type="submit" name="val" value="-">-</button>
    <button type="submit" name="val" value="*">*</button>
    <button type="submit" name="val" value="/">/</button>
    <hr>
  </form>
  <h3>${result}</h3>
  <h3>${message}</h3>
  </body>
</html>
