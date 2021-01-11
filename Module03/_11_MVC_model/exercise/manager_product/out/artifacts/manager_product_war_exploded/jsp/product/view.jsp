<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
    <table>
        <tr>
            <td>ID</td>
            <td>${product.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${product.name}</td>
        </tr>
        <tr>
            <td>Provider</td>
            <td>${product.provider}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${product.price}</td>
        </tr>
    </table>
    <a href="products">Back to list</a>
</body>
</html>
