<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/27/2021
  Time: 3:36 PM
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
    <form action="service" method="post">
        <div class="container viewCreateCustomer">

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
                <label class="col-sm-2 col-form-label">Type Service</label>
                <div class="col-sm">
                    <select name="typeService" class="form-select" aria-label="Default select example">
                        <c:forEach items="${typeServiceList}" var="type">
                            <option value="${type.id}">${type.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Type Rent</label>
                <div class="col-sm">
                    <select name="typeRent" class="form-select" aria-label="Default select example">
                        <c:forEach items="${typeRentList}" var="typeRent">
                            <option value="${typeRent.id}">${typeRent.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label for="area" class="col-sm-2 col-form-label">Area</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="area" name="area">
                </div>
            </div>

            <div class="form-group row">
                <label for="floor" class="col-sm-2 col-form-label">Floor</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="floor" name="floor">
                </div>
            </div>

            <div class="form-group row">
                <label for="amount" class="col-sm-2 col-form-label">Amount</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="amount" name="amount">
                </div>
            </div>

            <div class="form-group row">
                <label for="price" class="col-sm-2 col-form-label">Price</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="price" name="price">
                </div>
            </div>

            <div class="form-group row">
                <label for="status" class="col-sm-2 col-form-label">Status</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="status" name="status">
                </div>
            </div>

            <hr>
            <input type="submit" class="btn btn-outline-success" value="Create">
            <a class="btn btn-outline-secondary" href="service" role="button">Back</a>
        </div>
        <input type="hidden" name="action" value="create">
    </form>

    <script type="text/javascript" src="assert/Jquery/jquery.js"></script>
    <script type="text/javascript" src="assert/js/search.js"></script>
    <script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</div>
</body>
</html>
