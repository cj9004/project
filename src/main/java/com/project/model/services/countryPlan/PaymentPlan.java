package com.project.model.services.countryPlan;

/**
 * PaymentPlan Non-persistent class
 * @author Cj
 * @since 8/10/2019
 *
 */
public class PaymentPlan {
	
	private long months;
	
	private CountryPlan plan;
	
	private float valueMonth;

	
	public PaymentPlan(CountryPlan plan, long months, float valueMonth) {
		this.months = months;
		this.plan = plan;
		this.valueMonth = valueMonth;
	}
	
	public CountryPlan getPlan() {
		return plan;
	}

	public void setPlan(CountryPlan plan) {
		this.plan = plan;
	}

	public long getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public float getValueMonth() {
		return valueMonth;
	}

	public void setValueMonth(float valueMonth) {
		this.valueMonth = valueMonth;
	}

	}
