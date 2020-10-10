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
		<label>Survivor info</label><br><br>
		<label for="id">Id</label><br>
		<input readonly="readonly" id="id" placeholder="Id" type="number" name="id" value="<%= request.getParameter("id")%>"><br><br>
		
		<% String name = request.getParameter("name");
		
		   if (name != null) { %> 
		      <label for="name">Name</label><br>
		      <input id="name" placeholder="Name" name="name" value="<%= request.getParameter("name")%>"><br><br>
		<% } else { %>
		 	  <label for="name">Name</label><br>
		      <input id="name" placeholder="Name" name="name"><br><br>
		 <% } %>
		
		<label for="age">Age</label><br>
		<input id="age" placeholder="Age" type="number" name="age" value="<%= request.getParameter("age")%>"> <br><br>
		<div>
			<label>Gender:</label><br>
			<%
				String gender = request.getParameter("gender");
				
				if (gender != null) {
					if (gender.equals("Male")) { %>
						<input id="male" type="radio" name="gender" value="Male" checked="checked">
						<label for="male">Male</label><br>
						<input id="female" type="radio" name="gender" value="Female">
						<label for="female">Female</label><br><br>
		       	<%} else if (gender.equals("Female")) { %>
							<input id="male" type="radio" name="gender" value="Male">
							<label for="male">Male</label><br>
							<input id="female" type="radio" name="gender" value="Female" checked="checked">
							<label for="female">Female</label><br><br>
			   <% } 
				 } else { %> 
						<input id="male" type="radio" name="gender" value="Male">
						<label for="male">Male</label><br>
						<input id="female" type="radio" name="gender" value="Female">
						<label for="female">Female</label><br><br>
			     <% } %>
		</div>
		<div>
			<label>Last location</label><br>
			<% String latitude = request.getParameter("lat");
			   String longitude = request.getParameter("long");
			   if (latitude != null && longitude != null) { %>
		          <input placeholder="Latitude" name="latitude" value="<%= request.getParameter("lat")%>"><br><br>
			      <input placeholder="Lontigude"name="longitude" value="<%= request.getParameter("long")%>"><br><br>
			<% } else { %>
				  <input placeholder="Latitude" name="latitude"><br><br>
			      <input placeholder="Lontigude"name="longitude"><br><br>
			<% } %>
			<input type="submit" value="Save">
		</div>
	</form>
</body>
</html>