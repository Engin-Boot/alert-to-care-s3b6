package com.philips.dto;

public class ErrorMessage {

	private String code;
	private String message;
	private String timestamp;
	public ErrorMessage(String code, String message, String timestamp) {
		super();
		this.code = code;
		this.message = message;
		this.timestamp = timestamp;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	
	
}
