package edu.utvm.gencuesta.domain;	
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Encuesta {
	@Id
	private String id;
	private Usuario usuario;
	private ArrayList<Pregunta> preguntas;
	private Date fechaCreacion;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descripcion;
	
	private ArrayList<String> palabrasClave;
	private boolean permitirModificacion;
	private Date fechaLimiteModificacion;
	
	public Encuesta(String titulo, String descripcion, Usuario usuario){
		this.titulo = titulo;
		this.descripcion = descripcion;
		java.util.Date fecha = new Date();
		fechaCreacion = fecha;	
		this.preguntas = new ArrayList<Pregunta>();
		this.palabrasClave = new ArrayList<String>();
		this.usuario = usuario;
	}
	
	public void setPermitirModificacion(boolean permitirModificacion ){
		this.permitirModificacion = permitirModificacion;		
	}
	
	public boolean getPermitirModificacion(){
		return this.permitirModificacion;		
	}
	
	public void setFechaLimiteModificacion(Date fechaLimiteModificacion ){
		this.fechaLimiteModificacion = fechaLimiteModificacion;		
	}
	
	public Date getFechaLimiteModificacion(){
		return this.fechaLimiteModificacion;		
	}
	
	public void setPalabrasClave(String palabraClave){
		this.palabrasClave.add(palabraClave);		
	}
	
	public ArrayList<String> getPalabrasClave(){
		return this.palabrasClave;		
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;		
	}
	
	public String getDescripcion(){
		return this.descripcion;		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}
}