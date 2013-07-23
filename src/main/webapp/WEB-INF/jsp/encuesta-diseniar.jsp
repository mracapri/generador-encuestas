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
				<div class="span2">
					<a  href="${pageContext.request.contextPath}/resolver/encuesta/pregunta/create-form-pregunta" class="btn btn-large"  data-toggle="modal">
						<i class="icon-plus"></i>Pregunta
					</a>      
					<a class="btn btn-large" href="#">
						<i class="icon-minus"></i> pregunta
					</a>
				</div>
				<div class="span10">
			        <!--Body content-->
			        <table class="table table-hover">
			          <caption>Preguntas de la encuesta</caption>
			          <thead>
			            <tr>
			              <th>Pregunta</th>
			              <th>Tipo</th>
			              <th>Opciones</th>
			              <th>De tiempo</th>
			              <th>Obligatoria</th>
			            </tr>
			          </thead>
			          <tbody>
			          	<c:forEach var="pregunta" items="${encuestaActual.preguntas}">
				            <tr>
				              <td>${pregunta.descripcion}</td>
				              <td>${pregunta.tipoPregunta}</td>
				              <td>${pregunta.detalleOpciones}</td>
				              <td>
								<c:if test="${pregunta.esDeTiempo}">
									Si - ${pregunta.tiempo}
								</c:if>
								<c:if test="${!pregunta.esDeTiempo}">
									No
								</c:if>
				              </td>
				              <td>
								<c:if test="${pregunta.obligatorio}">
									Si
								</c:if>
								<c:if test="${!pregunta.obligatorio}">
									No
								</c:if>
				              </td>
				              <td>
				              	<a href="#">Configurar</a>
				              </td>
				            </tr>
			          	</c:forEach>
			          </tbody>
			        </table>       
			        <!--Body content-->
				</div>
			</div>
		
			<!-- Contenedor --> 
		</div>
		
	</body>
</html>