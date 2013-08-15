package edu.utvm.gencuesta.domain;	
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Encuesta {
	@Id
	private String id;
	private Usuario usuario;
	private List<Pregunta> preguntas;
	private Date fechaCreacion;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descripcion;
	
	private Set<String> palabrasClave;
	private boolean permitirModificacion;
	private Date fechaLimiteModificacion;
	
	public Encuesta(String titulo, String descripcion, Usuario usuario){
		this.titulo = titulo;
		this.descripcion = descripcion;
		fechaCreacion = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR + 1, Calendar.MONTH, Calendar.DATE);
		fechaLimiteModificacion = calendar.getTime();
		this.preguntas = new ArrayList<Pregunta>();
		this.palabrasClave = new HashSet<String>();
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
	
	public Set<String> getPalabrasClave(){
		if(this.palabrasClave == null){
			palabrasClave = new HashSet<String>();
			return palabrasClave;
		}
		return this.palabrasClave;		
	}
	
	public void setPalabrasClave(Set<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
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

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}
}