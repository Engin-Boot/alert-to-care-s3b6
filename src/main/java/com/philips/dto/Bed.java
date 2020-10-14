package com.philips.dto;

import java.util.Date;

public class Bed {
	private int bId;
	private int patientId;
	private String dpt;
	private boolean alertStatus=false;
	private String dateOfAdmit;
	public Bed() {
		
	}
	public Bed(int bId) {
		this.bId=bId;
	}
	public Bed(int bId, int pId,String dt) {
		this.bId = bId;
		this.patientId=pId;
		this.dateOfAdmit=dt;
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
	public boolean isAlertStatus() {
		return alertStatus;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public void setAlertStatus(boolean alertStatus) {
		this.alertStatus = alertStatus;
	}
	public String getDateOfAdmit() {
		return dateOfAdmit;
	}
	public void setDateOfAdmit(String dateOfAdmit) {
		this.dateOfAdmit = dateOfAdmit;
	}
	public boolean isBedEmpty() {
		if(this.patientId==0)
			return true;
		return false;
	}
}
