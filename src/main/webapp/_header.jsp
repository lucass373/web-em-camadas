<%
	String username = (String)session.getAttribute("username");

	if (username == null)
		response.sendRedirect("login.jsp?erro=invasao");
%>

<html>

<head> 
	<link rel="stylesheet" href="include/estilo.css" />
	<title>AcademicNet</title>
</head>

<body>

<div id="container">

<div id="banner">
	<p align="right" id="senac"><% out.print("Olá, "+session.getAttribute("username")); %><img src="include/common/logo_lasalle.jpg" /></p>
</div>

<div id="sidebar-a">
	<ul id="menu">
		<li>[<a href="index.jsp">Principal</a>]</li>
		<hr />

		<li>[<a href="command?comando=ContaListar">Contas</a>]</li>
		<hr />
		
		<li>[<a href="command?comando=AlunoListar">Alunos</a>]</li>
		<hr />
		
		<li>[<a href="command?comando=TurmaListar">Turmas</a>]</li>
		<hr />
		
		<li>[<a href="logout">Logout</a>]</li>
	</ul>
</div>

<div id="content">

<br />