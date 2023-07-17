<%--
  Created by IntelliJ IDEA.
  User: 조유현
  Date: 2023-07-17
  Time: 오후 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
    <form action="/todo/register" method="post">
        <div>
            Title: <input type="text" name="title">
        </div>
        <div>
            DueDate: <input type="date" name="dueDate" value="2023-07-17">
        </div>
        <div>
            Writer: <input type="text" name="writer">
        </div>
        <div>
            Finished: <input type="checkbox" name="finished">
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>
</body>
</html>
