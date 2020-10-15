package com.philips.exceptions;

@SuppressWarnings("serial")
public class BedNotFoundException extends Exception{
	public BedNotFoundException() {
		super();
	}
	public BedNotFoundException(String msg) {
		super(msg);
	}
}
