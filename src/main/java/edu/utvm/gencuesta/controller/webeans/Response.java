package edu.utvm.gencuesta.controller.webeans;

import java.util.HashMap;
import java.util.Map;

public class Response {
	private String result;

	private Map<String, String> errores;

	public Response(String result) {
		this.result = result;
		errores = new HashMap<String, String>();
	}
	
	public Response(String result, Map<String, String> errores) {
		this.result = result;
		this.errores = errores;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public Map<String, String> getErrores() {
		return errores;
	}
}
