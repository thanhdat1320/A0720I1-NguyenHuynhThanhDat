<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/26/2020
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INPUT</title>
</head>
<body>
<h1>Login success</h1>
<form action="showInfo" method="post">
    <label for="firstName" >First Name</label>
    <input type="text" name="firstName" id="firstName"><br>
    <label for="lastName">Last Name</label>
    <input type="text" name="lastName" id="lastName"><br>
    <label for="address">Address</label>
    <input type="text" name="address" id="address"><br>
    <label for="birthday">Birthday</label>
    <input type="text" name="birthday" id="birthday"><br>
    <input type="submit" value="Show">
</form>

</body>
</html>
