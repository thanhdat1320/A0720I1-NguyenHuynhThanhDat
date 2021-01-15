<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/15/2021
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form action="users" method="post">
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Create">
                    <input type="reset" value="Reset">
                </td>
            </tr>
        </table>
        <input type="hidden" name="action" value="create">
        <a href="users"> Back to list</a>
    </form>
</body>
</html>
