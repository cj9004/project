package com.project.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Controller for all the main menu options
 * @author Cj
 * @since 6/10/2019
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.controllers.utils.PaymentPlanCalculation;
import com.project.controllers.utils.SendMailUtil;
import com.project.model.services.countryPlan.CountryPlan;
import com.project.model.services.countryPlan.CountryPlanFinders;
import com.project.model.services.countryPlan.PaymentPlan;
import com.project.model.services.sales.SalesFinders;


/**
 * Controller for all the main menu options
 * @author Cj
 * @since 7/10/2019
 *
 */
@Controller
public class homeController {
	
	private static final String INDEX_VIEW="index";
	private static final String WELCOME_VIEW="welcome";
	private static final String SALES_VIEW="sales";
	private static final String CONTACT_US_VIEW = "contactUs";
	

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexView() {		
		return INDEX_VIEW;
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcomeView() {
		return WELCOME_VIEW;
	}
	
	@RequestMapping(value="/sales", method=RequestMethod.GET)
	public String salesView(Model model) {
		List<String> salesList = SalesFinders.findAllSales();
		model.addAttribute("salesList", salesList);		
		return SALES_VIEW;
	}
	
	@RequestMapping(value="/contactUs", method=RequestMethod.GET)
	public String contactUsView() {		
		return CONTACT_US_VIEW;
	}
	
	@RequestMapping(value="/contactUs", method=RequestMethod.POST)
	public String contactUs(String email, String subject, String message, Model m) {
		SendMailUtil.send(email, subject, message);
		m.addAttribute("displayModal", true);
		return CONTACT_US_VIEW;
	}
	
	
	
	
}
