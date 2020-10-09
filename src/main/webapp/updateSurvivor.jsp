<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar última localização</title>
</head>
<body>
	<form action="UpdateSurvivorLastLocation" method="post">
		<input type="number" placeholder="ID único do sobrevivente" name="idsurvivor"><br><br>
		<div>
			<label for="ultLocalizacao">Última localização:</label><br><br>
			<input placeholder="Latitude" name="latitude"><br><br>
			<input placeholder="Lontigude"name="longitude"><br><br>
			<input type="submit" value="Atualizar">
		</div>
	</form>
</body>
</html>