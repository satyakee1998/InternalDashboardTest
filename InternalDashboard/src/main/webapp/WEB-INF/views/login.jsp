<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>
LoginPage
</title>
<meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
<!-- CSS Files -->
<link href="resources/css/style.css" type="text/css" rel="stylesheet" />
<!-- <link href="resources/css/login.css" type="text/css" rel="stylesheet" /> -->
</head>
<body>

<h1>Login Page</h1>

<form action="/userlist" method="POST">
  
  <label for="email">EmailID:</label>
  <input type="email" id="email" name="email" placeholder="enter your email address"><br><br>
   <label for="password">Password:</label>
  <input type="password" id="password" name="password" placeholder="enter your password"><br><br>
  <button type="submit" id="login-button">Login</button>
</form>


</body>
</html>





