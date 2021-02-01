<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display Books</title>
</head>
<body>
<h2>Books</h2>
<table border="1">
<thead>
<tr>
<th>Title</th>
<th>Author</th>
<th>Isbn</th>
<th>Publication</th>
</tr>
</thead>
<c:forEach items="${ books}" var="book">
<tr>
<td><c:out value="${book.title }"/></td>
<td><c:out value="${book.author }"/></td>
<td><c:out value="${book.isbn }"/></td>
<td><c:out value="${book.publication }"/></td>
<tr>
<td>
</c:forEach>
</table>

</body>
</html>