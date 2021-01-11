<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <form action="products" method="post">
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text" name="id" value="${product.id}" readonly></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${product.name}"></td>
            </tr>
            <tr>
                <td>Provider</td>
                <td><input type="text" name="provider" value="${product.provider}"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="text" name="price" value="${product.price}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Reset"></td>
            </tr>
        </table>
        <input type="hidden" name="action" value="edit">
    </form>
</body>
</html>
