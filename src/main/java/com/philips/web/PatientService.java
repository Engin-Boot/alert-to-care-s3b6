package com.philips.web;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dao.IBedDao;
import com.philips.dao.IPatientDao;
import com.philips.entity.Bed;
import com.philips.entity.Patient;
import com.philips.exceptions.PatientIdException;
import com.philips.exceptions.PatientIdNotFoundException;

@RestController
public class PatientService {
	@Autowired
	private IPatientDao dao;
	
	@Autowired
	private IBedDao bedDao;
	
	@PostMapping("/addPatient")
	public String addPatient(@RequestBody Patient p) throws PatientIdException{
		Patient pFromdb = dao.viewPatient(p.getpId());
		if(pFromdb != null)
			throw new PatientIdException("Patient Id "+p.getpId()+" already exist!");
		dao.addPatient(p);
		return "patient added successfully";
	}
	
	@GetMapping("/viewAllPatients")
	public List<Patient> viewAllPatients() {
		return dao.viewPatient();
	}
	
	@PutMapping("/editPatient")
	public String editPatient(Patient p) throws PatientIdNotFoundException {
		Patient pFromdb = dao.viewPatient(p.getpId());
		if(pFromdb==null)
			throw new PatientIdNotFoundException("Patient ID "+p.getpId()+" not Exists in DB");
		dao.editPatient(p);
		return "Patient edited Successfully";
	}
	
	@DeleteMapping("/deletePatient/{pid}")
	public Patient deletePatient(@PathVariable("pid") int id) throws PatientIdNotFoundException {
		Patient p = dao.viewPatient(id);
		if(p==null)
			throw new PatientIdNotFoundException("Patient ID "+id+" not Exists in DB");
		dao.removePatient(p);
		return p;
	}
	
	@GetMapping("/admit/{pid}")
	public Patient admit(@PathVariable("pid") int id) throws PatientIdNotFoundException {
		Patient p=dao.viewPatient(id);
		if(p==null)
			throw new PatientIdNotFoundException("Patient ID "+id+" not Exists in DB");
		LocalDate now = LocalDate.now(); 
		p.setDateOfAdmit(now);
		dao.editPatient(p);
		List<Bed> lst= bedDao.availableBeds();
		Bed b1=lst.get(0);
		b1.setPatientId(id);
		bedDao.editBed(b1);
		return p;
	}
	
	@GetMapping("/discharge/{pid}")
	public Patient discharge(@PathVariable("pid") int id) throws PatientIdNotFoundException {
		Patient p=dao.viewPatient(id);
		if(p==null)
			throw new PatientIdNotFoundException("Patient ID "+id+" not Exists in DB");
		LocalDate now = LocalDate.now(); 
		p.setDateOfDischarge(now);
		bedDao.dischargePatient(id);
		return p;
	}
	@GetMapping("/admitTo/{dpt}/{pid}")
	public String admitTo(@PathVariable("dpt") String dpt,@PathVariable("pid") int id) throws PatientIdNotFoundException {
		Patient p=dao.viewPatient(id);
		if(p==null)
			throw new PatientIdNotFoundException("Patient ID "+id+" not Exists in DB");
		LocalDate now = LocalDate.now(); 
		p.setDateOfAdmit(now);
		dao.editPatient(p);
		List<Bed> lst= bedDao.availableBeds(dpt);
		if(lst.isEmpty())
			return "Beds not available in "+dpt;
		Bed b1=lst.get(0);
		b1.setPatientId(id);
		bedDao.editBed(b1);
		return "Patient admitted to "+ dpt+" Successfully";
	}
	
}
