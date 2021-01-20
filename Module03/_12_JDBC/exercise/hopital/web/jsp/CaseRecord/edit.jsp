<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/20/2021
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert/css/style.css">
</head>
<body>
<div class="edit">
    <form action="hospital" method="post">
        <div class="container">
            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">ID</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="id" name="id" value="${caseRecord.id}" readonly>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Name Patient</label>
                <div class="col-sm">
                    <form action="hospital" method="post">
                        <select name="patient">
                            <c:forEach items="${patientList}" var="patient">
                                <option value="${patient.id}">${patient.name}</option>
                            </c:forEach>
                        </select>
                    </form>
                    <input type="hidden" name="action" value="edit">
                </div>
            </div>

            <div class="form-group row">
                <label for="start" class="col-sm-2 col-form-label">Start</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="start" name="start" value="${caseRecord.start}">
                </div>
            </div>

            <div class="form-group row">
                <label for="end" class="col-sm-2 col-form-label">End</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="end" name="end" value="${caseRecord.end}">
                </div>
            </div>

            <div class="form-group row">
                <label for="reason" class="col-sm-2 col-form-label">Reason</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="reason" name="reason" value="${caseRecord.reason}">
                </div>
            </div>
            <hr>
            <input type="submit" class="btn btn-outline-success" value="Update">
            <a class="btn btn-outline-secondary" href="hospital" role="button">Back to list</a>
        </div>
        <input type="hidden" name="action" value="edit">
    </form>
</div>


<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/js/search.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
