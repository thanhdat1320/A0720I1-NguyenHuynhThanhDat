<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/1/2021
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form action="/" method="post" modelAttribute="login">
    <table>
        <tr>
           <form:label path="username">Username:</form:label>
            <form:input path="username"/>
            <br>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
        </tr>
        <tr>
            <td><form:button>Login</form:button></td>
        </tr>
    </table>
</form:form>
<h3>${error}</h3>
</body>
</html>
