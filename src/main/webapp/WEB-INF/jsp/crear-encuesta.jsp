<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web-resources/css/estilos-home.css"/>
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">     
    <script src="${pageContext.request.contextPath}/web-resources/js/jquery-1.8.3.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
  
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
        <form class="form-horizontal">
          
            <blockquote>
                <p>Titulo de la encuesta: </p>
              </blockquote>               
            <div class= "alinear-izquierda" class="controls">              
              <input class="span7" type="text" placeholder="Text input">
            </div>
          
          
            <blockquote>
                <p>Descripcion de la encuesta</p>
                <small>pequeña introduccion</small>
            </blockquote>    
            <div class= "alinear-izquierda" class="controls">              
              <textarea class="span7" rows="3"></textarea>
            </div>
          
          
            <div class="controls"></br>      
              <button type="submit" class="btn">Sign in</button>
            </div>
                  
        </form>        
    <!--Body content-->  
    </div>
  </div>

  

  <footer>
    <p>SANCHEZ lEVARIO Esmeralda</p>
  </footer>
</body>
</html>