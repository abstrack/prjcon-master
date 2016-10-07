<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello world</title>
</head>

<body>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Price</th>

    </tr>

    </thead>
    <c:forEach items="${listatt}" var="book">
        <tr>

            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            <td>
                <a href="delete?id=${book.id}">Delete</a>
            </td>
            <td>
                <a href="/edit?id=${book.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="create">Create</a>
</body>
</html>