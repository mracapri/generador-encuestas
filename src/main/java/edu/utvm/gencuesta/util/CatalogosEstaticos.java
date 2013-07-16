package edu.utvm.gencuesta.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.utvm.gencuesta.domain.TipoPregunta;

@Component
public class CatalogosEstaticos {
	
	private List<TipoPregunta> tiposPreguntas;
	
	public CatalogosEstaticos() {
		init();
	}
	
	
	private void init() {
		tiposPreguntas = new ArrayList<TipoPregunta>();
		tiposPreguntas.add(new TipoPregunta("PA", "Pregunta abierta"));
		tiposPreguntas.add(new TipoPregunta("PO", "Pregunta de opcion"));
		tiposPreguntas.add(new TipoPregunta("POM", "Pregunta de opcion multiple"));
	}
	
	public List<TipoPregunta> getTiposPreguntas() {
		return tiposPreguntas;
	}
}