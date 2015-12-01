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
							<li><a href="Proyectos">Proyectos</a></li>
							<li><a href="Configuracion">Configuración</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
<!-- Navigation -->

	<form class="form-horizontal" action="nuevaAreaConocimiento.jsp">
		<fieldset>
			<!-- Form Name -->
			<legend>Informacion Academica</legend>

			<!-- Button -->
			<div class="container">


				<div align="left" class="col-md-1">
					<button id="btnNuevaAreaConocimiento" name="btnNuevaAreaConocimiento" class="btn btn-warning" type="submit">+</button>
				</div>
			</div>

		</fieldset>

		<div class="container">
			<div class="row">
				<div class="table-responsive">
					<table class="table table-condensed table-hover">
						<thead>
							<tr>
								<th>#</th>
								<th>Institucion</th>
								<th>Programa</th>
								<th>Tipo</th>
								<th>Semestre</th>
								<th>Modificado Por</th>
								<th>Fecha ModificaciÃ³n</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${infoobj}" var="InformacionAcademicaDTO">
								<tr>
									<td>1</td>
									<td><c:out value="${ InformacionAcademicaDTO.institucion}"/></td>
									<td><c:out value="${ InformacionAcademicaDTO.programa}"/></td>
									<td><c:out value="${ InformacionAcademicaDTO.tipo}"/></td>
									<td><c:out value="${ InformacionAcademicaDTO.semestre}"/></td>
									<td><c:out value="${ InformacionAcademicaDTO.modificadoPor}"/></td>
									<td><c:out value="${ InformacionAcademicaDTO.fechaModificacion}"/></td>
									<td align="center" width="15px">
										<button id="btnEditarAreaConocimiento"
											name="btnEditarAreaConocimiento" class="btn btn-link"
											type="submit">editar</button>
									</td>
									<td align="center" width="15px">
										<button id="btnEliminarAreaConocimiento"
											name="btnEliminarAreaConocimiento" class="btn btn-link"
											type="submit">eliminar</button>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
		</div>

	</form>

</body>

</html>
