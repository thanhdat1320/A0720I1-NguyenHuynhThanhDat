<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert/css/style.css">
</head>
<body>
<div class="container viewList">
    <div class="row">

        <div class="col">
            <div class="d-flex">
                <input class="form-control mr-sm-2" aria-label="Search" type="text" id="nameSearch">
                <button type="button" class="btn btn-outline-success" id="search">Search</button>
            </div>
        </div>

        <div class="col">
            <a class="btn btn-outline-secondary" href="house?action=create" role="button">Create new house</a>
        </div>

        <div class="col">
            <a class="btn btn-outline-secondary" href="house" role="button">Back to home</a>
        </div>

    </div>
</div>
<hr>

<div id="result" class="container-lg">
    <table class="table table-Secondary resultList">
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
</div>


<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/js/search.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
