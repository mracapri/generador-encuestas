<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
  
  </head>
<body>
  <header>
      <h2>Generador de encuestas</h2>
      
  </header>
  <!-- header -->
  <div id= "contenedor-principal" class="container">
    <div class="navbar navbar-inverse">
        <div class="navbar-inner">
          <a class="brand" href="crear-encuesta.html">Crear encuesta</a>
            <ul class="nav">
                <li class="active"><a href="mis-encuestas.html">Mis encuestas</a></li>
                <li><a href="#">Configuracion</a></li>
      
            </ul>
        </div>
    </div>

   
    <div id = "busquedas-rapidas" class="row-fluid">
    	<!--Body content-->    
        <form:form action="save-encuesta" method="post" class="form-horizontal" modelAttribute="new-encuesta" name="encuesta">
          
            <blockquote>
                <p>T&iacutetulo de la encuesta: </p>
			</blockquote>               
            <div class= "alinear-izquierda" class="controls">              
              	<form:input path="titulo" class="span7" placeholder="Text input"/>
				<spring:hasBindErrors name="new-encuesta">
					<form:errors path="titulo" />
				</spring:hasBindErrors>
            </div>
          
          
            <blockquote>
                <p>Descripci&oacuten de la encuesta</p>
                <small>peque&ntildea introducci&oacuten</small>
            </blockquote>
            <div class= "alinear-izquierda" class="controls">
				<form:textarea class="span7" rows="3" path="descripcion"/>
				<spring:hasBindErrors name="new-encuesta">
					<form:errors path="descripcion" />
				</spring:hasBindErrors>
            </div>
          
          
            <div class="controls"></br>      
              <button type="submit" class="btn">Crear</button>
            </div>
                  
        </form:form>        
    	<!--Body content-->  
    </div>
  </div>

  

  <footer>
    <p>SANCHEZ lEVARIO Esmeralda</p>
  </footer>
</body>
</html>