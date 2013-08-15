package edu.utvm.gencuesta.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.gson.Gson;

@Controller
@RequestMapping("/send")
public class TestController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	private List<String> mensajesRecibidos = new ArrayList<String>();
	private List<String> archivosRecibidos = new ArrayList<String>();

	@Autowired
	Gson gson;
	
	@RequestMapping(value="/sms/all")
	public @ResponseBody String verSms(HttpServletRequest request,
			HttpServletResponse response)
            throws ServletException, IOException {
		String json = gson.toJson(mensajesRecibidos);
		return json;
    }
	
	@RequestMapping(value="/file/all")
	public @ResponseBody String verArchivos(HttpServletRequest request,
			HttpServletResponse response)
            throws ServletException, IOException {
		String json = gson.toJson(archivosRecibidos);
		return json;
    }
	
	@RequestMapping(value="/sms")
	public @ResponseBody String enviarSms(HttpServletRequest request,
			HttpServletResponse response, @RequestParam("sms") String sms)
            throws ServletException, IOException {
		mensajesRecibidos.add(sms);
		return "Recibiendo sms: " + sms;
    }
	
	@RequestMapping(value="/file", method=RequestMethod.POST)
    public @ResponseBody String enviarArchivo(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam("file") CommonsMultipartFile archivo)
            throws ServletException, IOException {
		log.info("Recibiendo archivo: " + archivo.getName() + " tamanio: "
				+ archivo.getSize());
		archivosRecibidos.add(archivo.getOriginalFilename());
		return "Recibiendo archivo: " + archivo.getName() + " tamanio: "
				+ archivo.getSize();
    }
}