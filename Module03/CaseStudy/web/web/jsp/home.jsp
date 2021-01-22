<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/21/2021
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assert/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="assert/css/style.css">
</head>

<body>
<div id="header">
    <span class="header-logo">logo</span>
    <span class="header-banner">banner</span>
</div>

<nav id="navigation">
    <div class="navigation-flex">
        <span class="navigation-home">
            <ul>
                <li><a class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" href="furama">Home</a></li>
                <li><a class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" href="customer">Customer</a></li>
                <li><a class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" href="employee">Employee</a></li>
                <li><a class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" href="service">Service</a></li>
                <li><a class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" href="contract">Contract</a></li>
            </ul>
        </span>
    </div>
</nav>

<div id="main">
    <div id="sidebar-left">
        <div class="sidebar-left-main">
            <div class="sidebar-intro">introduction</div>
            <div class="sidebar-nope">nope</div>
        </div>
    </div>

    <div id="content">
        <div class="content content1">
            <span>hot news</span>
            <span>photo side</span>
        </div>
        <div class="content content2">
            <span>news </span>
            <span>news </span>
            <span>news </span>
            <span>news </span>
            <span>news </span>
            <span>news </span>
        </div>
    </div>

    <div id="sidebar_right">
        <span>abc</span>
        <span>abc</span>
        <span>abc</span>
    </div>
</div>

<footer id="footer">
    <span class="footer-year">
          <p>@2012 - TapChiLapTring</p>
    </span>

    <span>
        <ul>
            <li>home</li>
            <li>home</li>
            <li>home</li>
            <li>home</li>
            <li>home</li>
        </ul>
    </span>
</footer>

<script type="text/javascript" src="assert/Jquery/jquery.js"></script>
<script type="text/javascript" src="assert/js/search.js"></script>
<script type="text/javascript" src="assert/css/bootstrap/js//bootstrap.js"></script>
</body>
</html>
