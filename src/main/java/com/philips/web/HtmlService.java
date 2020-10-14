package com.philips.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlService {
	@RequestMapping(value="html", method = RequestMethod.GET )
	public String startHtml(){
	    return "test.html";
	}  
}
