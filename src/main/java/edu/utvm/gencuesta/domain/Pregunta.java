package edu.utvm.gencuesta.domain;	

public class Pregunta {
	private boolean obligatorio;
	private String descripcion;
	private boolean esDeTiempo;
	private int tiempo;
	
	public Pregunta(){
		
				
	}
	public Pregunta(String descripcion,boolean obligatorio,boolean esDeTiempo){
		this.descripcion = descripcion;
		this.obligatorio = obligatorio;
		this.esDeTiempo = esDeTiempo;		
		
		if(esDeTiempo){
			//solicitar tiempo
			
		}
	}
		
	
	
	public void setDescripcion(String nuevaDescripcion ){
		this.descripcion = nuevaDescripcion;		
	}
	public String getDescripcion(){
		return this.descripcion;		
	}
	/*
	 * modicar pregunta
	 * */
	

}
