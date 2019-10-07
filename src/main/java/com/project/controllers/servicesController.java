package com.project.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.model.services.country.CountryFinders;
import com.project.model.services.placeType.PlaceTypeFinders;


/**
 * 
 * Controller for all 
 * the services pages
 * @author Cj
 * @since 6/10/2019
 *
 */
@Controller
public class servicesController {
	
	@RequestMapping(value="/destinations", method=RequestMethod.GET)
	public String destinationServices(Model m) {	
		List<String> listcountry = CountryFinders.findAllCountries();
		List<String> listTypePlace = PlaceTypeFinders.findAllPlaceType();
		m.addAttribute("list", listcountry);
		m.addAttribute("listTypePlace", listTypePlace);
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
