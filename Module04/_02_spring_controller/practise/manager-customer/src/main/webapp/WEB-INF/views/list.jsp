<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/26/2021
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<a href="/createCustomer">Create New Customer</a>
<hr>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${customerList}" var="customerList">
        <tr>
            <td>${customerList.id}</td>
            <td>${customerList.name}</td>
            <td>${customerList.email}</td>
            <td>${customerList.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
