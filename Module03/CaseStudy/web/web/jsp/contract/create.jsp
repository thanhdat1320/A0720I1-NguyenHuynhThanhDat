<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/29/2021
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert/css/style.css">
</head>
<body>
<div class="create">
    <form action="contract" method="post">
        <div class="container viewCreateCustomer">

            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">ID</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="id" name="id">
                </div>
            </div>

            <div class="form-group row">
                <label for="startDate" class="col-sm-2 col-form-label">Start Date</label>
                <div class="col-sm">
                    <input type="date" class="form-control" id="startDate" name="startDate">
                </div>
            </div>

            <div class="form-group row">
                <label for="endDate" class="col-sm-2 col-form-label">End Date</label>
                <div class="col-sm">
                    <input type="date" class="form-control" id="endDate" name="endDate">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Name Service</label>
                <div class="col-sm">
                    <select name="nameService" class="form-select" aria-label="Default select example">
                        <c:forEach items="${serviceList}" var="serviceList">
                            <option value="${serviceList.id}">${serviceList.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Name Customer</label>
                <div class="col-sm">
                    <select name="nameCustomer" class="form-select" aria-label="Default select example">
                        <c:forEach items="${customerList}" var="customerList">
                            <option value="${customerList.id}">${customerList.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Name Employee</label>
                <div class="col-sm">
                    <select name="nameEmployee" class="form-select" aria-label="Default select example">
                        <c:forEach items="${employeeList}" var="employeeList">
                            <option value="${employeeList.id}">${employeeList.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label for="deposit" class="col-sm-2 col-form-label">Deposit</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="deposit" name="deposit">
                </div>
            </div>

            <div class="form-group row">
                <label for="total" class="col-sm-2 col-form-label">Total</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="total" name="total">
                </div>
            </div>

            <hr>
            <input type="submit" class="btn btn-outline-success" value="Create">
            <a class="btn btn-outline-secondary" href="contract" role="button">Back</a>
        </div>
        <input type="hidden" name="action" value="create">
    </form>

    <script type="text/javascript" src="assert/Jquery/jquery.js"></script>
    <script type="text/javascript" src="assert/js/search.js"></script>
    <script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</div>

</body>
</html>
