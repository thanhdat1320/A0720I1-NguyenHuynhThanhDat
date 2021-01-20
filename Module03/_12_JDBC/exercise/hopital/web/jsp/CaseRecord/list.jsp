<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/17/2021
  Time: 9:23 AM
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
<div class="container" id="content">
    <div class="row">
        <div class="col">
            <div class="d-flex">
                <input class="form-control mr-sm-2" aria-label="Search" type="text" id="nameSearch">
                <button type="button" class="btn btn-outline-secondary" id="search">Search</button>
            </div>
        </div>
        <div class="col">
            <a class="btn btn-outline-secondary" href="hospital?action=create" role="button">Create new case record</a>
        </div>
    </div>
</div>
<hr>

<div id="result">
    <table border="1px" class="table table-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start</th>
            <th>End</th>
            <th>Reason</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${cases}" var="cases">
            <tr>
                <td><a href="hospital?action=view&id=${cases.id}">${cases.id}</a></td>
                <td>
                    <c:forEach items="${patientList}" var="patient">
                        <c:if test="${patient.id == cases.idPatient}"><a href="hospital?action=viewPatient&id=${patient.id}">${patient.name}</a></c:if>
                    </c:forEach>
                <td>${cases.start}</td>
                <td>${cases.end}</td>
                <td>${cases.reason}</td>
                <td><a href="hospital?action=edit&id=${cases.id}">Edit</a></td>
                <td><a href="hospital?action=delete&id=${cases.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/js/search.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
