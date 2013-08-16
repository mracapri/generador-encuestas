package edu.utvm.gencuesta.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.utvm.gencuesta.domain.Encuesta;
public interface EncuestaRepository extends MongoRepository<Encuesta, String>{
	Encuesta findOneById(String id);
	List<Encuesta> findByUsuario_Usuario(String usuario);
}