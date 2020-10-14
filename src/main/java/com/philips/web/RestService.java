package com.philips.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date(); 
	private Map<Integer, Bed> bedMap = new HashMap<>();
	{  
		bedMap.put(1,new Bed(1,1001,formatter.format(date)));
		bedMap.put(2,new Bed(2,1002,formatter.format(date)));
		bedMap.put(3,new Bed(3,1003,formatter.format(date)));
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
		date = new Date();
		if(nextBed>sqLayoutBeds)
			return "No beds Available";
		bedMap.put(nextBed,new Bed(nextBed,patId,formatter.format(date)));
		nextBed++;
		return "Patient admitted";
	}
	
	@GetMapping("/alert")
	public ArrayList<Bed> alert(){
		ArrayList<Bed> lst = new ArrayList<Bed>();
		for(Map.Entry<Integer,Bed> entry : bedMap.entrySet())
			if(entry.getValue().isAlertStatus())
				lst.add(entry.getValue());
		return lst;
	}
	@PostMapping("/setAlert")
	public String setAlert(@RequestBody int bId) {
		bedMap.get(bId).setAlertStatus(true);
		return "alert Set";
	}
	@PostMapping("/resetAlert")
	public String resetAlert(@RequestBody int bId) {
		Bed b= bedMap.get(bId);
		b.setAlertStatus(false);
		return "alert Reset";
	}
}
