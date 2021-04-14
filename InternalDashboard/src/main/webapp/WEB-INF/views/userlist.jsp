<%@page import="com.dashboard.controller.HomeController"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Userlist</title>
<meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no'
	name='viewport' />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<script src="resources/js/tablemanager.js"></script>
<style type="text/css">
.tablemanager th{width:25%;}
</style>
</head>
<body>
	<h1>Program Selection</h1>
	<form action="/userlist" method="POST">
		<label>Select a program:</label> <select id="program"
			onchange="selectOption()">

			<option id="sp" value="SP">Select Program</option>
			<option id="mm" value="MM">MM</option>

			<option id="nium" value="NIUM">NIUM</option>
		</select> <br>
		<br>

	</form>

	<table style="display: none; width: add_width;" class="tablemanager"
		id="userlist">
		<thead>
			<tr>
				<th>Sl No</th>
				<th id="userId">companyId</th>
				<th>companyName</th>
				<th>email</th>
				<th>&nbsp;</th>

			</tr>
		</thead>
		<tbody id="myUserTable"></tbody>
	</table>



	<script type="text/javascript" src="resources/js/jquery-3.5.0.js">
		
	</script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/list.js">
		
	</script>
	<script type="text/javascript" src="resources/js/tablemanager.js"> </script>
	</script>
	<script type="text/javascript" src="resources/js/tablem.js"> </script>

</body>
</html>