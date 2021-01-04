<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/31/2020
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h2>Calculator</h2>
    <form action="calculator" method="post">
        <label for="calculator"> Calculator</label> <br>
        Num1: <input type="text" name="num1">
        <select name="calculator" id="calculator">
            <option value="add">+</option>
            <option value="sub">-</option>
            <option value="mul">*</option>
            <option value="div">/</option>
        </select>
       Num2: <input type="text" name="num2">
        <input type="submit" value="Calculator">
    </form>
    <h3>Result: ${result}</h3>
</body>
</html>
