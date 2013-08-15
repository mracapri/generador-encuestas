package edu.utvm.gencuesta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.domain.Usuario;
import edu.utvm.gencuesta.service.EncuestaService;

@Controller
@RequestMapping("/encuesta")
public class DespliegueEncuestaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private EncuestaService serviceEncuesta;
	
	@Autowired
	private Gson gson;

	@RequestMapping(value = "/desplegar/{id}")
	public ModelAndView handleIndexRequestLoginCrearEncuesta(
			HttpServletRequest request, HttpServletResponse response,
			@PathVariable("id") String id)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("despliegue-encuesta");
		Encuesta encuesta = serviceEncuesta.read(id);
		model.addObject("encuesta", encuesta);
		return model;
	}

}