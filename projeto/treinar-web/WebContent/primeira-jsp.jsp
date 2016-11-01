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

<script type="text/javascript">
	//alert('Olá Mundo');
</script>

</body>
</html>