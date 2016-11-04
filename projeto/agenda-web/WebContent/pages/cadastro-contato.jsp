<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="trn" uri="../WEB-INF/agenda.tld"%>
<!DOCTYPE html">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<title>Cadastro Contato</title>
</head>
<body>

	<form action="cadastro.trn">

		<input type="hidden" name="comando"
			value="br.com.treinar.agenda.service.CadastroContatoComando"
			id="comando"> 
			
		<div class="ui-grid-a">
			<div class="ui-block-a">
				Nome
			</div>
			<div class="ui-block-b">
				<input type="text" name="nome">
			</div>
			
			<div class="ui-block-a">
				Telefone
			</div>
			<div class="ui-block-b">
				<div class="ui-grid-b">
					<div class="ui-block-a">
						<input type="text" name="ddd">
					</div>
					<div class="ui-block-b">
						<input type="text" name="numero">
					</div>
					<div class="ui-block-c">
						<!-- <select name="tipoTelefone" id="tipoTelefone">
							<option value="SELECIONE">Selecione</option>
							<option value="CELULAR">Celular</option>
							<option value="RESIDENCIAL">Residencial</option>
							<option value="COMERCIAL">Comercial</option>
						</select> -->
						<trn:tipo name="tipoTelefone" id="selectTipoTelefone"></trn:tipo>
					</div>
				</div>
			</div>
			<div class="ui-block-a">
				Data Nascimento
			</div>
			<div class="ui-block-b">
				<input type="text" name="dataNascimento">
			</div>
			
			<div class="ui-block-a">
				Email
			</div>
			<div class="ui-block-b">
				<input type="text" name="email">
			</div>
			
			
			<div class="ui-block-a">
				Sexo
			</div>
			<div class="ui-block-b">
				<div class="ui-block-c">
					<select name="sexo" id="select-1">
						<option value="SELECIONE">Selecione</option>
						<option value="M">Masculino</option>
						<option value="F">Feminino</option>
					</select>
				</div>
			</div>
		</div>
		<input type="submit" value="Cadastrar Contato">

	</form>

</body>
</html>