package com.andy.common.enums;

public enum  ExceptionEnums {
	SUCCESS(200,"成功"),
	FAIL(-200,"失败");

	private int code;
	private String message;

	ExceptionEnums(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
