package edu.utvm.gencuesta.domain;

public class PreguntaAbierta extends Pregunta{
	private String respuesta;
	
	public PreguntaAbierta(String descripcion,boolean obligatorio,boolean esDeTiempo){
		super(descripcion,obligatorio,esDeTiempo);
		
	}
		
	public void setRespuesta(String respuesta){
		this.respuesta = respuesta;	
	}
	
	public String getRespuesta(){
		return this.respuesta;		
	}

}
