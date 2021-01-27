<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/24/2021
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert//css/style.css">
</head>
<body>
<div class="container viewEmployee">
    <table border="1px" class="table table-dark">
        <tr>
            <th>ID</th>
            <td>${employee.id}</td>
        </tr>
        <tr>
            <th>Name</th>
            <td>${employee.name} </td>
        </tr>
        <tr>
            <th>Level</th>
            <td>${levelEmployee.name} </td>
        </tr>
        <tr>
            <th>Department</th>
            <td>${departmentEmployee.name} </td>
        </tr>
        <tr>
            <th>Position</th>
            <td>${positionEmployee.name}</td>
        </tr>
        <tr>
            <th>Birthday</th>
            <td>${employee.birthday}</td>
        </tr>
        <tr>
            <th>Identity</th>
            <td>${employee.identity}</td>
        </tr>
        <tr>
            <th>Phone Number</th>
            <td>${employee.phoneNumber}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${employee.email}</td>
        </tr>
        <tr>
            <th>Salary</th>
            <td>${employee.salary}</td>
        </tr>
    </table>
    <hr>
    <a class="btn btn-outline-secondary" href="employee" role="button">Back</a>
</div>

<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
