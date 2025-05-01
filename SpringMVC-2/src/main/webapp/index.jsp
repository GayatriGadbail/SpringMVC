<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>This is a index page</h2>

<br>
<br>
<form action="login">

<tr>
<td><label for="uname">Enter Your UserName-</label></td>
<td><input type="text"   name="uname" id="uname" placeholder="Enter Username" required></td>
</tr>
<br>
<br>

<tr>
<td><label for="pass">Enter Your Password-</label></td>
<td><input type="text"   name="pass" id="pass" placeholder="Enter Password" required></td>
</tr>
<br>
<br>
<input type="submit" >


<a href="register.jsp">New User</a>

</form>
</body>
</html>