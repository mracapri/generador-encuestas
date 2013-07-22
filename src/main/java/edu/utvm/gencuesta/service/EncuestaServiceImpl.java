package edu.utvm.gencuesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.domain.Pregunta;
import edu.utvm.gencuesta.repository.EncuestaRepository;

@Service
public class EncuestaServiceImpl implements EncuestaService{

	@Autowired
	EncuestaRepository encuestaRepository;
	
	@Override
	public void save(Encuesta encuesta) {		
		encuestaRepository.save(encuesta);
	}
	
	@Override
	public void save(Encuesta encuesta, Pregunta pregunta) {
		
	}

	@Override
	public List<Encuesta> findAll() {
		return encuestaRepository.findAll();
	}

	@Override
	public Encuesta read(String id) {
		return encuestaRepository.findOneById(id);
	}

}
