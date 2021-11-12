<%--
  Created by IntelliJ IDEA.
  User: nanu_
  Date: 10.11.2021
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In Page</title>
</head>

<body>
    <h1>Log In Here</h1>

    <form method="post" action="/login">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email">

        <br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password">

        <button type="submit">Log In</button>
    </form>
</body>

</html>
