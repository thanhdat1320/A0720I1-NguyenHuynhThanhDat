<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2021
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/product/search.js"></script>
</head>
<body>
    <h1>Products</h1>
    <a href="products?action=create">Create new product</a>
<%--    <form action="products" method="post">--%>
<%--        <table>--%>
<%--            <tr>--%>
<%--                <td><input type="text" name="search"></td>--%>
<%--                <td><input type="submit" value="Search"></td>--%>
<%--                <td><input type="reset" value="Reset"></td>--%>
<%--            </tr>--%>
<%--            <input type="hidden" name="action" value="search">--%>
<%--        </table>--%>
<%--    </form>--%>

    Customer Name: <input type="text" id="customerName">
    <button id="search">Search</button>
    <hr>
    <div id="result">
        <table border="1px">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Provider</td>
                <td>Price</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
            <c:forEach items="${products}" var="pro">
                <tr>
                    <td>${pro.id}</td>
                    <td><a href="products?action=view&id=${pro.id}">${pro.name}</a></td>
                    <td>${pro.provider}</td>
                    <td>${pro.price}</td>
                    <td><a href="products?action=edit&id=${pro.id}">Edit</a></td>
                    <td><a href="products?action=delete&id=${pro.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
