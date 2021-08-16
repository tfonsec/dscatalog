package com.devsuperior.dscatalog.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	
	private static final long serialVersionUID = 1L;
	private List<FieldMessage> erros = new ArrayList<>();

	public List<FieldMessage> getErros() {
		return erros;
	}
	
	public void addError(String fieldName, String message) { //sempre que quiser add um novo erro na lista vai ter que passar por aqui
		erros.add(new FieldMessage(fieldName, message)); // add um fieldmessagem na lista de erro
		
	}
}
