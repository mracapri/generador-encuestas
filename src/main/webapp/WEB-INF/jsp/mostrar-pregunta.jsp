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
	
		<form id="form-pregunta" method="post" action="${pageContext.request.contextPath}/resolver/encuesta/desplegar/show/${indexPregunta+1}">
			<div class="container">
				<div class="row-fluid">
					<div class="span12">
						<p>
							<b>${pregunta.descripcion}</b>
						</p>
						<p>
							<c:if test="${pregunta.obligatorio == true}">
								<div class="label label-info">Respuesta obligatoria</div>
							</c:if>
						</p>
					</div>
				</div>
				
				<div class="row-fluid">
					<div class="span12">
						<c:if test="${pregunta.class.name == 'edu.utvm.gencuesta.domain.PreguntaAbierta'}">
							<input type="text" name="respuesta"/>
						</c:if>
						<c:if test="${pregunta.class.name == 'edu.utvm.gencuesta.domain.PreguntaOpcion'}">
							<c:forEach items="${pregunta.opciones}" var="opcion">
								<p>
									<c:choose>
									    <c:when test="${pregunta.obligatorio == true}">
											<input type="radio" value="${opcion}" name="respuesta" required/> ${opcion}
									    </c:when>
									    <c:when test="${pregunta.obligatorio == false}">
											<input type="radio" value="${opcion}" name="respuesta"/> ${opcion}
									    </c:when>
									</c:choose>
								</p>
							</c:forEach>
						</c:if>
						<c:if test="${pregunta.class.name == 'edu.utvm.gencuesta.domain.PreguntaOpcionMultiple'}">
							<c:forEach items="${pregunta.opciones}" var="opcion">
								<p>
									<input type="checkbox" value="${opcion}" name="respuesta"/> ${opcion}
								</p>
							</c:forEach>
						</c:if>					
					</div>
				</div>
				
				<button class="btn-info" type="submit">Siguiente</button>
			</div>
		</form>
	</body>
</html>