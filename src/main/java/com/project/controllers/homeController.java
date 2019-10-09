package com.project.controllers;


import java.util.List;

/**
 * Controller for all the main menu options
 * @author Cj
 * @since 6/10/2019
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
}
