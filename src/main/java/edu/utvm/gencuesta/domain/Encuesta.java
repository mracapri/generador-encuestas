package edu.utvm.gencuesta.domain;	
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import edu.utvm.gencuesta.domain.Pregunta;
import edu.utvm.gencuesta.domain.Usuario;

public class Encuesta {
	private Usuario usuario;//
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
		java.util.Date fecha = new Date();
		fechaCreacion = fecha;	
		this.Preguntas.add(primeraPregunta);						
				
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
	
	public void setPalabraClave(String palabraClave){
		this.palabrasClave.add(palabraClave);		
	}
	public ArrayList<String> getPalabraClave(){
		return this.palabrasClave;		
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;		
	}
	public String getDescripcion(){
		return this.descripcion;		
	}
	
	
	
	public void nuevaPregunta(Pregunta pregunta){
		this.Preguntas.add(pregunta);
		
	}
	public void eliminarPregunta(int numeroPregunta){
		Preguntas.remove(numeroPregunta);
		
	}
	//revisar
	public void modificarPregunta(int numeroPregunta, Pregunta nuevaPregunta){
		Preguntas.set(numeroPregunta,nuevaPregunta);
		
	}
	
	
	
	
	
	
}
