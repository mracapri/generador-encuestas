package edu.utvm.gencuesta.controller.webeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

public class RequestSaveQuestion {
	@NotEmpty
	private String tipoSeleccionado;
	private boolean esPreguntaAbierta;
	private boolean esPreguntaDeTiempo;
	private boolean esPreguntaObligatoria;
	private int tiempo;
	@NotEmpty
	private String textoPregunta;
	private String opciones;
	
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

	public String getOpciones() {
		return opciones;
	}

	public List<String> getListOpciones() {
		if(this.opciones != null){
			String[] split = this.opciones.split(";");
			return new ArrayList<String>(Arrays.asList(split));
		}else{
			return new ArrayList<String>();
		}
	}

	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}
}
