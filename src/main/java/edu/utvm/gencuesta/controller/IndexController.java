package edu.utvm.gencuesta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.domain.Pregunta;
import edu.utvm.gencuesta.service.EncuestaService;

@Controller
@RequestMapping("/views")
public class IndexController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private EncuestaService serviceEncuesta;
	
	@RequestMapping(value="/index")
    public ModelAndView handleIndexRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("index");
		
		String saludo = "Ola k ace!!";
		
		// pasando valores al modelo
		model.addObject("mensaje", saludo);
		
		log.info("Atendiendo peticion..");
		
		Pregunta primeraPregunta = new Pregunta();
		Encuesta encuesta = new Encuesta("Yo que se!!",
				"Una encuesta divertida", primeraPregunta);		
		serviceEncuesta.registrarEncuesta(encuesta);
		
		return model;
    }
	
	
}