<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Center info</title>
</head>
<body>
<h2>Center info</h2>
<br>
<form:form action="saveCenter" modelAttribute="center">

    Name <form:input path="name"/>
    <br>
    Phone <form:input path="phone"/>
    <br>
    Address <form:input path="address"/>
    <br>
    <br>

    City information
    <br>
    &nbsp; &nbsp;Name <form:input path="city.name"/>

    <br>
    <input type="submit" value="Okay">
</form:form>
</body>
</html>

