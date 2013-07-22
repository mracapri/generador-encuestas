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

  <div class="container">
    

    <!-- Contenedor -->
    <div class="row-fluid">
                <!--Body content-->
				<form:form id="formRequestSaveQuestion" action="save-question" method="post" class="form-horizontal" modelAttribute="requestSaveQuestion">
					<p>
                    	<strong>Pregunta </strong>
                  	</p>

					<strong>Texto de la pregunta:</strong>
					<form:input id="textoPregunta" path="textoPregunta" class="span14" type="text" ng-model="textoPregunta" placeholder="texto pregunta" required="" />             
					<p>
						<strong>Tipo de pregunta:</strong>
					</p>    

					<form:select path="tipoSeleccionado" ng-model="tipoSeleccionado" class="span7" ng-change="tipoPreguntaSelectChange()">
						<form:options items="${tiposPreguntas}" itemValue="clave" itemLabel="descripcion" />
					</form:select>
					<p>
						<strong>Opciones de respuesta </strong>
					</p>
					
                    <p>
						<strong>Opciones de respuesta: </strong>
						<small> Ingresar cada opcion separada por comas. Ejemplo:<b>avion; auto; camioneta</b></small>
                    </p>

					<form:textarea path="opciones" class="span14" rows="3" ng-disabled="esPreguntaAbierta" ng-model="opciones" ng-list=";" required="required" />
					Opciones: {{opciones}}
					
					<label class="checkbox">
						<form:checkbox path="esPreguntaObligatoria" ng-model="esPreguntaObligatoria"/>
						Pregunta de respuesta obligatoria(opcional)
						<small>
							Muestra un mensaje de error personalizado
							cuando los encuestados intenten omitir esta pregunta.
						</small>
                    </label>

					<label class="checkbox">
						<form:checkbox path="esPreguntaDeTiempo" ng-model="esPreguntaDeTiempo"/>Pregunta de tiempo(opcional)
						<small> Permite dar a la pregunta cierto tiempo para ser contestada</small>
					</label>
					<div ng-show="esPreguntaDeTiempo">
						<small>
							Tiempo en minutos <input type="number" ng-model="tiempo" min="0" max="99"/> minutos
						</small>
					</div>
					<button type="button" id="btn-enviar-pregunta" class="btn" ng-click="validarPregunta()">Crear</button>
                </form:form>
                <p ng-show="mostrarAlerta">{{alerta}}</p>    
		<!-- Contenedor --> 
		</div>
	</div>
</body>
</html>