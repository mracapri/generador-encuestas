package edu.utvm.gencuesta.domain;

import java.util.ArrayList;
import java.util.List;

public class PreguntaOpcionMultiple extends Pregunta {
	private List<String> opciones = new ArrayList<String>();
	private List<Integer> opcionesSeleccionadas = new ArrayList<Integer>();	
	
	public PreguntaOpcionMultiple(String descripcion, boolean obligatorio,
			boolean esDeTiempo, int tiempo, ArrayList<String> opciones) {
		super(descripcion,obligatorio,esDeTiempo, tiempo);
		this.opciones = opciones;
	}

	public List<String> getOpciones() {
		return opciones;
	}


	public List<Integer> getOpcionesSeleccionadas() {
		return opcionesSeleccionadas;
	}

}
