package edu.utvm.gencuesta.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.jsondomain.JsonRequestSaveQuestion;
import edu.utvm.gencuesta.jsondomain.JsonResponse;
import edu.utvm.gencuesta.service.EncuestaService;
import edu.utvm.gencuesta.util.CatalogosEstaticos;

@Controller
@RequestMapping("/encuesta")
@SessionAttributes({ "new-encuesta" })
public class EncuestaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private EncuestaService serviceEncuesta;

	@Autowired
	private CatalogosEstaticos catalogos;

	@Autowired
	private Gson gson;

	@RequestMapping(value="/save-question", 
			method=RequestMethod.POST, 
			headers={"content-type=application/json"})
    public @ResponseBody String handleIndexRequestSaveQuestion(
    		HttpServletRequest request, 
    		HttpServletResponse response,
    		@RequestBody JsonRequestSaveQuestion value)
            throws ServletException, IOException {
		response.setHeader("content-type", "application/json");
		log.info(gson.toJson(value));
		
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<JsonRequestSaveQuestion>> violations = validator.validate(value);
		for (ConstraintViolation<JsonRequestSaveQuestion> violation : violations) {
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			System.out.println("invalid value for: '" + propertyPath + "': " + message);
		}		
		return gson.toJson(new JsonResponse("ok"));
    }

	@RequestMapping(value = "/save-encuesta", method = RequestMethod.POST)
	public ModelAndView handleIndexRequest(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("new-encuesta") @Valid Encuesta encuesta,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("crear-encuesta");
		if (!result.hasErrors()) {
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
		model.addObject("new-encuesta", new Encuesta("", "", null));
		return model;
	}

	@RequestMapping(value = "/design")
	public ModelAndView handleIndexRequestLoginEncuestaDiseniar(
			HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("new-encuesta") Encuesta encuesta)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("encuesta-diseniar");
		model.addObject("encuesta", encuesta);
		model.addObject("tiposPreguntas", catalogos.getTiposPreguntas());
		return model;
	}
}