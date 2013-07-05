package edu.utvm.gencuesta.domain;
import java.util.*;


public class PreguntaOpcionMultiple extends Pregunta {
	private ArrayList<String> respuestas = new ArrayList<String>();
	private ArrayList<Integer> respuestaSeleccionada = new ArrayList<Integer>();
	//private ArrayList<byte> respuestasImg = new ArrayList<byte>();       byte 
	private ArrayList<Integer> respuestaSeleccionadaImg = new ArrayList<Integer>();
	
	/*Respuestas auxuliares en string*/
	ArrayList<String> auxRespuestas = new ArrayList<String>();
	
	public PreguntaOpcionMultiple(String descripcion,boolean obligatorio,boolean esDeTiempo,ArrayList<String> respuestas){
		super(descripcion,obligatorio,esDeTiempo);
		this.respuestas = respuestas;	
		
	}
	
	public PreguntaOpcionMultiple(String descripcion,boolean obligatorio,boolean esDeTiempo,byte respuestasImg){
		super(descripcion,obligatorio,esDeTiempo);
		//this.respuestasImg = respuestasImg;				
	}
	
	
	/*
	 * descripcion, posibles respuestas
	 * 
	 * contertar
	 * 
	 * 
	 * */
	public void setRespuestasTexto(ArrayList<Integer> respuestas){
		this.respuestaSeleccionada = respuestas;
		
	}	
	
	public ArrayList<String> getRespuestasTexto(){	
		//
		for(int numeroRespuestas= 0;numeroRespuestas< respuestaSeleccionada.size();numeroRespuestas++){
			auxRespuestas.add(respuestas.get(numeroRespuestas));
		}
		return this.auxRespuestas;		
	}
	
	
	public void setRespuestasImg(ArrayList<Integer> respuestas){
		this.respuestaSeleccionadaImg = respuestas;
	}
	
	
	public  ArrayList<Integer> getRespuestasImg(){				
		return this.respuestaSeleccionadaImg;		
	}
	
		
	

}
