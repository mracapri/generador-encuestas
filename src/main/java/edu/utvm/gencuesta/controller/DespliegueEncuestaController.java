package edu.utvm.gencuesta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.service.EncuestaService;

@Controller
@RequestMapping("/encuesta")
@SessionAttributes({"encuesta", "indexPregunta"})
public class DespliegueEncuestaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private EncuestaService serviceEncuesta;
	
	@Autowired
	private Gson gson;

	@RequestMapping(value = "/desplegar/{id}")
	public ModelAndView handleIndexRequestDesplegarEncuesta(
			HttpServletRequest request, HttpServletResponse response,
			@PathVariable("id") String id)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("despliegue-encuesta");
		Encuesta encuesta = serviceEncuesta.read(id);
		model.addObject("encuesta", encuesta);
		model.addObject("indexPregunta", "0");
		return model;
	}

	
	@RequestMapping(value = "/desplegar/show/{indexPregunta}")
	public ModelAndView handleIndexRequestSiguientePregunta(
			HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("encuesta") Encuesta encuesta, 
			@PathVariable("indexPregunta") String indexPregunta)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("mostrar-pregunta");
		int indicePregunta = 0;
		if(!indexPregunta.equals("")){
			indicePregunta = Integer.parseInt(indexPregunta);
		}
		
		if(indicePregunta < encuesta.getPreguntas().size()){
			model.addObject("pregunta", encuesta.getPreguntas().get(indicePregunta));
			model.addObject("indexPregunta", String.valueOf(indicePregunta));
		}

		return model;
	}
}