<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2021
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<div id="result">

        <table border="1px" class="table table-dark">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Start</th>
                <th>End</th>
                <th>Reason</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${caseRecordList}" var="cases">
                        <c:forEach items="${patientList}" var="patient">
                            <c:if test="${patient.id == cases.idPatient}">
                                <c:if test="${name == patient.name}">
                                    <tr>
                                        <td><a href="hospital?action=view&id=${cases.id}">${cases.id}</a></td>
                                        <td><a href="hospital?action=viewPatient&id=${patient.id}">${patient.name}</a></td>
                                        <td>${cases.start}</td>
                                        <td>${cases.end}</td>
                                        <td>${cases.reason}</td>
                                        <td><a href="hospital?action=edit&id=${cases.id}">Edit</a></td>
                                        <td><a href="hospital?action=delete&id=${cases.id}">Delete</a></td>
                                    </tr>
                                </c:if>
                            </c:if>
                        </c:forEach>
            </c:forEach>
        </table>

</div>
</body>
</html>
