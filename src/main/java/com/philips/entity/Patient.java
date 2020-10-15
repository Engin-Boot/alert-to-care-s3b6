package com.philips.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="patients")
public class Patient {
	@Id
	@Column(name="p_id")
	private int pId;
	@Column(name="p_name", length=25)
	private String pName;
	@Column(name="phone_no", length=25)
	private String phoneNo;
	
	public Patient(int id,String name,String ph) {
		this.pId=id;
		this.pName=name;
		this.phoneNo=ph;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String name) {
		pName = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
