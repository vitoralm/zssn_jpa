<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de usuários</title>
</head>
<body>
	<form action="Register" method="post">
		<label for="cadUsuario">Cadastrar novo usuário</label><br><br>
		<input placeholder="Nome" name="nome"><br><br>
		<input placeholder="Idade" type="number" name="idade"> <br><br>
		<div>
			<label>Sexo:</label><br><br>
			<input type="radio" id="M" name="genero" value="Masculino">
			<label for="M">Masculino</label><br>
			<input type="radio" id="F" name="genero" value="Feminino">
			<label for="F">Feminino</label><br><br>
		</div>
		<div>
			<label for="ultLocalizacao">Última localização:</label><br><br>
			<input placeholder="Latitude" name="latitude"><br><br>
			<input placeholder="Lontigude"name="longitude"><br><br>
			<input type="submit" value="Cadastrar">
		</div>
	</form>
</body>
</html>