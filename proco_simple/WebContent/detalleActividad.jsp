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

<title>PROCO</title>

 <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrapDA.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/blog-postDA.css" rel="stylesheet">
    
    <!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/css/3-col-portfolio.css" rel="stylesheet">
    
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
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
							<li><a href="Configuracion">Configuración</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
<!-- Navigation -->
	
	<!-- Page Content -->
    <div class="container">

        <div class="row">

            <!-- Blog Post Content Column -->
            <div class="col-lg-8">

                <!-- Blog Post -->

                <!-- Title -->
                <h1>Titulo Actividad</h1>


                <hr>

                <!-- Date/Time -->
                <p><span class="glyphicon glyphicon-time"></span> Fecha de Registro 24, 2013 at 9:00 PM</p>

                <hr>

                <!-- Preview Image -->
                <img class="img-responsive" src="http://placehold.it/640x423" alt="">

                <hr>

                <!-- Post Content -->
                <p class="lead">Descripcion:</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut, tenetur natus doloremque laborum quos iste ipsum rerum obcaecati impedit odit illo dolorum ab tempora nihil dicta earum fugiat. Temporibus, voluptatibus.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eos, doloribus, dolorem iusto blanditiis unde eius illum consequuntur neque dicta incidunt ullam ea hic porro optio ratione repellat perspiciatis. Enim, iure!</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Error, nostrum, aliquid, animi, ut quas placeat totam sunt tempora commodi nihil ullam alias modi dicta saepe minima ab quo voluptatem obcaecati?</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Harum, dolor quis. Sunt, ut, explicabo, aliquam tenetur ratione tempore quidem voluptates cupiditate voluptas illo saepe quaerat numquam recusandae? Qui, necessitatibus, est!</p>

                <hr>

                <!-- Blog Comments -->

                <!-- Comments Form -->
                <div class="well">
                    <h4>Agregar Avance:</h4>
                    <form role="form">
                        <div class="form-group">
                            <textarea class="form-control" rows="3"></textarea>
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                        <button type="submit" class="btn btn-primary">Adjuntar</button>
                    </form>
                </div>

                <hr>

                <!-- Posted Comments -->

                <!-- Comment -->
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Entrega 3
                            <small>Noviembre 1, 2015 - 9:30 PM</small>
                        </h4>
                        Detalle de la entrega 3
                    </div>
                </div>

				<!-- Comment -->
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Entrega 2
                            <small>Noviembre 1, 2015 - 2:30 PM</small>
                        </h4>
                        Detalle de la entrega 2
                    </div>
                </div>
                
                <!-- Comment -->
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="http://placehold.it/64x64" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Entrega 1
                            <small>Octubre 25, 2015 - 11:30 PM</small>
                        </h4>
                        Detalle de la entrega 1
                    </div>
                </div>
                

            </div>

            <!-- Blog Sidebar Widgets Column -->
            <div class="col-md-4">

                <!-- Blog Search Well -->
                <div class="well">
                    <h4>Postulantes</h4>
                     <ul> 
                     	<li>Nombre Apellido 1</li> 
                     	<li>Nombre Apellido 2</li> 
                     </ul>
                    <button type="submit" class="btn btn-primary">Postulate!!</button>
                    <!-- /.input-group -->
                </div>

                <!-- Side Widget Well -->
                <div class="well">
                    <h4>Proyecto</h4>
                    <p>Nombre del proyecto al que pertenece</p>
                    <h4>PP Requeridos</h4>
                    <p>PP Necesarios para postularse a la actividad</p>
                    <h4>PP Recompenza</h4>
                    <p>PP de ganancia por realizar correctamente la actividad</p>
                </div>

            </div>

        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->
    
    </body>

</html>
    