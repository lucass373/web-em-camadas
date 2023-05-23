<html>

<head> 
	<link rel="stylesheet" href="include/estilo.css" />
	<title>UniLasalle</title>
</head>

<body>

<p>
	<img src="include/common/logo_lasalle.jpg" width="300" height="300" />
</p>

<form action="login" method="post">
	Login: <input type="text" name="username" size="20" /><br/>
	Senha: <input type="password" name="password" size="20" /><br/>

	<br/>

	<input type="submit" value="Entrar"/>
</form>

<%
	String erro = request.getParameter("erro");

	if (erro != null)
	{
		if (erro.equals("invasao"))
			out.print("<font color=white>Área restrita. Entre com nome e senha</font>");
	}
%>

</body>
</html>







