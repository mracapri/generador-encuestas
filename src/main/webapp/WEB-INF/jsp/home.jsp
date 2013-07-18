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

  <!-- header -->
  <div class="container">

    <div id = "busquedas-rapidas" class="row-fluid">
    	<!--Body content-->
        <form class="form-horizontal">
          <blockquote>
                <p>Busquedas r&aacutepidas</p>
                <small>Por palabras clave.</small>
          </blockquote>          
          <form class="form-search">
            <input type="text" class="input-medium search-query">
            <button type="submit" class="btn">Buscar</button>
          </form>
          
          <blockquote>                
            <small>Por nombre de la encuesta.</small>
          </blockquote> 
          <form class="form-search">
            <input type="text" class="input-medium search-query">
            <button type="submit" class="btn">Buscar</button>
          </form>     
        </form>        
    	<!--Body content-->
    </div> 

  </div>

</body>
</html>