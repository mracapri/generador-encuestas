package edu.utvm.gencuesta.domain;

import java.util.ArrayList;
import java.util.List;

public class PreguntaOpcionMultiple extends Pregunta {
	private List<String> opciones = new ArrayList<String>();

	public PreguntaOpcionMultiple() {
		super("Sin descripcion", false, false, 0);
		this.opciones = new ArrayList<String>();
	}

	public PreguntaOpcionMultiple(String descripcion, boolean obligatorio,
			boolean esDeTiempo, int tiempo, List<String> opciones) {
		super(descripcion, obligatorio, esDeTiempo, tiempo);
		this.opciones = opciones;
	}

	public List<String> getOpciones() {
		return opciones;
	}

	@Override
	public String getTipoPregunta() {
		return "Pregunta de Opcion Multiple";
	}
	
	@Override
	public String getDetalleOpciones(){
		return opciones.toString();
	}
}
