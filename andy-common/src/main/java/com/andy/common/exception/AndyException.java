package com.andy.common.exception;

import com.andy.common.enums.ExceptionEnums;

public class AndyException extends RuntimeException {
	private ExceptionEnums exceptionEnums;

	public AndyException(){}
	public AndyException(ExceptionEnums exceptionEnums){
		this.exceptionEnums=exceptionEnums;}

	public ExceptionEnums getExceptionEnums() {
		return exceptionEnums;
	}
}
