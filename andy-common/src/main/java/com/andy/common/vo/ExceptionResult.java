package com.andy.common.vo;

import com.andy.common.enums.ExceptionEnums;

public class ExceptionResult {
	private String message;
	private int status;
	private Long timestamp;

	public ExceptionResult(ExceptionEnums e){
		this.message = e.getMessage();
		this.status=e.getCode();
		this.timestamp=System.currentTimeMillis();
	}
}
