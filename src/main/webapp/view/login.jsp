<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/pear" var="linkEntradaServlet" />
<head>
<link rel="stylesheet" href="view/entrada.css">
</head>
<html>
<body>
	<c:import url="header.jsp" />
	<h2>Login</h2>

	<form class='form' action="${linkEntradaServlet}" method="post">
		<label for='client-login'>Login: </label> <input id='client-login'
			placeholder="Login" name="login"> <label
			for='client-password'>Senha: </label> <input id='client-password'
			placeholder="Senha" name="senha" type="password"> <input
			type="hidden" name=acao value=Login> <input type="submit"
			value="Entrar">
	</form>
	<a href="${linkEntradaServlet}?acao=TelaCadastro"><input type="button" value="Cadastrar"> </a>
</body>
</html>
