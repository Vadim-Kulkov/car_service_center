<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Car service center</title>
</head>

<body>

<h2>All service centers</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Phone</th>
        <th>City</th>
        <th>Address</th>
    </tr>
    <c:forEach var="center" items="${allCenters}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="centerName" value="${center.name}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteCenter">
            <c:param name="centerName" value="${center.name}"/>
        </c:url>

        <c:url var="showEmployeesButton" value="/showEmployees">
            <c:param name="centerName" value="${center.name}"/>
        </c:url>


        <c:url var="showRepairsButton" value="/showRepairs">
            <c:param name="centerName" value="${center.name}"/>
        </c:url>

        <tr>
            <td>${center.name}

            <td>${center.phone}

            <td>${center.city.getName()}

            <td>${center.address}

            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>
            </td>

            <td>
                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>

            <td>
                <input type="button" value="Show employees"
                       onclick="window.location.href = '${showEmployeesButton}'"/>
            </td>

            <td>
                <input type="button" value="Show repairs"
                       onclick="window.location.href = '${showRepairsButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewCenter'">
</body>
</html>
