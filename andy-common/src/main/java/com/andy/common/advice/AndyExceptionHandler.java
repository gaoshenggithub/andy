package com.andy.common.advice;

import com.andy.common.exception.AndyException;
import com.andy.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AndyExceptionHandler {

	@ExceptionHandler(AndyException.class)
	public ResponseEntity<ExceptionResult> handlerException(AndyException e){
		return ResponseEntity
				.status(e.getExceptionEnums().getCode())
				.body(new ExceptionResult(e.getExceptionEnums()));
	}
}
