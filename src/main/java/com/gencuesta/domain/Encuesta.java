package com.gencuesta.domain;
import java.util.Date;

public class Encuesta {
	private Usuario usuario;
	//todas las preguntas
	private Pregunta [] preguntas;
	private Date fechaCreacion;
	
	private String titulo;
	private String descripcion;
	private String [] palabrasClave;
	private boolean permitirModificacion;
	private Date fechaLimiteModificacion;
	
	public Encuesta(String titulo, String descripcion, Pregunta primeraPregunta){
		this.titulo = titulo;
		this.descripcion = descripcion;
		
		
				
	}
	
	/*
	 * metodo para recivir pregunta
	 * eliminar pregunta
	 * modificar pregunta
	 * 
	 * 
	 * 
	 * */
	
}
