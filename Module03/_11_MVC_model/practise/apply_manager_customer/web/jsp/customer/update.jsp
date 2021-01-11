<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id" value="${customer.id}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${customer.name}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${customer.email}"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address" value="${customer.address}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
        <input type="hidden" name="action" value="edit">
    </table>
</body>
</html>
