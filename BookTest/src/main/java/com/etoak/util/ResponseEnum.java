package com.etoak.util;

public enum ResponseEnum {
	
	SUCCESS(0,"响应成功"),
	FAILED(100,"响应失败");
	
	private Integer code;
	private String message;
	private ResponseEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
