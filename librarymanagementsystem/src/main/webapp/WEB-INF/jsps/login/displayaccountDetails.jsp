<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Books</h2>
<table border="1">
<thead>
<tr>
<th>borrowed books</th>
<th>reserved books</th>
<th>returned books</th>
<th>fine amount</th>
</tr>
</thead>
<c:forEach items="${ accounts}" var="account">
<tr>
<td><c:out value="${account.no_borrowed_books }"/></td>
<td><c:out value="${account.no_reserved_books }"/></td>
<td><c:out value="${account.no_returned_books }"/></td>
<td><c:out value="${account.no_lost_booksfine_amount }"/></td>
<tr>
<td>
</c:forEach>
</table>

</body>
</html>