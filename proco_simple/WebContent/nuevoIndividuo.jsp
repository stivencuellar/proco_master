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

	<form class="form-horizontal">
		<fieldset>

			<!-- Form Name -->
			<legend>Nuevo Individuo</legend>
			<table>
				<tr>
					<td>
						<label class="col-md-12 control-label" for="txtPrimerNombre" >Primer Nombre</label>
					</td>
					<td>
						<div class="col-md-12">
							<input id="txtPrimerNombre" name="txtPrimerNombre" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>

					<td><label class="col-md-12 control-label"
						for="txtSegundoNombre">Segundo Nombre</label></td>
					<td>
						<div class="col-md-12">
							<input id="txtSegundoNombre" name="txtSegundoNombre" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>
				</tr>
				
				<tr>
					<td> <br></td>
				</tr>
				
				<tr>
					<td>
						<label class="col-md-12 control-label" for="txtPrimerApellido" >Primer Apellido</label>
					</td>
					<td>
						<div class="col-md-12">
							<input id="txtPrimerApellido" name="txtPrimerApellido" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>
					
					<td><label class="col-md-12 control-label"
						for="txtSegundoApellido">Segundo Apellido</label></td>
					<td>
						<div class="col-md-12">
							<input id="txtSegundoApellido" name="txtSegundoApellido" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>
				</tr>
				
				<tr>
					<td><br></td>
				</tr>

				<tr>
					<td>
						<label class="col-md-12 control-label" for="txtPrimerApellido" >Primer Apellido</label>
					</td>
					<td>
						<div class="col-md-12">
							<input id="txtPrimerApellido" name="txtPrimerApellido" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>
					
					<td><label class="col-md-12 control-label"
						for="txtSegundoApellido">Segundo Apellido</label></td>
					<td>
						<div class="col-md-12">
							<input id="txtSegundoApellido" name="txtSegundoApellido" type="text"
								placeholder="" class="form-control input-md">
						</div>
					</td>
				</tr>
			</table>
			<!-- Text input-->
			

			<br>

			<!-- Button (Double) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="btnAceptar"></label>
				<div class="col-md-8">
					<button id="btnAceptar" name="btnAceptar" class="btn btn-success">Aceptar</button>
					<button id="btnCancelar" name="btnCancelar" class="btn btn-danger" type="button" onclick="history.back()">Cancelar</button>
				</div>
			</div>

		</fieldset>

		<div class="form-group">
			<label class="control-label col-xs-3">Email:</label>
			<div class="col-xs-9">
				<input type="email" class="form-control" id="inputEmail"
					placeholder="Email">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Password:</label>
			<div class="col-xs-9">
				<input type="password" class="form-control" id="inputPassword"
					placeholder="Password">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Confirmar Password:</label>
			<div class="col-xs-9">
				<input type="password" class="form-control"
					placeholder="Confirmar Password">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Nombre:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" placeholder="Nombre">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Apellido:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" placeholder="Apellido">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Telefono:</label>
			<div class="col-xs-9">
				<input type="tel" class="form-control" placeholder="Telefono">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">F. Nacimiento:</label>
			<div class="col-xs-3">
				<select class="form-control">
					<option>Dia</option>
				</select>
			</div>
			<div class="col-xs-3">
				<select class="form-control">
					<option>Mes</option>
				</select>
			</div>
			<div class="col-xs-3">
				<select class="form-control">
					<option>Año</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Dirección:</label>
			<div class="col-xs-9">
				<textarea rows="3" class="form-control" placeholder="Dirección"></textarea>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3">Genero:</label>
			<div class="col-xs-2">
				<label class="radio-inline"> <input type="radio"
					name="genderRadios" value="male"> Maculino
				</label>
			</div>
			<div class="col-xs-2">
				<label class="radio-inline"> <input type="radio"
					name="genderRadios" value="female"> Femenino
				</label>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-9">
				<label class="checkbox-inline"> <input type="checkbox"
					value="news"> Enviar noticias.
				</label>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-9">
				<label class="checkbox-inline"> <input type="checkbox"
					value="agree"> Accepto <a href="#">Terminos y
						condiciones</a>.
				</label>
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-9">
				<input type="submit" class="btn btn-primary" value="Enviar">
				<input type="reset" class="btn btn-default" value="Limpiar">
			</div>
		</div>






	</form>


</body>

</html>
