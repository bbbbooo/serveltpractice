<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="test" method="GET">
    <input type="submit" value="get">
</form>

<form action="test" method="POST">
    <input type="submit" value="post">
</form>

</body>
</html>