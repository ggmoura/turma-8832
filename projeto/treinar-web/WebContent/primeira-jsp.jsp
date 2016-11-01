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
	out.println("Your IP address is " + request.getRemoteAddr());
%>
Today's date: <%= (new SimpleDateFormat("D").format(new Date()))%>

<% 
	List<TipoConta> tipos = (List<TipoConta>) request.getAttribute("TIPOS_CONTA");
	out.print("<br />");
	for(TipoConta tipo : tipos) {
		out.print(tipo);
		out.print("<br />");
	}
%>

<script type="text/javascript">
	//alert('Olá Mundo');
</script>

</body>
</html>