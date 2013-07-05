package edu.utvm.gencuesta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.repository.EncuestaRepository;

@Service
public class EncuestaServiceImpl implements EncuestaService{

	@Autowired
	EncuestaRepository encuestaRepository;
	
	@Override
	public void registrarEncuesta(Encuesta encuesta) {
		/* Se implementa la logica del negocio */
		
		encuestaRepository.save(encuesta);
	}

}
