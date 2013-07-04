package edu.utvm.gencuesta.domain;

public class Usuario {
	private String nombre;
	private String clave;
	private String usuario;
	
	public Usuario(String nombre, String clave, String usuario){
		this.nombre = nombre;
		this.clave = clave;
		this.usuario = usuario;
		
	}
	
	public void setNombre(String nombre ){
		this.nombre = nombre;		
	}
	public String getnombre(){
		return this.nombre;		
	}
	
	public void setClave(String clave ){
		this.clave = nombre;		
	}
	public String getClave(){
		return this.nombre;		
	}
	
	public void setUsuario(String Usuario ){
		this.usuario = Usuario;		
	}
	public String getUsuario(){
		return this.usuario;		
	}
	

}