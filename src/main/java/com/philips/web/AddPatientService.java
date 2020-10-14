package com.philips.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dto.Patient;

@RestController
public class AddPatientService {
	public Map<Integer, Patient> patMap = new HashMap<>();
	{  
		patMap.put(1001,new Patient(1001,"abc","123456"));
		patMap.put(1002,new Patient(1002,"def","384859"));
		patMap.put(1003,new Patient(1003,"xyz","985372"));
	}
	@GetMapping("/viewPatient")
	public ArrayList<Patient> viewPatient() {
		ArrayList<Patient> lst = new ArrayList<Patient>(patMap.values());
		return lst;
	}
	@PostMapping("/discharge")
	public String discharge(@RequestBody int pId) {
		patMap.remove(pId);
		return "Discharged successfully";
	}
}
