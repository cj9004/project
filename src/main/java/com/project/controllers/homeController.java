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



@Controller
public class homeController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexView() {		
		return "index";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcomeView() {
		return "welcome";
	}
	
	@RequestMapping(value="/sales", method=RequestMethod.GET)
	public String salesView(Model model) {
		List<String> salesList = SalesFinders.findAllSales();
		model.addAttribute("salesList", salesList);		
		return "sales";
	}
	
}
