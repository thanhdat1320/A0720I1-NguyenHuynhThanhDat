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
    <h2>${error}</h2>
    <form action="converter" method="post">
        <label for="rate"> Rate: </label>
        <input type="text" name="rate" value="22000" id="rate" readonly>
        <label for="usd"> Usd: </label>
        <input type="text" name="usd" value="0" id="usd"><br>
        <label for="result">Result</label>
        <input type="text" name="usd" value="${result}" id="result" readonly>
        <input type="submit" value="Converter">
    </form>
</body>
</html>
