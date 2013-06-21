package edu.utvm.clases;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegistraAlgo extends HttpServlet {
	protected void doPost(
		HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {

			
		/* Recibiendo parametros del formulario */
		String nombre = (String) request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String sexo = (String) request.getParameter("sexo");
		String preferencias = (String) request.getParameter("preferencias");


		System.out.println("NOMBRE: " + nombre);
		System.out.println("EDAD: " + edad);
		System.out.println("SEXO: " + sexo);
		System.out.println("PREFERENCIAS: " + preferencias);

		/* Hace peticion al MODELO */

		/* Enviando valores al modelo */
		request.setAttribute("saludo","ola k ace? Eres " + nombre);
		
		/* Redirenccionando a la vista indicada */
		RequestDispatcher view = 
			request.getRequestDispatcher("/pagina1.jsp");

	        view.forward(request, response);
	} 


	protected void doGet(
		HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		
	}
}




