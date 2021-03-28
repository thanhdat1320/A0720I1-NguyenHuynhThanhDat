<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/1/2021
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form modelAttribute="sandwich" method="post" action="/">
    <form:checkboxes path="spice" items="${spiceSandwich}"/>
    <input type="submit" value="Save">
</form:form>
<hr>
  <h3>${result}</h3>
</body>
</html>
