<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/12/2022
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello word</title>
</head>
<body>
<form method="post" action="/processFormVersionTwo" >

    <input  type="text"  name="studentName" placeholder="whats your name?">
    <input type="submit" value="Submit Query" />
</form>
<a href="/show" >Landing Page</a>

<%--<form action="/person/submit" method="post">--%>
<%--    name : <input name="name" id="name" type="text" /> <br/> <br/>--%>
<%--    family : <input name="family" id="family" type="text" /> <br/> <br/>--%>
<%--    age : <input name="age" id="age" type="text" /> <br/> <br/>--%>
<%--    <input name="buttun" type="submit" id="buttun" />--%>
<%--</form>--%>

</body>
</html>
