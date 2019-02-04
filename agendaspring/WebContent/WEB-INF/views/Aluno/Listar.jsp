<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos</title>
</head>
<body>
	<c:import url="../Menu.jsp"></c:import>

	<h1>Alunos Cadastrados</h1>
	<div style="font-weight: bold; txt-align: center;">
		<table border=1>
			<thead>
				<tr>
					<th>Matricula</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>Data de Nascimento</th>
					<th>Endereço</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="aluno" items="${alunos }">
					<tr>
						
						<td>${aluno.matricula }</td>
						<td>${aluno.nome }</td>
						<td>${aluno.cpf }</td>
						<td><fmt:formatDate value="${aluno.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
						<td>${aluno.endereco }</td>
						<td><a href="/Biblioteca/alunos/remover?id=${aluno.id}">remover</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>