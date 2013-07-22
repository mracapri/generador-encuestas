package edu.utvm.gencuesta.service;

import java.util.List;

import edu.utvm.gencuesta.domain.Encuesta;

public interface EncuestaService {
	void save(Encuesta encuesta);
	Encuesta read(String id);
	List<Encuesta> findAll();
}
