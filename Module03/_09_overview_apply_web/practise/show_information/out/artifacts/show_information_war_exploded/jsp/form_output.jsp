<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/27/2020
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OUTPUT</title>
</head>
<body>
    <table border="1px black" style="border-collapse: collapse">
        <tr>
            <th>Name</th>
            <th>Birthday</th>
            <th>Age</th>
            <th>Address</th>

        </tr>
        <tr>
            <td>${person.name}</td>
            <td>${person.showBirthday()}</td>
            <td>${person.age}</td>
            <td>${person.address}</td>

        </tr>
    </table>

</body>
</html>
