package edu.utvm.gencuesta.controller.validator;

import javax.validation.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import edu.utvm.gencuesta.controller.webeans.RequestSaveQuestion;
@Component
public class RequestSaveQuestionValidator extends LocalValidatorFactoryBean implements Validator{

	
	@Override
	public void validate(Object object, Errors error) {
		RequestSaveQuestion saveQuestion = (RequestSaveQuestion) object;
		if(saveQuestion.isEsPreguntaDeTiempo()){
			error.rejectValue("tiempo", "tiempo.mayor.a.cero");	
		}
		
		if(!saveQuestion.isEsPreguntaObligatoria()){
			error.rejectValue("opciones", "opciones.obligatorias");	
		}
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RequestSaveQuestion.class);
	}
}
