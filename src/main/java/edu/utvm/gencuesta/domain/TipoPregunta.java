package edu.utvm.gencuesta.domain;

public class TipoPregunta {
	private int id;
	private String descripcion;
	
	public TipoPregunta(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}		
}
