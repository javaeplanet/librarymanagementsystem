<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saving The Book</title>
</head>
<body>
<h1>SAVE BOOK</h1>
<form action="saveBook" method="post">
<pre>
Title:<input type="text" name="title"></br>
Author<input type="text" name="author"></br>
isbn:<input type="text" name="isbn"></br>
publication:<input type="text" name="publication"></br>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>