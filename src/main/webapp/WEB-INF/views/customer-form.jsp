<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/14/2022
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Register Form</title>
 <style>
     .error{color:red}
 </style>
</head>
<body>


<form:form action="processForm" modelAttribute="customer">

    First name:<form:input path="firstName"  />
    <form:errors path="firstName" cssClass="error"/>
    <br/><br/>

    Last name:<form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br/><br/>
    number : <form:input path="number" />
    <form:errors path="number"  cssClass="error"/>
    <br/><br/>

    Course Code : <form:input path="courseCode"/>
    <form:errors cssClass="error" path="courseCode"/>

    <br/><br/>

    <input type="submit" value="Submit">


</form:form>

</body>
</html>
