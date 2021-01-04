<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/30/2020
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input</title>
</head>
<body>
<%--<h3>result: ${result}</h3>--%>
<form action="customer" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name"> <br>
    <label for="birthday">Birthday</label>
    <input type="text" id="birthday" name="birthday"> <br>
    <label for="address">Address</label>
    <input type="text" id="address" name="address"> <br>
    <input type="submit" value="ADD CUSTOMER"> <br>
</form>
<h3>${Error}</h3>
<table border="1px black" style="border-collapse: collapse">
    <tr>
        <th>Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Photo</th>
    </tr>
    <c:forEach items="${customerList}" var="cus">
        <tr>
            <td>${cus.name}</td>
            <td>${cus.birthday}</td>
            <td>${cus.address}</td>
            <td><img src="<c:url value="${cus.photo}"/>" style="width: 30px; height: 30px"/>
        </tr>
    </c:forEach>
</table>

</body>
</html>
