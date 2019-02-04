<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livros</title>
</head>
<body>
	<c:import url="../Menu.jsp"></c:import>

	<h1>Emprestimos</h1>
	<div style="font-weight: bold; txt-align: center;">
		<table border=1>
			<thead>
				<tr>
					<th>Matricula do Aluno</th>
					<th>id Livro</th>
					<th>Data de Emprestimo</th>
					<th>Data de Devolução</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Emprestimo" items="${emprestimo }">
					<tr>
						
						<td>${emprestimo.matriculaAluno }</td>
						<td>${emprestimo.idLivro }</td>
						<td><fmt:formatDate value="${emprestimo.dataEmprestimo.time}" pattern="dd/MM/yyyy"/></td>
						<td><fmt:formatDate value="${emprestimo.dataDevolucao.time}" pattern="dd/MM/yyyy"/></td>
						
						<td><a href="/Biblioteca/emprestimos/remover?id=${emprestimo.id}">remover</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>