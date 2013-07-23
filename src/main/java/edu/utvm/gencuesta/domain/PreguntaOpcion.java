package edu.utvm.gencuesta.domain;

import java.util.ArrayList;
import java.util.List;

public class PreguntaOpcion extends Pregunta{
	private List<String> opciones = new ArrayList<String>();
	
	public PreguntaOpcion() {
		super("Sin descripcion", false, false, 0);
		this.opciones = new ArrayList<String>();
	}
	
	public PreguntaOpcion(String descripcion, boolean obligatorio,
			boolean esDeTiempo, int tiempo, List<String> opciones) {
		super(descripcion,obligatorio,esDeTiempo, tiempo);
		this.opciones = opciones;
	}	

	public List<String> getOpciones() {
		return opciones;
	}

	@Override
	public String getTipoPregunta() {
		return "Pregunta de Opcion";
	}
	
	@Override
	public String getDetalleOpciones(){
		return opciones.toString();
	}
}
