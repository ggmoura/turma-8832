<%@page import="br.com.treinar.controle.TipoConta"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>

<%
	out.print(request.getAttribute("nomeRequisicao")+"<br />");
	
	out.print(request.getSession().getAttribute("nomeSessao")+"<br />");
	out.print(request.getServletContext().getAttribute("nomeAplicacao")+"<br />");
%>

<br />
<br />
<br />

<input type="text" value="${xpto}">
<input type="text" value="<%= request.getServletContext().getAttribute("xpto")%>">

<script type="text/javascript">
	//alert('Olá Mundo');
</script>

</body>
</html>