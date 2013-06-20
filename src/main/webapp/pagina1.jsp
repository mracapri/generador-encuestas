<%@ page import="edu.utvm.clases.OlaKAse" %>
<html>
	<head>
	</head>
	
	<body>
		<h1>Ola soy pagina1</h1>
		
		<%
			out.write("hola");
			System.out.println("ola k ace!!");
			out.write("<h3>taraaan!!</h3>");
			OlaKAse ola = new OlaKAse();
			out.write("<b>" + ola.salude() + "</b>");
		%>

		<form action="servicio-registra-algo" method="post">
			<input type="submit" value="Enviar datos"></input>
		</form>
	</body>
</html>
