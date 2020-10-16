package com.philips.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.philips.dao.IBedDao;
import com.philips.entity.Bed;

@RestController
public class LayoutService {
	@Autowired
	private IBedDao dao;
	
	@GetMapping("/ICU/{nbed}")
	public String createICUlayout(@PathVariable("nbed") int n) {
		for( int i=0;i<n;i++) {
			if(dao.viewBed(101+i)==null)
				dao.addBed(new Bed(101+i,i/2,i%2,"ICU"));
			else
				dao.editBed(new Bed(101+i,i/2,i%2,"ICU"));
		}
		return "ICU created with " + n + " beds";
	}
	
	@GetMapping("/Lshape/{nbed}")
	public String createLshapeLayout(@PathVariable("nbed") int n) {
		for( int i=0;i<n;i++) {
			addBedToLshape(i+1);
		}
		return "L shaped layout created with " + n + " beds";
	}
	
	public void addBedToLshape(int i) {
		int x=0;
		int y=i/2;
		if(i%2==0) {
			x=i/2;
			y=0;
		}
		if(dao.viewBed(200+i)==null)
			dao.addBed(new Bed(200+i,x,y,"Lshape"));
		else
			dao.editBed(new Bed(200+i,x,y,"Lshape"));
	}
}
