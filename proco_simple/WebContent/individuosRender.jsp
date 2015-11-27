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

	<form class="form-horizontal" action="nuevoIndividuo.jsp">
		<fieldset>

			<!-- Form Name -->
			<legend>Individuos</legend>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="btnNuevoIndividuo"></label>
				<div class="col-md-4">
					<button id="btnNuevoIndividuo"
						name="btnNuevoIndividuo" class="btn btn-warning" type="submit" >Agregar Individuo</button>
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
								<th>Primer Nombre</th>
								<th>Segundo Nombre</th>
								<th>Primer Apellido</th>
								<th>Segundo Apellido</th>
								<th>Numero de Documento</th>
								<th>Email</th>
								<th></th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${individuosobj}" var="IndividuosDTO">
								<tr>
									<td>1</td>
									<td name="prueba"><c:out value="${ IndividuosDTO.primerNombre}"/></td>
									<td><c:out value="${ IndividuosDTO.segundoNombre}"/></td>
									<td><c:out value="${ IndividuosDTO.primerApellido}"/></td>
									<td><c:out value="${ IndividuosDTO.segundoApellido}"/></td>
									<td><c:out value="${ IndividuosDTO.numeroDocumento}"/></td>
									<td><c:out value="${ IndividuosDTO.email}"/></td>
									<td align="center" width="15px">
										<button id="btnEditarAreaConocimiento" name="btnEditarAreaConocimiento" class="btn btn-link" type="submit">ver</button>
									</td>
									<td align="center" width="15px">
										<button id="btnEditarAreaConocimiento" name="btnEditarAreaConocimiento" class="btn btn-link" type="submit">editar</button>
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
