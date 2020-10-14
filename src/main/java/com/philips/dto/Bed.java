package com.philips.dto;

public class Bed {
	private int bId;
	private int patientId;
	private String dpt;
	public Bed() {
		
	}
	public Bed(int bId, int pId,String dpt) {
		this.bId = bId;
		this.patientId=pId;
		this.dpt=dpt;
	}
	public int getbId() {
		return bId;
	}
	public int getPatientId() {
		return patientId;
	}
	public String getDpt() {
		return dpt;
	}
	
}
