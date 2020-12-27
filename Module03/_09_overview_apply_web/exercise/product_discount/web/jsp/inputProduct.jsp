<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/27/2020
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<form action="product" method="post">
    <label for="name">Name Product</label>
    <input type="text" name="name" id="name"><br>
    <label for="price">Price Product</label>
    <input type="text" name="price" id="price"><br>
    <label for="discount">Discount Product</label>
    <input type="text" name="discount" id="discount"><br>
    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
