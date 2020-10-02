<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="menu">
		<ul>
  			<li><a href="registerUser.jsp">Cadastrar</a> </li>
  			<li> Item two </li>
		</ul>
	</div>
	<div id="container">
		<h3>Descrição do Problema</h6>
		<p>O mundo finalmente atingiu o seu estado apocalíptico, onde uma pandemia causada por um virus de laboratório transforma seres humanos e animais em zumbis, seres sedentos por carne.
		   Você, como membro da resistência (e último sobrevivente com conhecimentos em desenvolvimento de software) foi incubido à desenvolver um sistema para compartilhamento de recursos entre os humanos não infectados.
	    </p>
		<h3>Funcionalidades</h6>
		<p>O sistema consiste em uma API REST, que irá armazenar informações sobre os sobreviventes, bem como os recursos que cada um detem.
		   Para isso, o sistema deverá contar com as seguintes funcionalidades.
		</p>
		<ul>
			<li>Cadastrar usuários na base:
				<p>Um usuário é definido basicamente por seu nome, idade, sexo e última localização (latitude, longitude).
					Ao ser criado, um usuário irá conter um inventário de itens que o mesmo detem (inicialmente vazio).
					Os itens aceitos são: água, comida, medicamento e munição.
				</p>
			</li>
			<li>Atualizar localização de usuário:
				<p>Um usuário deve ser capaz de atualizar sua última localização, informando a nova latitude/longitude.</p>
			</li>
			<li>Marcar usuário como infectado:
				<p>Em uma situação caótica como essa, é inevitável que um usuário do sistema venha a ser contaminado.
				   Nesse caso, o mesmo deve ser atualizado no sistema como infectado.
				   Um usuário infectado não pode realizar escambo, não pode manipular seu inventário nem ser listado nos relatórios (para fins práticos, o mesmo está inativo).
				   
				   Um usuário é considerado infectado quando ao menos 3 outros usuários distintos do sistema reportaram sua contaminação.
				   Ao ser infectado, todos os itens do inventário do usuário ficam inacessíveis.
				</p>
			</li>
			<li>Adicionar/Remover itens do inventário de um usuário:
				<p> Um usuário deve ser capaz de atualizar sua última localização, informando a nova latitude/longitude.</p>
			</li>
			<li>Atualizar localização de usuário:
				<p>Um usuário poderá adicionar/remover itens de seu inventário.
				   Os possíveis itens estão descritos na primeira opção acima;
				</p>
			</li>
			<li>Escambo de bens:
				<p>Usuários do sistema podem trocar bens entre si.
				   Para isso, a tabela de equivalência abaixo será utilizada.
				   Todos os escambos devem conter saldo final zero, ou seja, os dois usuários devem negociar a mesma quantidade de pontos.
				   Não é necessário realizar o registro do escambo, apenas transferir os itens entre os dois usuários.
				</p>
				<table>
					<tr>
						<th>Item</th>
						<th>Pontos</th>
					</tr>
					<tr>
						<th>1 Água</th>
						<th>4 pontos</th>
					</tr>
					<tr>
						<th>1 Comida</th>
						<th>3 pontos</th>
					</tr>
					<tr>
						<th>1 Remédio</th>
						<th>2 pontos</th>
					</tr>
					<tr>
						<th>1 Munição</th>
						<th>1 ponto</th>
					</tr>
				</table>
			</li>
			<li>
				<p>Para fins de consulta, os seguintes relatórios devem estar disponíveis no sistema:</p>
				<ol>
					<li>Porcentagem de usuários infectados;</li>
					<li>Porcentagem de usuários não infectados;</li>
					<li>Quantidade média de cada tipo de item por usuário (águas/usuario, comidas/usuário, etc);</li>
					<li>Número de pontos perdidos por usuários infectados;</li>
				</ol>
			</li>
		</ul>
		<h3>Orientações técnicas
			<ol>
  				<li>Utilize a linguagem e framework de sua preferência;</li>
  				<li>Utilize um banco de dados relacional (PostgreSql, MySql, etc);</li>
  				<li>Sistema REST, respondendo aos verbos HTTP (POST, GET, UPDATE, etc). A definição das rotas e verbos utilizados fica a seu critério, entretanto procure manter os standards e best practices;</li>
  				<li>Toda a comunicação é feita via JSON;</li>
  				<li>Não é necessário autenticação (afinal, quem vai perder tempo hackeando o sistema com um bando de zumbis na cola?! :P );</li>
  				<li>Como o número de sobreviventes é baixo, o tráfego no sistema não será alto;</li>
			</ol>

		</h3>
		<h3>Dicas:
			<ol>
				<li>Documente todo o seu sistema, desde como fazer o setup e rodar os testes, até as rotas criadas, exemplos de chamadas à API e as decisões arquiteturais;</li>
  				<li>Testes, testes e testes! Num apocalipse zumbi, ninguém tem tempo a perder fazendo testes manuais, então automatize ao máximo sua suite;</li>
  				<li>Utilize Git, com commits pequenos e bem descritos (nada de um commit único com todo o código);</li>
			</ol>
		</h3>
		<button type="button" > </button>		   
	</div>
</body>
</html>