package com.project.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.controllers.utils.PaymentPlanCalculation;
import com.project.model.services.country.Country;
import com.project.model.services.country.CountryFinders;
import com.project.model.services.countryPlan.CountryPlan;
import com.project.model.services.countryPlan.CountryPlanFinders;
import com.project.model.services.countryPlan.PaymentPlan;
import com.project.model.services.placeType.PlaceType;
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
	
	private static final String DESTINATIONS_VIEW="destinations";
	private static final String SAVE_PLAN_VIEW="savePlan";
	
	@RequestMapping(value="/destinations", method=RequestMethod.GET)
	public String destinationServices(Model m) {	
		ArrayList<Country> listcountry = CountryFinders.findAllCountries();
		ArrayList<PlaceType> listTypePlace = PlaceTypeFinders.findAllPlaceType();
		m.addAttribute("list", listcountry);
		m.addAttribute("listTypePlace", listTypePlace);
		return DESTINATIONS_VIEW;
	}
	
		
	@RequestMapping(value="/savePlan", method=RequestMethod.GET)
	public String savePlan(Model m) {
		ArrayList<CountryPlan> listCountryPlan = (ArrayList<CountryPlan>) CountryPlanFinders.finAll();
		m.addAttribute("listPlan", listCountryPlan);
		return SAVE_PLAN_VIEW;
	}
	
	@RequestMapping(value="/destinations", method=RequestMethod.POST)
	public String  searchVacations(String origin, String destination, String type, Model m) {
		ArrayList<CountryPlan> listCountryPlan = (ArrayList<CountryPlan>) CountryPlanFinders.finByOriginDestinationType(origin, destination, type);
		ArrayList<Country> listCountry = CountryFinders.findAllCountries();
		String message = "";
		if(listCountryPlan.isEmpty()) {
			message = "We don't have touristic plans for the search criteria selected.";
		}
		ArrayList<PlaceType> listTypePlace = PlaceTypeFinders.findAllPlaceType();		
		m.addAttribute("countryPlan", listCountryPlan);		
		m.addAttribute("list", listCountry);
		m.addAttribute("listTypePlace", listTypePlace);
		m.addAttribute("message", message);
		return DESTINATIONS_VIEW;
	}
	
	@RequestMapping(value="/calculatePlan", method=RequestMethod.POST)
	public String calculatePlan(Integer months, Integer people, String plan, Model m) {
		PaymentPlan paymentPlan = PaymentPlanCalculation.calculateAmount(months, people, plan);
		String paymentMessage = getPaymentInformation(paymentPlan);
		ArrayList<CountryPlan> listCountryPlan = (ArrayList<CountryPlan>) CountryPlanFinders.finAll();
		m.addAttribute("listPlan", listCountryPlan);
		m.addAttribute("paymentPlan", paymentMessage);
		return SAVE_PLAN_VIEW;
	}


	/**
	 * Create the Payment plan message
	 * @param paymentPlan
	 * @return
	 */
	private String getPaymentInformation(PaymentPlan paymentPlan) {
		String message = "";
		if(paymentPlan != null) {
			message = "Plan Description: " + paymentPlan.getPlan().getDescription() + " <BR> Monthly Amount(CAD): " + paymentPlan.getValueMonth() +
					"<BR> Months: " + paymentPlan.getMonths();
		}
		return message;
	}

}
