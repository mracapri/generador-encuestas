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
@SessionAttributes({ "encuestaActual" })
public class EncuestaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private EncuestaService serviceEncuesta;
	
	@Autowired
	private Gson gson;

	@RequestMapping(value="/all")
	public ModelAndView handleIndexRequestLoginMisEncuestas(
			HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("mis-encuestas");
		model.addObject("encuestas", serviceEncuesta.findAll());
		return model;
    }
	
	@RequestMapping(value = "/save-encuesta", method = RequestMethod.POST)
	public ModelAndView handleIndexRequest(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("encuestaActual") @Valid Encuesta encuesta,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("crear-encuesta");
		if (!result.hasErrors()) {
			serviceEncuesta.save(encuesta);
			model.setViewName("redirect:design");
		} else {
			model.addObject("result", result);
		}
		return model;
	}

	@RequestMapping(value = "/create-form")
	public ModelAndView handleIndexRequestLoginCrearEncuesta(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("crear-encuesta");
		model.addObject("encuestaActual", new Encuesta("", "", new Usuario(
				"Mario Rivera", "xasdq123", "mracapri")));
		return model;
	}

	@RequestMapping(value = "/design")
	public ModelAndView handleIndexRequestEncuestaDiseniar(			
			HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("encuestaActual") Encuesta encuesta)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("encuesta-diseniar");
		model.addObject("encuesta", encuesta);
		return model;
	}
	
	@RequestMapping(value = "/configurate/{id}")
	public ModelAndView handleIndexRequestEncuestaConfigurar(			
			HttpServletRequest request, HttpServletResponse response,
			@PathVariable("id") String id)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("configurar-encuesta");
		log.debug(id);
		Encuesta read = serviceEncuesta.read(id);
		model.addObject("encuestaActual", read);
		return model;
	}

	@RequestMapping(value = "/design/{id}")
	public ModelAndView handleIndexRequestEncuestaDiseniarById(			
			HttpServletRequest request, HttpServletResponse response,
			@PathVariable("id") String id)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("encuesta-diseniar");
		log.debug(id);
		Encuesta read = serviceEncuesta.read(id);
		if (read != null) {
			log.info(gson.toJson(read));
			model.addObject("encuestaActual", read);
		} else {
			// TODO: redireccionar la vista
		}
		return model;
	}
}