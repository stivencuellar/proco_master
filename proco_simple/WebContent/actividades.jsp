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

    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Actividades
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Projects Row -->
        <div class="row">
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img align="middle" class="img-responsive" src="resources/img/Programacion.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Hacer parte grafica de aplicación</a>
                </h3>
                <p><b>Proyecto: </b>FILDO (Filtro de Ideas)</p>
                <p><b>Descripción: </b>Se solicita persona con conocimiento en HTML para realizar la parte grafica de la aplicación Web</p>
                <p><b>PP Requeridos: </b>20PP</p>
                <p><b>PP Recompenza: </b>30PP</p>
            </div>
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Pintura.jpg" alt="Já Que te digo">
                </a>
                <h3>
                    <a href="#">Combinaciones de color</a>
                </h3>
                <p><b>Proyecto: </b>FILDO (Filtro de Ideas)</p>
                <p><b>Descripción: </b>Necesitamos una persona creativa, con ideas locas que nos ayude con la combinacion de colores del proyecto</p>
                <p><b>PP Requeridos: </b>15PP</p>
                <p><b>PP Recompenza: </b>50PP</p>
            </div>
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Finanzas.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Orden Financiero</a>
                </h3>
                <p><b>Proyecto: </b>Casa de Acero</p>
                <p><b>Descripción: </b>Nuestro proyecto es nuevo y necesitamos una persona confiable y honesta que nos ayude con las deciciones financieras</p>
                <p><b>PP Requeridos: </b>120PP</p>
                <p><b>PP Recompenza: </b>300PP</p>
            </div>
        </div>
        <!-- /.row -->

        <!-- Projects Row -->
        <div class="row">
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Ecologia.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Recolección de evidencias</a>
                </h3>
                <p><b>Proyecto: </b>Vida Salvaje</p>
                <p><b>Descripción: </b>Actualmente nuestro proyecto necesita evidencias de plantas carnivoras en antioquia, para lo cual necesitamos una persona que este dispuesta a buscarlas</p>
                <p><b>PP Requeridos: </b>10PP</p>
                <p><b>PP Recompenza: </b>85PP</p>
            </div>
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Decoracion.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Decoración de Interiores</a>
                </h3>
                <p><b>Proyecto: </b>Casas Provida</p>
                <p><b>Descripción: </b>Se requiere de persona con conocimientos en decoración</p>
                <p><b>PP Requeridos: </b>15PP</p>
                <p><b>PP Recompenza: </b>90PP</p>
            </div>
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/ideas.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Lluvia de ideas</a>
                </h3>
                <p><b>Proyecto: </b>Por definir</p>
                <p><b>PP Requeridos: </b>5PP</p>
                <p><b>PP Recompenza: </b>15PP</p>
            </div>
        </div>

        <!-- Projects Row -->
        <div class="row">
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Fotografia.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Fotografias</a>
                </h3>
                <p><b>Proyecto: </b>Vida Salvaje</p>
                <p><b>Descripción: </b>Se necesitan fotos para la presentacion del proyecto</p>
                <p><b>PP Requeridos: </b>12PP</p>
                <p><b>PP Recompenza: </b>76PP</p>
            </div>
            <div class="col-md-4 portfolio-item">
                <a href="#">
                    <img class="img-responsive" src="resources/img/Derecho.jpg" alt="">
                </a>
                <h3>
                    <a href="#">Vacios legales</a>
                </h3>
                <p><b>Proyecto: </b>FILDO (Filtro de Ideas)</p>
                <p><b>Descripción: </b>Se requiere de un estudiante de Derecho preferiblemente de 4to Semestre que nos acompañe y nos colabore con los asuntos legales de nuestro proyecto</p>
                <p><b>PP Requeridos: </b>10PP</p>
                <p><b>PP Recompenza: </b>85PP</p>
            </div>
        </div>
        <!-- /.row -->

        <hr>

        <!-- Pagination -->
        <div class="row text-center">
            <div class="col-lg-12">
                <ul class="pagination">
                    <li>
                        <a href="#">&laquo;</a>
                    </li>
                    <li class="active">
                        <a href="#">1</a>
                    </li>
                    <li>
                        <a href="#">2</a>
                    </li>
                    <li>
                        <a href="#">3</a>
                    </li>
                    <li>
                        <a href="#">4</a>
                    </li>
                    <li>
                        <a href="#">5</a>
                    </li>
                    <li>
                        <a href="#">&raquo;</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <!-- /.row -->

</div>
    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>

</html>
