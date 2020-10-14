package com.philips.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dto.Bed;

@RestController
public class RestService {
	public static int sqLayoutBeds=5; 
	public static int nextBed=4;
	private Map<Integer, Bed> bedMap = new HashMap<>();
	{
		bedMap.put(1,new Bed(1,1001,"OPD"));
		bedMap.put(2,new Bed(2,1002,"Emergency"));
		bedMap.put(3,new Bed(3,1003,"ICU"));
	}
	
	@GetMapping("/viewBed")
	public ArrayList<Bed> viewAllBed() {
		ArrayList<Bed> lst = new ArrayList<Bed>(bedMap.values());
		return lst;
	}
	@PostMapping("/CreatesquareLayout")
	public String createSquareLayout(@RequestBody int totalBeds){
		sqLayoutBeds=totalBeds;
		return "Layout created with requested beds";
	}
	@PostMapping("/admitToSquareLayout")
	public String admitToSquareLayout(@RequestBody int patId){
		if(nextBed>sqLayoutBeds)
			return "No beds Available";
		bedMap.put(nextBed,new Bed(nextBed,patId,"OPD"));
		nextBed++;
		return "Patient admitted";
	}
	
}
