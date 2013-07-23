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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import edu.utvm.gencuesta.controller.validator.RequestSaveQuestionValidator;
import edu.utvm.gencuesta.controller.webeans.RequestSaveQuestion;
import edu.utvm.gencuesta.controller.webeans.Response;
import edu.utvm.gencuesta.domain.Encuesta;
import edu.utvm.gencuesta.service.EncuestaService;
import edu.utvm.gencuesta.util.CatalogosEstaticos;

@Controller
@RequestMapping("encuesta/pregunta")
@SessionAttributes({ "encuestaActual" })
public class PreguntaController {

	protected final Log log = LogFactory.getLog(getClass());

	@Autowired
	private CatalogosEstaticos catalogos;

	@Autowired
	private RequestSaveQuestionValidator validator;

	@Autowired
	private EncuestaService encuestaService;
	
	@Autowired
	private Gson gson;

	@RequestMapping(value = "/save-question", method = RequestMethod.PUT, headers = { "content-type=application/json" })
	public @ResponseBody
	String handleIndexRequestSaveQuestion(HttpServletRequest request,
			HttpServletResponse response, @RequestBody RequestSaveQuestion value)
			throws ServletException, IOException {
		response.setHeader("content-type", "application/json");
		log.info(gson.toJson(value));

		ValidatorFactory validatorFactory = Validation
				.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<RequestSaveQuestion>> violations = validator
				.validate(value);

		Response jsonResponse = new Response("ok");
		if (violations.size() > 0) {
			// si hay errores
			for (ConstraintViolation<RequestSaveQuestion> violation : violations) {
				String propertyPath = violation.getPropertyPath().toString();
				String message = violation.getMessage();
				jsonResponse.getErrores().put(propertyPath, message);
			}
			// renderea los errores en body
			jsonResponse.setResult("error");
			return gson.toJson(jsonResponse);
		} else {
			return gson.toJson(jsonResponse);
		}
	}

	@RequestMapping(value = "/save-question", method = RequestMethod.POST)
	public ModelAndView handleIndexRequestSaveQuestionForm(
			HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("encuestaActual") Encuesta encuesta,
			@ModelAttribute("requestSaveQuestion") @Valid RequestSaveQuestion value,			
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("redirect:../design");
		log.debug(gson.toJson(value));
		log.debug(gson.toJson(value.getListOpciones()));
		log.debug(gson.toJson(encuesta));
		model.addObject("tiposPreguntas", catalogos.getTiposPreguntas());
		encuesta.getPreguntas().add(value.toPregunta());
		encuestaService.save(encuesta);
		if(result.hasErrors()){
			model.setViewName("agregar-pregunta");
			model.addObject("result", result);
		}
		return model;
	}

	@RequestMapping(value = "/create-form-pregunta")
	public ModelAndView handleIndexRequestFormCrearPregunta(
			HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("requestSaveQuestion") RequestSaveQuestion value) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("agregar-pregunta");
		model.addObject("tiposPreguntas", catalogos.getTiposPreguntas());
		return model;
	}

	@InitBinder("formRegister")
	protected void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(validator);
	}

}