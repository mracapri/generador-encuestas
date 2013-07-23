package edu.utvm.gencuesta.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PreguntaAbierta extends Pregunta{
	
	public PreguntaAbierta() {
		super("Sin descripcion", false, false, 0);
	}
	
	public PreguntaAbierta(String descripcion,boolean obligatorio){
		super(descripcion, obligatorio);
	}
	public PreguntaAbierta(String descripcion,boolean obligatorio,boolean esDeTiempo, int tiempo){
		super(descripcion,obligatorio,esDeTiempo, tiempo);
	}
	
	@Override
	public String getTipoPregunta() {
		return "Pregunta abierta";
	}

}
