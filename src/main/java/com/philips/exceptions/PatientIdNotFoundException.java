package com.philips.exceptions;

@SuppressWarnings("serial")
public class PatientIdNotFoundException extends Exception{
	public PatientIdNotFoundException() {
		super();
	}
	public PatientIdNotFoundException(String msg) {
		super(msg);
	}

}
