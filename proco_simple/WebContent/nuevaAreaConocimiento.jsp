<%@page contentType="text/html; charset=ISO-8859-1"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>PROCO</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/css/3-col-portfolio.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>


	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="sesion">Proco</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="enConstruccion.jsp">Actividades</a></li>
					<li><a href="MisCosas">Mis Cosas</a></li>
				</ul>
				<ul class="nav navbar-nav ajuste">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Ajustes<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="enConstruccion.jsp">Mi Perfil</a></li>
							<li><a href="enConstruccion.jsp">Proyectos</a></li>
							<li><a href="Configuracion">Configuraci�n</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
<!-- Navigation -->

	<form class="form-horizontal">
		<fieldset>

			<!-- Form Name -->
			<legend>Áreas de Conocimiento</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label"
					for="txtNombreAreaConocimiento">Área de Conocimiento</label>
				<div class="col-md-4">
					<input id="txtNombreAreaConocimiento"
						name="txtNombreAreaConocimiento" type="text" placeholder=""
						class="form-control input-md">

				</div>
			</div>

			<!-- Textarea -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="txtDescripcionAreaCon">Descripción</label>
				<div class="col-md-4">
					<textarea class="form-control" id="txtDescripcionAreaCon"
						name="txtDescripcionAreaCon"></textarea>
				</div>
			</div>

			<!-- Button (Double) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="btnAceptar"></label>
				<div class="col-md-8">
					<button id="btnAceptar" name="btnAceptar" class="btn btn-success">Aceptar</button>
					<button id="btnCancelar" name="btnCancelar" class="btn btn-danger"
						type="button" onclick="history.back()">Cancelar</button>
				</div>
			</div>

		</fieldset>
	</form>


</body>

</html>
