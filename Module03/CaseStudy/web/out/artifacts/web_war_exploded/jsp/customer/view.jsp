<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/22/2021
  Time: 8:03 AM
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
    <div class="container viewCustomer">
        <table border="1px" class="table table-dark">
            <tr>
                <th>ID</th>
                <td>${customer.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${customer.name} </td>
            </tr>
            <tr>
                <th>Name Type Customer</th>
                <td>${typeCustomer.name} </td>
            </tr>
            <tr>
                <th>Birthday</th>
                <td>${customer.birthday}</td>
            </tr>
            <tr>
                <th>Gender</th>
                <td>${customer.gender}</td>
            </tr>
            <tr>
                <th>Identity</th>
                <td>${customer.identity}</td>
            </tr>
            <tr>
                <th>Phone Number</th>
                <td>${customer.phoneNumber}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${customer.email}</td>
            </tr>
            <tr>
                <th>Address</th>
                <td>${customer.address}</td>
            </tr>
        </table>
        <hr>
        <a class="btn btn-outline-secondary" href="customer" role="button">Back</a>
    </div>

<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
