<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/13/2022
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student-form</title>
</head>
<body>


<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name:<form:input path="lastName"/>
    <br><br>
    <form:select path="country">
        <form:option value="Brail" label=" Brazil"/>
        <form:option value="fra" label=" fra"/>
        <form:option value="ger" label=" geer"/>
        <form:option value="india" label=" india"/>
    </form:select>
    <br><br>

    favorit language:

    java<form:radiobutton path="favo_lang" value="java"/>
    c#<form:radiobutton path="favo_lang" value="c#"/>
    php<form:radiobutton path="favo_lang" value="php"/>
    ruby<form:radiobutton path="favo_lang" value="ruby"/>
    pyton<form:radiobutton path="favo_lang" value="pyton"/>
    <br/><br/>

    Operation System:

    Linux"<form:checkbox path="os"  value="linux"/>
   Mac"<form:checkbox path="os" value="Mac"/>
    Ms"<form:checkbox path="os"  value="Ms"/>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>
