package edu.utvm.gencuesta.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pregunta {
	private boolean obligatorio;
	private String descripcion;
	private boolean esDeTiempo;
	private int tiempo;

	public Pregunta() {
		/*
		 * Crea una preguna sin descripcion, no obligatoria, que no es de tiempo
		 * y tiempo cero
		 */
		setDescripcion("Sin descripcion");
		setObligatorio(false);
		setEsDeTiempo(false);
		setTiempo(0);
	}

	public Pregunta(String descripcion, boolean obligatorio) {
		this.descripcion = descripcion;
		this.obligatorio = obligatorio;
	}

	public Pregunta(String descripcion, boolean obligatorio,
			boolean esDeTiempo, int tiempo) {
		this(descripcion, obligatorio);
		this.esDeTiempo = esDeTiempo;
		this.tiempo = tiempo;
	}

	public void setDescripcion(String nuevaDescripcion) {
		this.descripcion = nuevaDescripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}

	public boolean getObligatorio() {
		return this.obligatorio;
	}

	public void setEsDeTiempo(boolean esDeTiempo) {
		this.esDeTiempo = esDeTiempo;
	}

	public boolean getEsDeTiempo() {
		return this.esDeTiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getTiempo() {
		return this.tiempo;
	}

	public String getTipoPregunta(){
		return "Pregunta generica";
	}
	
	public String getDetalleOpciones(){
		return "Sin opciones";
	}
}