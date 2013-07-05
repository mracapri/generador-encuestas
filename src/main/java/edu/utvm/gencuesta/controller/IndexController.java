package edu.utvm.gencuesta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/views")
public class IndexController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/index")
    public ModelAndView handleIndexRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		ModelAndView model = new ModelAndView("index");
		
		String saludo = "Ola k ace!!";
		
		// pasando valores al modelo
		model.addObject("mensaje", saludo);
		
		log.info("Atendiendo peticion..");
		return model;
    }
}