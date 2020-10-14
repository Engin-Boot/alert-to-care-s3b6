package com.philips.dto;

public class Patient {
	private int pId;
	private String Name;
	private String phoneNo;
	public Patient(int id,String name,String ph) {
		this.pId=id;
		this.Name=name;
		this.phoneNo=ph;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
