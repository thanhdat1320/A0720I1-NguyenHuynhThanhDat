<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Patient</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert//css/style.css">
</head>
<body>
<div>
    <table border="1px" class="table table-dark viewPatient">
        <tr>
            <th>ID</th>
            <td>${patient.id}</td>
        </tr>
        <tr>
            <th>Name</th>
            <td>${patient.name}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${patient.email}</td>
        </tr>
        <tr>
            <th>Address</th>
            <td>${patient.address}</td>
        </tr>
    </table>
    <a class="btn btn-outline-secondary" href="hospital" role="button">Back to list</a>
    <script type="text/javascript" src="assert/Jquery/jquery.js"></script>
    <script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</div>

</body>
</html>
