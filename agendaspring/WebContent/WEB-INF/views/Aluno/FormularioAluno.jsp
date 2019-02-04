<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro do Aluno</title>
</head>
<body>
<c:import url="../Menu.jsp"></c:import>
<form action="/Biblioteca/alunos/adicionar" method="post">
			Matricula:<input type="text" name="matricula"><br><br>
			Nome:<input type="text" name="nome"><br><br>
			CPF:<input type="text" name="cpf"><br><br>
			Endereco:<input type="text" name="endereco" /><br><br>
			Data de Nascimento: <input type="text" name="dataNascimento" />
			<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>