package edu.utvm.gencuesta.jsondomain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class JsonRequestSaveQuestion {
	private int id;
	private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
