<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastrando o Livro</title>
	</head>
	<body>
		<c:import url="../Menu.jsp"></c:import>
		<form action="adicionar" method="post">
			<label>Título: </label>
			<input type="text" name="titulo">
			
			<label>Autor: </label>
			<input type="text" name="autor">
			
			<label>Editora: </label>
			<input type="text" name="editora">
			
			<label>Ano de publicação: </label>
			<input type="text" name="anoPublicacao">
			
			<label>Edição: </label>
			<input type="text" name="edicao">
		
			<input type="submit" value="Cadastrar" />
		</form>
	</body>
</html>