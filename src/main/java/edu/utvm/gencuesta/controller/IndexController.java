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
	
	@RequestMapping(value="/login")
    public ModelAndView handleIndexRequestLoginPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("login");
		
		return model;
    }		
	
	@RequestMapping(value="/home")
    public ModelAndView handleIndexRequestLoginHome(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("home");
		
		return model;
    }
	
	@RequestMapping(value="/mis-encuestas")
    public ModelAndView handleIndexRequestLoginMisEncuestas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("mis-encuestas");
		
		return model;
    }
}