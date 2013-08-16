<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	<body>
	
		<div class="container">
			<div class="row-fluid">
				<div class="span12">
					${pregunta.descripcion}
					${pregunta.getClass().name}
				</div>				
			</div>
			<c:if test="${indexPregunta > 0}">
				<a class="btn" href="${pageContext.request.contextPath}/resolver/encuesta/desplegar/show/${indexPregunta-1}">Atras</a>
			</c:if>
			
			<c:if test="${indexPregunta < (fn:length(encuesta.preguntas) - 1)}">
				<a class="btn" href="${pageContext.request.contextPath}/resolver/encuesta/desplegar/show/${indexPregunta+1}">Adelante</a>
			</c:if>
			
			<a class="btn" href="#">Guardar</a>
		</div>
	
	</body>
</html>