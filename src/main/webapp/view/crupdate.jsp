<%--
  Created by IntelliJ IDEA.
  User: Meehaeel
  Date: 07-Oct-16
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>

</head>
<body>
<form method="post" action="/edit">
    <input type="text" name="title" value="${book.title}">
    <input type="text" name="author" value="${book.author}">
    <input type="text" name="price" value="${book.price}">
    <input type="hidden" name="id" value="${book.id}">
    <input type="submit" value="submit">
</form>
</body>
</html>
