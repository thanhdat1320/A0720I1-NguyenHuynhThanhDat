<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2020
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Currency Converter</h1>
    <c:if test="${usd == null}">
        <c:set var="usd" value="0"/>
    </c:if>

    <c:if test="${usd < 0}">
        <h2><c:out value="${error}"/></h2>
    </c:if>
    <form action="converter" method="post">
        <label for="rate"> Rate: </label>
        <input type="text" name="rate" value="22000" id="rate" readonly><br>
        <label for="usd"> Usd: </label>
        <input type="text" name="usd" value="0" id="usd"><br>
        <label for="result">Result</label>
        <c:if test="${usd >= 0}">
            <input type="text" name="usd" value="<c:out value="${rate * usd}"/>" id="result" readonly>
        </c:if>
        <input type="submit" value="Converter">
    </form>
</body>
</html>
