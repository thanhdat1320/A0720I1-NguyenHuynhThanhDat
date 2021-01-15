<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/15/2021
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <script src="js/jquery.js"></script>
    <script src="js/search.js"></script>
</head>
<body>
    <label for="nameSearch">
        <input type="text" id="nameSearch">
        <button id="search">Search</button>
    </label>
        <a href="users?action=create">Create new user</a>

    <div id="result">
        <table border="1px">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Country</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td><a href="users?action=view&id=${user.id}">${user.name}</a></td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td><a href="users?action=edit&id=${user.id}">Edit</a></td>
                <td><a href="users?action=delete&id=${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    </div>
</body>
</html>
