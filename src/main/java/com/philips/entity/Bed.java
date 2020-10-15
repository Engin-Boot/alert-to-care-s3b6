package com.philips.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Beds")
public class Bed {
	@Id
	@Column(name="b_id")
	private int bId;
	@Column(name="pat_id")
	private int patientId;
	@Column(name="dpt", length=25)
	private String dpt;
	@Column(name="alert_status")
	private boolean alertStatus=false;
	@DateTimeFormat(pattern="d-M-yyyy")
	@Column(name="date_admit")
	private LocalDate dateOfAdmit;
	public Bed() {
		
	}
	public Bed(int bId) {
		this.bId=bId;
	}
	public Bed(int bId, int pId,LocalDate dt) {
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
	public LocalDate getDateOfAdmit() {
		return dateOfAdmit;
	}
	public void setDateOfAdmit(LocalDate dateOfAdmit) {
		this.dateOfAdmit = dateOfAdmit;
	}
	public boolean isBedEmpty() {
		if(this.patientId==0)
			return true;
		return false;
	}
}
