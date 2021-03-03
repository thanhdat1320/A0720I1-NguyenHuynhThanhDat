<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/3/2021
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<form:form method="get" modelAttribute="user">
    <table>
        <tr>
            <td>name: ${user.name}</td>
        </tr>
    </table>
</form:form>
</body>
</html>
