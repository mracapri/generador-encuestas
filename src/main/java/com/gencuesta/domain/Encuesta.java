package com.gencuesta.domain;
import java.util.ArrayList;
import java.util.Date;

public class Encuesta {
	private Usuario usuario;
	//todas las preguntas
	private ArrayList<Pregunta> Preguntas = new ArrayList<Pregunta>();
	private Date fechaCreacion;
	
	private String titulo;
	private String descripcion;
	private ArrayList<String> palabrasClave = new ArrayList<String>();
	private boolean permitirModificacion;
	private Date fechaLimiteModificacion;
	
	public Encuesta(String titulo, String descripcion, Pregunta primeraPregunta){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.Preguntas.add(primeraPregunta);
		
		
				
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
