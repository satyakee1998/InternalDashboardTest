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
<link href="../resources/css/login.css" type="text/css" rel="stylesheet" >
</head>
<div class="wrapper">
<div class="container">
<h1>Welcome</h1>
<form action="/userlist" method="POST">
<label for="email"></label>
  <input type="email" id="email" name="email" placeholder="enter your email address"><br>
   <label for="password"></label>
  <input type="password" id="password" name="password" placeholder="enter your password"><br>
  <button type="submit"  id="login-button">login</button>
 </form>
 
</div>

<ul class="bg-bubbles">
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
</ul>
</div>
</body>
</html>
