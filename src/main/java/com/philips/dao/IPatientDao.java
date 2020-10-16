package com.philips.dao;

import java.util.List;

import com.philips.entity.Patient;

public interface IPatientDao {
	public boolean addPatient(Patient patient);
	public List<Patient> viewPatient();
	public Patient viewPatient(int pid);
	public boolean editPatient(Patient patient);
	public boolean removePatient(Patient patient);
}
