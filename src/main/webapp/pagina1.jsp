<html>
	<head>
		<style>
			.etiqueta{
				font-weight: bold;
				color: gray;
			}
			.lista-preferencias{
				list-style: none outside none;
			}
		</style>
	</head>
	
	<body>
		<h1>Introduce tus datos</h1>
		<form action="servicio-registra-algo" method="post">
			<p class="etiqueta">Nombre:</p>
			<input type="text" name="nombre" />

			<p class="etiqueta">Edad:</p>
			<input type="text" name="edad" />
			
			<p class="etiqueta">Sexo:</p>
			Masculino<input type="radio" name="sexo" value="masculino" />
			Femenino<input type="radio" name="sexo" value="femenino" />

			<p class="etiqueta">Preferencias</p>
			<ul class="lista-preferencias">
				<li>
					<input type="checkbox" name="preferencias" value="deportes"/>Deportes
				</li>
				<li>
					<input type="checkbox" name="preferencias" value="video_juegos"/>Video Juegos
				</li>
				<li>
					<input type="checkbox" name="preferencias" value="musica"/>Musica
				</li>
			</ul>

			<input type="submit" value="Enviar datos" />
			
			<p>
				<b>${saludo}</b>
			</p>
		</form>
	</body>
</html>
