<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<body>
<h1>Account Details:</h1>
<form action="saveAccountDetails" method="post">
<pre>
BORROWED BOOKS:<input type="text" name="no_borrowed_books"></br>
RESERVED BOOKS:<input type="text" name="no_reserved_books"></br>
RETURNED BOOKS:<input type="text" name="no_returned_books"></br>
FINE AMOUNT:<input type="text" name="no_lost_booksfine_amount"></br>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>