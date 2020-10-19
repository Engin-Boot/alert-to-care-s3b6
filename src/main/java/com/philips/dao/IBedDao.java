package com.philips.dao;

import java.util.List;

import com.philips.entity.Bed;

public interface IBedDao {
	public boolean addBed(Bed bed);
	public List<Bed> viewBed();
	public Bed viewBed(Integer bid);
	public boolean editBed(Bed bed);
	public boolean removeBed(Bed bed);
	public List<Bed> alertBeds();
	public List<Bed> availableBeds();
	public List<Bed> availableBeds(String department);
	public boolean dischargePatient(Integer pid);
}
