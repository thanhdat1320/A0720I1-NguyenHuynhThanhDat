<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>Customers</h1>
    <a href="customers?action=create"> Create new customer</a>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${customers}" var="cus">
            <tr>
                <td><a href="customers?action=view&id=${cus.id}">${cus.name}</a></td>
                <td>${cus.email}</td>
                <td>${cus.address}</td>
                <td><a href="customers?action=edit&id=${cus.id}">edit</a></td>
                <td><a href="customers?action=delete&id=${cus.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
