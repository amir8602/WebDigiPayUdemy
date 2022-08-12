<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/12/2022
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hour</title>
</head>
<body>
<form method="post" action="/time/showTime" >
    hour : <input name="hour" id="hour" type="text" /> <br/> <br/>
    minute : <input name="minute" id="minute" type="text" /> <br/> <br/>
    <input value="submit" name="submit" type="submit" />
</form>
</body>
</html>
