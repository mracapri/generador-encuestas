package edu.utvm.gencuesta.domain;

public class TipoPregunta {
	private String clave;
	private String descripcion;
	
	public TipoPregunta(String clave, String descripcion) {
		this.clave = clave;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getClave() {
		return clave;
	}

}
