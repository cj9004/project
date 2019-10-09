package com.project.controllers.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import com.project.model.services.countryPlan.CountryPlan;
import com.project.model.services.countryPlan.CountryPlanFinders;
import com.project.model.services.countryPlan.PaymentPlan;

public class PaymentPlanCalculation {

	/**
	 * 
	 * @param amount
	 * @param months
	 * @param quantity
	 * @param planId
	 * @return the PaymentPlan with all the information for the plan
	 */
	public static PaymentPlan calculateAmount(long months, long quantity, String planId){
		CountryPlan countryPlan = CountryPlanFinders.findById(planId);
		long amount = countryPlan.getPrice();
		float moneyMonth = 0;
		if(amount> 0 && months > 0 && quantity > 0){
			long total = amount * quantity;
			moneyMonth = total/months;
		}
		PaymentPlan paymentPlan = new PaymentPlan(countryPlan, months, moneyMonth);
		return paymentPlan;
	}	
	
}
