<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/15/2021
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
    <form action="users" method="post">
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text" name="id" value="${user.id}" readonly></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country" value="${user.country}"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
        <input type="hidden" name="action" value="edit">
        <a href="users"> Back to list</a>
    </form>
</body>
</html>
