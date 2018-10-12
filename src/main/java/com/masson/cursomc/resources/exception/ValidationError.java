package com.masson.cursomc.resources.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> error = new ArrayList<>(); 

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getError() {
		return error;
	}

	public void addError(String fieldName, String message) {
		error.add(new FieldMessage(fieldName, message));
	}
	
	

}
