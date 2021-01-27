<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/24/2021
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert/css/style.css">
</head>
<body>
<div class="create">
    <form action="employee" method="post">
        <div class="container viewCreateEmployee">

            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">ID</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="id" name="id">
                </div>
            </div>

            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="name" name="name">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Level</label>
                <div class="col-sm">
                    <select name="levelEmployee" class="form-select" aria-label="Default select example">
                        <c:forEach items="${levelEmployeeList}" var="level">
                            <option value="${level.id}">${level.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Position</label>
                <div class="col-sm">
                    <select name="positionEmployee" class="form-select" aria-label="Default select example">
                        <c:forEach items="${positionEmployeeList}" var="position">
                            <option value="${position.id}">${position.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Department</label>
                <div class="col-sm">
                    <select name="departmentEmployee" class="form-select" aria-label="Default select example">
                        <c:forEach items="${departmentEmployeeList}" var="department">
                            <option value="${department.id}">${department.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label for="birthday" class="col-sm-2 col-form-label">Birthday</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="birthday" name="birthday">
                </div>
            </div>

            <div class="form-group row">
                <label for="identity" class="col-sm-2 col-form-label">Identity</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="identity" name="identity">
                </div>
            </div>

            <div class="form-group row">
                <label for="phoneNumber" class="col-sm-2 col-form-label">Phone Number</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                </div>
            </div>

            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="email" name="email">
                </div>
            </div>

            <div class="form-group row">
                <label for="salary" class="col-sm-2 col-form-label">Salary</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="salary" name="salary">
                </div>
            </div>

            <hr>
            <input type="submit" class="btn btn-outline-success" value="Create">
            <a class="btn btn-outline-secondary" href="employee" role="button">Back</a>
        </div>
        <input type="hidden" name="action" value="create">
    </form>

    <script type="text/javascript" src="assert/Jquery/jquery.js"></script>
    <script type="text/javascript" src="assert/js/search.js"></script>
    <script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</div>
</body>
</html>
