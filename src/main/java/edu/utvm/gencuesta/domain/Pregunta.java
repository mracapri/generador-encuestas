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
	
	public void setObligatorio(boolean obligatorio ){
		this.obligatorio = obligatorio;		
	}
	public boolean getObligatorio(){
		return this.obligatorio;		
	}
	public void setEsDeTiempo(boolean esDeTiempo ){
		this.esDeTiempo = esDeTiempo;		
	}
	public boolean getEsDeTiempo(){
		return this.esDeTiempo;		
	}
	
	/*	asignar o modificar tiempo	 * */
	public void setTiempo(int tiempo ){
		this.tiempo = tiempo;		
	}
	public int getTiempo(){
		return this.tiempo;		
	}
	
	
	

}
