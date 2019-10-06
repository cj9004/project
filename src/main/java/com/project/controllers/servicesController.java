package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class servicesController {
	
	@RequestMapping(value="/destinations", method=RequestMethod.GET)
	public String destinationServices() {		
		return "destinations";
	}
	
	@RequestMapping(value="/estimations", method=RequestMethod.GET)
	public String estimationsServices() {		
		return "estimations";
	}
	
	@RequestMapping(value="/savePlan", method=RequestMethod.GET)
	public String savePlan() {		
		return "savePlan";
	}

}
