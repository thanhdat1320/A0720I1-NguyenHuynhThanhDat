<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/27/2020
  Time: 5:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input</title>
</head>
<body>
<form action="search" method="post">
    <label for="search">Search</label>
    <input type="text" id="search" name="search">
    <input type="submit" value="Search">
</form>
<h3>Result: ${result}</h3>
</body>
</html>
