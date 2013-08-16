<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
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
	  <!-- header -->
	  <div class="container">
	
	    <!-- Contenedor -->
	    <div  class="row-fluid">
	
	        <!--Body content-->
	        <table class="table table-hover">
	          <caption>Administrador de encuestas</caption>
	          <thead>
	            <tr>
	              <th>Titulo</th>
	              <th>Descripci&oacuten</th>
	              <th>Creaci&oacuten</th>
	              <th>Limite</th>
	              <th>
					<i class="icon-tags"></i>
	              </th>
	              <th>
					Preguntas
	              </th>
	              <th>
					Configurar
	              </th>
	              <th>
					Borrar
	              </th>
	            </tr>
	          </thead>
	          <tbody>
	          	<c:forEach var="encuesta" items="${encuestas}">
		            <tr>
		              <td>${encuesta.titulo}</td>
		              <td>${encuesta.descripcion}</td>
		              <td>
						<fmt:formatDate type="both" value="${encuesta.fechaCreacion}" />
		              </td>
		              <td>
						<fmt:formatDate type="both" value="${encuesta.fechaLimiteModificacion}" />
		              </td>
		              <td>${encuesta.palabrasClave}</td>
		              <td>
		              	<a href="${pageContext.request.contextPath}/resolver/encuesta/design/${encuesta.id}">
		              		<i class="icon-list"></i>
		              		${fn:length(encuesta.preguntas)} 
		              	</a>
		              </td>
		              <td>
		              	<a href="${pageContext.request.contextPath}/resolver/encuesta/configurate/${encuesta.id}">
		              		<i class="icon-wrench"></i>
		              	</a>
		              </td>
		              <td>		              	
		              	<a href="${pageContext.request.contextPath}/resolver/encuesta/delete/${encuesta.id}">
		              		<i class="icon-trash"></i>
		              	</a>
		              </td>
		            </tr>
	          	</c:forEach>
	          </tbody>
	        </table>       
	        <!--Body content-->
	
	    </div>    
	  </div>

</body>
</html>