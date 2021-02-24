<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/1/2021
  Time: 6:53 PM
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
    <form action="house" method="post">
        <div class="container viewCreateCustomer">

            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">ID</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="id" name="id" value="${house.id}">
                    <c:if test="${errorId != null}">
                        <p style="color: red"><c:out value="${errorId}"/></p>
                    </c:if>
                </div>
            </div>

            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="name" name="name" value="${house.name}">
                    <c:if test="${errorName != null}">
                        <p style="color: red"><c:out value="${errorName}"/></p>
                    </c:if>
                </div>
            </div>

            <div class="form-group row">
                <label for="phone" class="col-sm-2 col-form-label">Phone Number</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="phone" name="phone"
                           value="${house.phone}">
                    <c:if test="${errorPhoneNumber != null}">
                        <p style="color: red"><c:out value="${errorPhoneNumber}"/></p>
                    </c:if>
                </div>
            </div>

            <div class="form-group row">
                <label for="start" class="col-sm-2 col-form-label">Start</label>
                <div class="col-sm">
                    <input type="date" class="form-control" id="start" name="start" value="${house.start}">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Cost</label>
                <div class="col-sm">
                    <select name="typeCost" class="form-select" aria-label="Default select example">
                        <c:forEach items="${costList}" var="costList">
                            <c:choose>
                                <c:when test="${costList.id == house.idCost}">
                                    <option value="${costList.id}" selected>${costList.name}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${costList.id}">${costList.name}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label for="note" class="col-sm-2 col-form-label">Note</label>
                <div class="col-sm">
                    <input type="text" class="form-control" id="note" name="note" value="${house.note}">
                </div>
            </div>

            <hr>
            <input type="submit" class="btn btn-outline-success" value="Create">
            <a class="btn btn-outline-secondary" href="house" role="button">Back</a>
        </div>
        <input type="hidden" name="action" value="create">
    </form>
</div>

<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/js/search.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
