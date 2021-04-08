<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<h1>Program Selection</h1>

<form action="/userlist" method="POST">
  <label>Select a program:</label>
  <select id="program">
  <option >Select Program</option>
    <option value="MM">MM</option>
    <option value="NIUM">NIUM</option>
  </select>
  <br><br>
  <input type="submit" value="Submit">
</form>
<!-- <script type="text/javascript">
function selectOption()
{
	 src="resources/js/list.js";
}
</script> -->

</body>
</html>