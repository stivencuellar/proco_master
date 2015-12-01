<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>PROCO - Mis Cosas</title>

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

	<!-- Page Content -->
	<div class="container">

		<!-- Page Header -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Mis Cosas</h1>
			</div>
		</div>
		<!-- /.row -->

		<!-- Actividades -->
		<div class="row">

			<div class="col-lg-12">
				<h1 class="page-header">
					<small>Actividades Pendientes</small>
				</h1>
			</div>
		</div>


		<div class="row">
			<c:forEach items="${actividadesobj}" var="ActividadesDTO">
				<div class="col-md-4 portfolio-item">
					<a href="#"> <img class="img-responsive"
						src=<c:out value="${ActividadesDTO.imagen}"/> alt="">
					</a>
					<h3>
					
						<a href="enConstruccion.jsp">${ActividadesDTO.titulo}</a>
					</h3>
					<p>
						<b>Descripcion: </b>${ActividadesDTO.descripcion}
					</p>
				</div>
			</c:forEach>
		</div>
		<!-- /.row -->

		<!-- Projects Row -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">
					<small>Mis Proyectos</small>
				</h1>
			</div>
		</div>

		<div class="row">

			<c:forEach items="${proyectosobj}" var="ProyectosDTO">
				<div class="col-md-4 portfolio-item">
					<a href=""> <img class="img-responsive" src=${ProyectosDTO.imagen} alt="">
					</a>
					<h3>
						<a href="">${ProyectosDTO.titulo}</a>
					</h3>
					<p>
						${ProyectosDTO.descripcion}
					</p>
				</div>
			</c:forEach>

		</div>
		<!-- jQuery -->
		<script src="resources/js/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="resources/js/bootstrap.min.js"></script>
</body>

</html>
