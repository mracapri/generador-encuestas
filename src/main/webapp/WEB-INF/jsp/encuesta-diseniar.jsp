<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html ng-app>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">     
    <script src="${pageContext.request.contextPath}/web-resources/js/jquery-1.8.3.js"></script>
    <script src="${pageContext.request.contextPath}/web-resources/bootstrap/js/bootstrap.min.js"></script>	
  	<script src="${pageContext.request.contextPath}/web-resources/angular/angular.js"></script>
  	<script src="${pageContext.request.contextPath}/web-resources/js/app.js"></script>
  	<script src="${pageContext.request.contextPath}/resolver/js/global"></script>
  </head>
<body ng-controller="EncuestaDiseniarController">
  <header>
      <h2>Generador de encuestas</h2>
      
  </header>
  <!-- header -->
  <div id= "contenedor-principal" class="container">
    
    <div class="navbar navbar-inverse">
        <div class="navbar-inner">
          <a class="brand" href="crear-encuesta.html">Crear encuesta</a>
            <ul class="nav">
                <li class="active">
                	<a href="#">Mis encuestas</a>
                </li>
                <li>
                	<a href="#">Configuracion</a>
                </li>      
            </ul>
        </div>
    </div>

    <!-- Contenedor -->
    <div class="row-fluid">
      <!-- Contenedor fila1 arriva -->
      <div id = "contenedor-fila1-arriva" class="span4">
        <p>        
        	 ${encuesta.titulo}
        </p>
        <!-- Contenedor fila1 abajo -->
        <div id = "contenedor-fila1-abajo" class="row-fluid">
          <p>${encuesta.descripcion}</p>
          <!-- Button to trigger modal -->
          <a href="#myModal" role="button" class="btn btn-large"  data-toggle="modal">
          	<i class="icon-plus"></i>Pregunta
          </a>            	
          <a class="btn btn-large" href="#"><i class="icon-minus"></i> pregunta</a>
          <a href="${pageContext.request.contextPath}/resolver/encuesta/design">Refrescar</a>
			<!-- Modal -->
            <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby=" myModalLabel" aria-hidden="true">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>                
                <h3 id="myModalLabel">Generador de encuestas </h3>
              </div>

              <div class="modal-body">
                            
                <!--Body content-->
				<form class="form-horizontal">
					<p class="encabezados">
                    	<strong>Pregunta </strong>
                  	</p>
                  	<div class="contenedor-pregunta">                    
                    	<p>
                      		<strong>Texto de la pregunta:</strong>
                    		<div class= "alinear-izquierda" class="controls">              
                    	</p>               
                      		<input class="span14" type="text" ng-model="textoPregunta" placeholder="Text input" required>                      		
                    	</div>                  
	                    <p>
							<strong>Tipo de pregunta:</strong>
	                    </p>    
	                    <div  class= "alinear-izquierda" class="controls">
							<select ng-model="tipoSeleccionado" class="span7" 
								ng-change="tipoPreguntaSelectChange()">
								<c:forEach var="tipoPregunta" items="${tiposPreguntas}">
									<option value="${tipoPregunta.clave}">${tipoPregunta.descripcion}</option>
								</c:forEach>
							 </select>
	                    </div> 
                  	</div>
					<p class="encabezados">
						<strong>Opciones de respuesta </strong>
					</p>
					
					<div class="contenedor-pregunta">                    
	                    <p>
							<strong>Opciones de respuesta: </strong>
							<small> Ingresar cada opcion separada por comas. Ejemplo:<b>avion, auto, camioneta</b></small>
	                    </p>
	                    
						<textarea class="span14" rows="1" ng-disabled="esPreguntaAbierta" ng-model="opciones" ng-list required>
						</textarea>
						{{opciones}}
						<label class="checkbox">
							<input type="checkbox" ng-model="esPreguntaObligatoria"/>
							Pregunta de respuesta obligatoria(opcional)
							<small>
								Muestra un mensaje de error personalizado
								cuando los encuestados intenten omitir esta pregunta.
							</small>
	                    </label>
						<label class="checkbox">
							<input type="checkbox" ng-model="esPreguntaDeTiempo"/>Pregunta de tiempo(opcional)
							<small> Permite dar a la pregunta cierto tiempo para ser contestada</small>
						</label>
						<div ng-show="esPreguntaDeTiempo">
							<small>
								Tiempo en minutos <input type="number" ng-model="tiempo" min="0" max="99"/> minutos
							</small>
						</div>
                  	</div>

                </form>        
                <!--Body content-->                
              </div>
              <div class="modal-footer">
                <!-- hacer pregunta -->
                <span class="label label-important" ng-show="mostrarAlerta">{{alerta}}</span>
                <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                <button class="btn btn-primary"  ng-click="guardarPregunta()">Save changes</button>                
              </div>
            </div>
          	<!-- Modal -->
          
        </div>
      </div>
      <!-- Contenedor fila2 centro -->
      <div class="span8">
      	<!--  
		<h6>estoy grande</h6>
      	-->
      </div>
    </div>
    <!-- Contenedor --> 
  </div>

  <footer>
    <p>SANCHEZ lEVARIO Esmeralda</p>
  </footer>
</body>
</html>