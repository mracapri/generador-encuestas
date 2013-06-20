package edu.utvm.clases;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegistraAlgo extends HttpServlet {
	protected void doGet(
		HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Te estoy atendiendo...");
	} 


	protected void doPost(
		HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Te atiendo por POST");
	}
}
