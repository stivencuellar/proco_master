<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>PROCO</title>
    
	<!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrapIndex.min.css" rel="stylesheet" type="text/css">

    <!-- Custom CSS-->
    <link href="resources/css/portfolioIndex.css" rel="stylesheet" type="text/css">
 
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body> 

<!-- Navigation -->

    <a id="menu-toggle" href="#" class="btn btn-dark btn-lg toggle">Inicia Sesión<i class="fa fa-bars"></i></a>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <a id="menu-close" href="#" class="btn btn-dark btn-lg pull-right toggle">X<i class="fa fa-times"></i></a>
            <li class="sidebar-brand">
                <p class="txtLogin">Inicia Sesión</p>
            </li>
            <li>
                <p class="txtLogin">Usuario</p>
            </li>
            <li>
            	<input class="textBox" type="text" name="us" >
            	
            </li>
            <li>
                <p class="txtLogin">Contraseña</p>
            </li>
            <li>
            	<input class="textBox" type="password" name="pw">
				
            </li>
            <li>
            	<a href="MisCosas" class="btn btn-dark btn-lg" >Ingresar</a>
            </li>
        </ul>
    </nav>

<!-- Header -->
<!--http://www.larepublica.co/sites/default/files/larepublica/imagenes/noticias/1/medellin0302-1000.jpg-->
    <header id="top" class="header">
        <div class="text-vertical-center">
        	<div class="contenedor">
        		<h1>PROCO</h1>
	            <h3>Proyectos Colaborativos</h3>
	            <br>
	            <!--<a href="misCosas.jsp" class="btn btn-dark btn-lg">Iniciar Sesion</a>-->
        	</div>
        </div>
    </header>

<!-- About -->
    <section id="about" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>¿Tienes un proyecto... y necesitas ayuda?</h2>
                    <p class="lead">Ingresa a PROCO, registra las actividades en las que necesitas ayuda y dejanos el resto a nosotros. <a target="_blank" href="#">Registrarme</a>.</p>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>

<!-- Services -->
    <!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->
	
	
		<section id="services" class="services bg-primary">
			<div class="container">
				
					<div class="row text-center">
	
	
						<div class="col-lg-10 col-lg-offset-1">
							<h2>Ranking</h2>
							<hr class="small">
	
							<div class="row">
								<c:forEach items="${sesionobj}" var="SesionDTO">
								<div class="col-md-3 col-sm-6">								
										<div class="service-item">
											<span class="fa-stack fa-4x"> <img class="iconRedSocial"
												src=<c:out value="${ SesionDTO.imagen}"/>>
											</span>
											<h4>
												<strong><c:out value="${ SesionDTO.titulo}" /></strong>
											</h4>
											<p>
												<c:out value="${ SesionDTO.nombre}" />
											</p>
											<p>
												<c:out value="${ SesionDTO.descripcion}" />
											</p>
										</div>
								</div>
								</c:forEach>
								
<!-- 								<div class="col-md-3 col-sm-6"> -->
<!-- 									<div class="service-item"> -->
<!-- 										<span class="fa-stack fa-4x"> <img class="iconRedSocial" -->
<%-- 											src=<c:out value="${ SesionDTO.imagen}"/>> --%>
<!-- 										</span> -->
<!-- 										<h4> -->
<!-- 											<strong>Compromiso</strong> -->
<!-- 										</h4> -->
<!-- 										<p> -->
<%-- 											<c:out value="${ SesionDTO.titulo}" /> --%>
<!-- 										</p> -->
<!-- 										<p>Destaca en la aplicaciÃ³n por ser muy comprometida con -->
<!-- 											las entregas</p> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								<div class="col-md-3 col-sm-6"> -->
<!-- 									<div class="service-item"> -->
<!-- 										<span class="fa-stack fa-4x"> <img class="iconRedSocial" -->
<%-- 											src=<c:out value="${ SesionDTO.imagen}"/>> --%>
<!-- 										</span> -->
<!-- 										<h4> -->
<!-- 											<strong>Orden</strong> -->
<!-- 										</h4> -->
<!-- 										<p> -->
<%-- 											<c:out value="${ SesionDTO.titulo}" /> --%>
<!-- 										</p> -->
<!-- 										<p>Destaca en la aplicaciÃ³n por ser muy ordenado en las -->
<!-- 											entregas</p> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 								<div class="col-md-3 col-sm-6"> -->
<!-- 									<div class="service-item"> -->
<!-- 										<span class="fa-stack fa-4x"> <img class="iconRedSocial" -->
<%-- 											src=<c:out value="${ SesionDTO.imagen}"/>> --%>
<!-- 										</span> -->
<!-- 										<h4> -->
<!-- 											<strong>Liderazgo</strong> -->
<!-- 										</h4> -->
<!-- 										<p> -->
<%-- 											<c:out value="${ SesionDTO.titulo}" /> --%>
<!-- 										</p> -->
<!-- 										<p>Destaca en la aplicaciÃ³n por ser muy buen lider en los -->
<!-- 											proyectos</p> -->
<!-- 									</div> -->
<!-- 								</div> -->
	
							</div>
	
							<!-- /.row (nested) -->
						</div>
	
	
						<!-- /.col-lg-10 -->
					</div>
				
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</section>
	
	<!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <h4><strong>PROCO</strong>
                    </h4>
                    <p>MakSoft S.A<br>Universidad de MedellÃ­n</p>
                    <ul class="list-unstyled">
                        <li><i class="fa fa-phone fa-fw"></i> 456-7890</li>
                        <li><i class="fa fa-envelope-o fa-fw"></i>  <a href="#">info@proco.com</a>
                        </li>
                    </ul>
                    <br>
                    <ul class="list-inline">
                        <li>
                            <img class="iconRedSocial" src="resources/img/facebook_circle_color.png">
                        </li>
                        <li>
                            <img class="iconRedSocial" src="resources/img/linkedin_circle.png">
                        </li>
                        <li>
                            <img class="iconRedSocial" src="resources/img/twitter_circle_color.png">
                        </li>
                    </ul>
                    <hr class="small">
                    <p class="text-muted">Copyright &copy; Your Website 2015</p>
                </div>
            </div>
        </div>
    </footer>



<!-- Custom Theme JavaScript -->
    <script>
    // Closes the sidebar menu
    $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Opens the sidebar menu
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Scrolls to the selected menu item on the page
    $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {

                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    });
    </script>
</body>

</html>
