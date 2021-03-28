<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<table class="table table-secondary resultList">
    <tr class="table-dark">
        <th>ID</th>
        <th>Name</th>
        <th>Phone</th>
        <th>Start</th>
        <th>Cost</th>
        <th>Note</th>
        <th>Information</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${fullHouseDTOList}" var="fullHouseDTOList">
        <tr>
            <td>${fullHouseDTOList.id}</td>
            <td>${fullHouseDTOList.name}</td>
            <td>${fullHouseDTOList.phone}</td>
            <td>${fullHouseDTOList.start}</td>
            <td>${fullHouseDTOList.nameCost}</td>
            <td>${fullHouseDTOList.note}</td>
            <td><a class="btn btn-outline-info btn-sm" role="button" aria-pressed="true"
                   href="house?action=view&id=${fullHouseDTOList.id}">Information</a></td>
            <td><a class="btn btn-outline-warning btn-sm" role="button" aria-pressed="true"
                   href="house?action=edit&id=${fullHouseDTOList.id}">Edit</a></td>
            <td><a class="btn btn-outline-danger btn-sm delete" role="button" aria-pressed="true"
                   href="house?action=delete&id=${fullHouseDTOList.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
