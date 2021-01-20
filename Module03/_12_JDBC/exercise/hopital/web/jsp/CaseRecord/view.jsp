<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 7:49 PM
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
    <div>
        <table border="1px" class="table table-dark viewPatient">
            <tr>
                <th>ID</th>
                <td>${caseRecord.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>
                    <c:forEach items="${patientList}" var="patient">
                        <c:if test="${patient.id == caseRecord.idPatient}">${patient.name}</c:if>
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <th>Start</th>
                <td>${caseRecord.start}</td>
            </tr>
            <tr>
                <th>End</th>
                <td>${caseRecord.end}</td>
            </tr>
            <tr>
                <th>Reason</th>
                <td>${caseRecord.reason}</td>
            </tr>
        </table>
        <a class="btn btn-outline-secondary" href="hospital" role="button">Back to list</a>
    </div>
    <script type="text/javascript" src="assert/Jquery/jquery.js"></script>
    <script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
