<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html ng-app>
	<head>
		<title>Bootstrap 101 Template</title>
		<meta charset="utf-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/web-resources/css/estilos-home.css"/>
		<link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
		<link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">     
		<script src="${pageContext.request.contextPath}/web-resources/js/jquery-1.8.3.js"></script>
		<script src="${pageContext.request.contextPath}/web-resources/bootstrap/js/bootstrap.min.js"></script>	
		<script src="${pageContext.request.contextPath}/web-resources/angular/angular.js"></script>
		<script src="${pageContext.request.contextPath}/web-resources/js/app.js"></script>
		<script src="${pageContext.request.contextPath}/resolver/js/global"></script>
	</head>
	<body ng-controller="CrearEncuestaController">
	
		<div class="container">
			<div class="row-fluid">
				<!--Body content-->
				<form:form action="save-encuesta" method="post" class="form-horizontal" modelAttribute="encuestaActual" name="encuesta">
				
					<p>T&iacutetulo de la encuesta: </p>             
					<form:input path="titulo" class="span7" placeholder="Text input" ng-model="titulo"/>
					<spring:hasBindErrors name="new-encuesta">
						<form:errors path="titulo" />
					</spring:hasBindErrors>
					
					
					<p>
						Descripci&oacuten de la encuesta
						<small>peque&ntildea introducci&oacuten</small>
					</p>
					<form:textarea class="span7" rows="3" path="descripcion" ng-model="descripcion"/>
					<spring:hasBindErrors name="new-encuesta">
						<form:errors path="descripcion" />
					</spring:hasBindErrors>
					
					<button type="submit" class="btn">Crear</button>
				      
				</form:form>        
				<!--Body content-->  
			</div>
		</div>
	
	</body>
</html>