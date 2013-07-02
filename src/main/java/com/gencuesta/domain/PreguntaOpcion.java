package com.gencuesta.domain;

public class PreguntaOpcion extends Pregunta{
	private String [] respuestas;
	private String  respuestaSeleccionada;
	private  byte[] respuestasImg;
	private  byte respuestaSeleccionadaImg;
	
	public PreguntaOpcion(String descripcion,boolean obligatorio,boolean esDeTiempo,String []respuestas){
		super(descripcion,obligatorio,esDeTiempo);
		this.respuestas = respuestas;			
		
	}
	public PreguntaOpcion(String descripcion,boolean obligatorio,boolean esDeTiempo,byte []respuestasImg){
		super(descripcion,obligatorio,esDeTiempo);
		this.respuestasImg = respuestasImg;			
	}
	
	public void setRespuestaSeleccionada(String respuesta){
		this.respuestaSeleccionada = respuesta;
	}
	
	public String getRespuestaSeleccionada(){
		return this.respuestaSeleccionada;		
	}
	
	
	
	public void setRespuesta(byte respuesta){
		this.respuestaSeleccionadaImg = respuesta;
	}
	
	public byte getRespuestaSeleccionadaImg(){
		return this.respuestaSeleccionadaImg;		
	}

	
	

}
