package com.philips.exceptions;

@SuppressWarnings("serial")
public class PatientIdException extends Exception {
	public PatientIdException() {
		super();
	}
	public PatientIdException(String msg) {
		super(msg);
	}
}
