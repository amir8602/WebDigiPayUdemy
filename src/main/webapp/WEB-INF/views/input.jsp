<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/12/2022
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/person/submit" method="post">
    name : <input name="name" id="name" type="text" /> <br/> <br/>
    family : <input name="family" id="family" type="text" /> <br/> <br/>
    age : <input name="age" id="age" type="text" /> <br/> <br/>
    <input name="buttun" type="submit" id="buttun" />
</form>
</body>
</html>
