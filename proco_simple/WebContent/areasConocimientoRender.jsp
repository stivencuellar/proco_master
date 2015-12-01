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

<title>PROCO - Areas de Conocimiento</title>

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
					<li><a href="Actividades">Actividades</a></li>
					<li><a href="Proyectos">Proyectos</a></li>
					<li><a href="MisCosas">Mis Cosas</a></li>
				</ul>
				<ul class="dropdown-menu">
							<li><a href="enConstruccion.jsp">Mi Perfil</a></li>
							<li><a href="Area Conocimiento">Area Conocimiento</a></li>
							<li><a href="Configuracion">Configuracion</a></li>
							<li><a href="Conocimiento">Conocimiento</a></li>
							<li><a href="Evidencia">Evidencia</a></li>
							<li><a href="Funcionalidad">Funcionalidad</a></li>
							<li><a href="Individuo">Individuo</a></li>
							<li><a href="Informacion Academica">Informacion	Academica</a></li>
							<li><a href="Objetivo ">Objetivo </a></li>
							<li><a href="Perfil">Perfil</a></li>
							<li><a href="Permiso">Permiso</a></li>
							<li><a href="Postulante">Postulante</a></li>
							<li><a href="Requerimiento">Requerimiento</a></li>
							<li><a href="Sesion">Sesion</a></li>
							<li><a href="Tarea">Tarea</a></li>
							<li><a href="Versionamiento">Versionamiento</a></li>
							<li><a href="Vinculo">Vinculo</a></li>
							<li><a href="Configuracion">Configuración</a></li>
						</ul>
			</div>
		</div>
	</nav>
<!-- Navigation -->

	<form class="form-horizontal" action="nuevaAreaConocimiento.jsp">
		<fieldset>
			<div class="container">

				<!-- Titulo Actividades -->
				<div class="row">

					<div class="col-lg-12">
						<h1 class="page-header">
							<small>Areas Conocimiento</small>
						</h1>
					</div>
				</div>
			</div>
			<!-- Button -->
			<div class="container">


				<div align="left" class="col-md-1">
					<button id="btnNuevaAreaConocimiento"
						name="btnNuevaAreaConocimiento" class="btn btn-warning"
						type="submit">Agregar Area de Conocimiento</button>
				</div>
			</div>

		</fieldset>

		<div class="container">
			<div class="row">
				<div class="table-responsive">
					<table class="table table-condensed table-hover">
						<thead>
							<tr>
								<th>Nombre</th>
								<th>Descripcion</th>
								<th>Modificado Por</th>
								<th>Fecha Modificacion</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${areaConocimientoObj}" var="AreaConocimientoDTO">
								<tr>
									<td><c:out value="${ AreaConocimientoDTO.nombreAreaConocimiento}"/></td>
									<td><c:out value="${ AreaConocimientoDTO.descAreaConocimiento}"/></td>
									<td><c:out value="${ AreaConocimientoDTO.modificadoPor}"/></td>
									<td><c:out value="${ AreaConocimientoDTO.fechaModificacion}"/></td>
									<td align="center" width="15px">
										<a href="enConstruccion.jsp"> <img class="iconRender" src="resources/img/Edita.png"/> </a>
									</td>
									<td align="center" width="15px">
										<a href="enConstruccion.jsp"> <img class="iconRender" src="resources/img/Eliminar.png"/> </a>
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
