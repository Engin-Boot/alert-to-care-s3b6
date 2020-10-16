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
	private Integer bId;
	@Column(name="pat_id")
	private Integer patientId=0;
	@Column(name="dpt", length=25)
	private String dpt;
	@Column(name="alert_status")
	private boolean alertStatus=false;
	@DateTimeFormat(pattern="d-M-yyyy")
	@Column(name="date_admit")
	private LocalDate dateOfAdmit;
	
	@Column(name="x_coordinate")
	private Integer xCoordinate=0;
	@Column(name="y_coordinate")
	private Integer yCoordinate=0;
	
	public Bed() {
		
	}
	public Bed(Integer bId) {
		this.bId=bId;
	}
	public Bed(Integer bId, Integer x,Integer y,String dpt ) {
		this.bId = bId;
		this.xCoordinate=x;
		this.yCoordinate=y;
		this.dpt=dpt;
	}
	public Integer getbId() {
		return bId;
	}
	public Integer getPatientId() {
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
	public Integer getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(Integer xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public Integer getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(Integer yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
}
