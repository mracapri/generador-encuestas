package edu.utvm.gencuesta.service;

import java.util.List;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.domain.Pregunta;

public interface EncuestaService {
	void save(Encuesta encuesta);
	void save(Encuesta encuesta, Pregunta pregunta);
	Encuesta read(String id);
	List<Encuesta> findAll();
}
