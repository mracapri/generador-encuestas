package edu.utvm.gencuesta.domain;

import java.util.ArrayList;
import java.util.List;

public class PreguntaOpcion extends Pregunta{
	private List<String> opciones = new ArrayList<String>();
	private int opcionSeleccionada = -1;	
	
	public PreguntaOpcion(String descripcion, boolean obligatorio,
			boolean esDeTiempo, int tiempo, ArrayList<String> opciones) {
		super(descripcion,obligatorio,esDeTiempo, tiempo);
		this.opciones = opciones;
	}	

	public List<String> getOpciones() {
		return opciones;
	}

	public int getOpcionSeleccionada() {
		return opcionSeleccionada;
	}

	public void setOpcionSeleccionada(int opcionSeleccionada) {
		this.opcionSeleccionada = opcionSeleccionada;
	}
}
