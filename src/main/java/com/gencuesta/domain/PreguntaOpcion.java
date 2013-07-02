package com.gencuesta.domain;

import java.util.ArrayList;

public class PreguntaOpcion extends Pregunta{
	private ArrayList<String> respuestas = new ArrayList<String>();
	private String  respuestaSeleccionada;
	//private ArrayList<imagen> respuestasImg = new ArrayList<imagen>();       byte 
	private  byte respuestaSeleccionadaImg;
	
	public PreguntaOpcion(String descripcion,boolean obligatorio,boolean esDeTiempo, ArrayList<String> respuestas){
		super(descripcion,obligatorio,esDeTiempo);
		this.respuestas = respuestas;		
		
	}
	public PreguntaOpcion(String descripcion,boolean obligatorio,boolean esDeTiempo,byte []respuestasImg){
		super(descripcion,obligatorio,esDeTiempo);
		//this.respuestasImg = respuestasImg;			
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
