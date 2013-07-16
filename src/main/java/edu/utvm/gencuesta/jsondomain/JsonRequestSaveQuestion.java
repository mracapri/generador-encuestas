package edu.utvm.gencuesta.jsondomain;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class JsonRequestSaveQuestion {
	private String tipoSeleccionado;
	private boolean esPreguntaAbierta;
	private boolean esPreguntaDeTiempo;
	private boolean esPreguntaObligatoria;
	private int tiempo;
	private String textoPregunta;
	private List<String> opciones;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getTipoSeleccionado() {
		return tipoSeleccionado;
	}

	public void setTipoSeleccionado(String tipoSeleccionado) {
		this.tipoSeleccionado = tipoSeleccionado;
	}

	public boolean isEsPreguntaAbierta() {
		return esPreguntaAbierta;
	}

	public void setEsPreguntaAbierta(boolean esPreguntaAbierta) {
		this.esPreguntaAbierta = esPreguntaAbierta;
	}

	public boolean isEsPreguntaDeTiempo() {
		return esPreguntaDeTiempo;
	}

	public void setEsPreguntaDeTiempo(boolean esPreguntaDeTiempo) {
		this.esPreguntaDeTiempo = esPreguntaDeTiempo;
	}

	public boolean isEsPreguntaObligatoria() {
		return esPreguntaObligatoria;
	}

	public void setEsPreguntaObligatoria(boolean esPreguntaObligatoria) {
		this.esPreguntaObligatoria = esPreguntaObligatoria;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getTextoPregunta() {
		return textoPregunta;
	}

	public void setTextoPregunta(String textoPregunta) {
		this.textoPregunta = textoPregunta;
	}

	public List<String> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<String> opciones) {
		this.opciones = opciones;
	}
}
