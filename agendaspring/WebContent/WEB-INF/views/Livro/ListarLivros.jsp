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

	<h1>Livros Cadastrados</h1>
	<div style="font-weight: bold; txt-align: center;">
		<table border=1>
			<thead>
				<tr>
					<th>Titulo</th>
					<th>Autor</th>
					<th>Editora</th>
					<th>Ano de Publicação</th>
					<th>Edição</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="livro" items="${livros }">
					<tr>
						
						<td>${livro.titulo }</td>
						<td>${livro.autor }</td>
						<td>${livro.editora }</td>
						<td><fmt:formatDate value="${livro.anoPublicacao.time}" pattern="dd/MM/yyyy"/></td>
						<td>${livro.edicao }</td>
						<td><a href="/Biblioteca/livros/remover?id=${livro.id}">remover</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>