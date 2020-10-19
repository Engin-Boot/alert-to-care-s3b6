package com.philips.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dao.IBedDao;
import com.philips.entity.Bed;
import com.philips.exceptions.BedIdException;
import com.philips.exceptions.BedNotFoundException;

@CrossOrigin
@RestController
public class BedService {
	@Autowired
	private IBedDao dao;
	
	@PostMapping("/addbed")
	public String addBed(@RequestBody Bed bed) throws BedIdException {
		Bed bedFromDb = dao.viewBed(bed.getbId());
		if(bedFromDb != null)
			throw new BedIdException("ID already exists");
		dao.addBed(bed);
		return "Bed Added Successfully";
	}
	
	@GetMapping("/viewAllBed")
	public List<Bed> viewAllBed() {
		return dao.viewBed();
	}
	
	@PutMapping("/editbed")
	public String editBed(@RequestBody Bed bed) throws BedNotFoundException {
		Bed empFromDb = dao.viewBed(bed.getbId());
		if(empFromDb == null)
			throw new BedNotFoundException("Bed Not found for the ID " + bed.getbId());
		dao.editBed(bed);
		 return "Bed Edited Successfully";
	}
	
	@GetMapping("/alert")
	public List<Bed> alert(){
		return dao.alertBeds();
	}
	@PostMapping("/setAlert")
	public String setAlert(@RequestBody Integer bId) {
		Bed bed=dao.viewBed(bId);
		if(bed==null)
			return "bed not found";
		bed.setAlertStatus(true);
		dao.editBed(bed);
		return "alert Set";
	}
	@PostMapping("/resetAlert")
	public String resetAlert(@RequestBody Integer bId) {
		Bed bed=dao.viewBed(bId);
		if(bed==null)
			return "bed not found";
		bed.setAlertStatus(false);
		dao.editBed(bed);
		return "alert Reset";
	}
	@GetMapping("/availableBeds")
	public List<Bed> availableBeds(){
		return dao.availableBeds();
	}
}
