<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/8/2021
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Provider</td>
            <td>Price</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${products}" var="pro">
            <tr>
                <td>${pro.id}</td>
                <td><a href="products?action=view&id=${pro.id}">${pro.name}</a></td>
                <td>${pro.provider}</td>
                <td>${pro.price}</td>
                <td><a href="products?action=edit&id=${pro.id}">Edit</a></td>
                <td><a href="products?action=delete&id=${pro.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
