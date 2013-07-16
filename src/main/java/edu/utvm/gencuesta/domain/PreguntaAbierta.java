package edu.utvm.gencuesta.domain;

public class PreguntaAbierta extends Pregunta{
	private String respuesta;
	
	public PreguntaAbierta(String descripcion,boolean obligatorio){
		super(descripcion, obligatorio);
	}
	public PreguntaAbierta(String descripcion,boolean obligatorio,boolean esDeTiempo, int tiempo){
		super(descripcion,obligatorio,esDeTiempo, tiempo);
	}
		
	public void setRespuesta(String respuesta){
		this.respuesta = respuesta;	
	}
	
	public String getRespuesta(){
		return this.respuesta;		
	}

}
