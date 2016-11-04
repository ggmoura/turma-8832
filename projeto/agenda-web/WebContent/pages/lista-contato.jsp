<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Contato</title>
</head>
<body>

	<form action="lista.trn">
		
		<table data-role="table" id="table-1" class="ui-responsive" border="1">
			<thead>
				<tr>
					<th>Nome</th>
					<th data-priority="1">Email</th>
					<th data-priority="2">Sexo</th>
					<th data-priority="3">Data Nascimento</th>
					<th data-priority="4">Telefone</th>
					<th data-priority="4">Tipo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${contatos}" var="c">
					<tr>
						<td>${c.pessoa.nome}</td>
						<td>${c.email}</td>
						<td>${c.pessoa.sexo}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy" value="${c.pessoa.dataNascimento}" /></td>
						<td>${c.telefone.ddd}-${c.telefone.numero}</td>
						<td>${c.telefone.tipoTelefone}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</form>

</body>
</html>