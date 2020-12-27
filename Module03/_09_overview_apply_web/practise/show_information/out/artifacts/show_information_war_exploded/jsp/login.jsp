<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/26/2020
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<h2>${error}</h2>
<form action="login" method="post">
    <label for="username">Username</label>
    <input type="text" name="username" id="username" placeholder="Username">
    <label for="pass">Password</label>
    <input type="password" name="password" id="pass" placeholder="Password">
    <input type="submit" value="Login">
</form>
</body>
</html>
