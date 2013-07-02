package com.gencuesta.domain;
import java.util.*;


public class PreguntaOpcionMultiple extends Pregunta {
	private ArrayList<String> respuestas = new ArrayList<String>();
	private ArrayList<Integer> respuestaSeleccionada = new ArrayList<Integer>();
	//private ArrayList<imagen> respuestasImg = new ArrayList<imagen>();       byte 
	//private ArrayList<imagen> respuestaSeleccionadaImg = new ArrayList<imagen>();
			
	
	public PreguntaOpcionMultiple(String descripcion,boolean obligatorio,boolean esDeTiempo,ArrayList<String> respuestas){
		super(descripcion,obligatorio,esDeTiempo);
		this.respuestas = respuestas;	
;		
	}
	
	public PreguntaOpcionMultiple(String descripcion,boolean obligatorio,boolean esDeTiempo,byte respuestasImg){
		super(descripcion,obligatorio,esDeTiempo);
		//this.respuestasImg = respuestasImg;				
	}
	
		
	

}
