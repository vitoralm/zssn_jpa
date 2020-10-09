<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Survivor manager</title>
</head>
<body>
	<form action="Register" method="post">
		<label for="cadUsuario">Survivor info</label><br><br>
		<input placeholder="Id" type="number" name="id" value="<%= request.getParameter("id")%>"><br><br>
		<input placeholder="Name" name="name" value="<%= request.getParameter("name")%>"><br><br>
		<input placeholder="Age" type="number" name="age" value="<%= request.getParameter("age")%>"> <br><br>
		<div>
			<label>Gender:</label><br><br>
			<input type="radio" name="gender" value="Male">
			<label for="M">Male</label><br>
			<input type="radio" name="gender" value="Female">
			<label for="F">Female</label><br><br>
		</div>
		<div>
			<label for="ultLocalizacao">Last Location</label><br><br>
			<input placeholder="Latitude" name="latitude" value="<%= request.getParameter("lat")%>"><br><br>
			<input placeholder="Lontigude"name="longitude" value="<%= request.getParameter("long")%>"><br><br>
			<input type="submit" value="Send">
		</div>
	</form>
</body>
</html>