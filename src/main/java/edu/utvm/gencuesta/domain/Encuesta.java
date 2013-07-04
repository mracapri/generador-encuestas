package edu.utvm.gencuesta.domain;	
import java.util.ArrayList;
import java.util.Date;
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
	private boolean permitirModificacion;//
	private Date fechaLimiteModificacion;//
	
	public Encuesta(String titulo, String descripcion, Pregunta primeraPregunta){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.Preguntas.add(primeraPregunta);
		
		
				
	}
	public void nuevaPregunta(Pregunta pregunta){
		this.Preguntas.add(pregunta);
		
	}
	public void eliminarPregunta(int numeroPregunta){
		Preguntas.remove(numeroPregunta);
		
	}
	public void modificarPregunta(int numeroPregunta, Pregunta nuevaPregunta){
		Preguntas.set(numeroPregunta,nuevaPregunta);
		
	}
	public void ingresarPalabraClave(String palabraClave){
		this.palabrasClave.add(palabraClave);
		
	}
	/*
	 * metodo para recivir pregunta
	 * eliminar pregunta
	 * modificar pregunta
	 * 
	 * 
	 * 
	 * */
	
}
