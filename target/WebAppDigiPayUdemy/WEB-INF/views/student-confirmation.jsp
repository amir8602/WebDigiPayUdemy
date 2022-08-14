<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/13/2022
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student connfirmation</title>
</head>
<body>
  The student is confirmed:${student.firstName} ${student.lastName}

<br><br>
  favorite language:${student.favo_lang};
  <br><br>
  favorite os:${student.os};

Country:${student.country}
<br><br>

<c:forEach  begin="0" end="10" step="2"  >
    sara
    <br>
</c:forEach>

</body>
</html>
