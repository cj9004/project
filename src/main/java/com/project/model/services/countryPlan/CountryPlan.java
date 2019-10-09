package com.project.model.services.countryPlan;

import com.project.model.services.country.Country;
import com.project.model.services.placeType.PlaceType;

/**
 * 
 * CountryPlan Class
 * @author Cj
 * @since 7/10/2019
 *
 */
public class CountryPlan {
	
	private String id;
	
	private Country countryOrigin;

	private Country countryDestination;
	
	private String description; 
	
	private PlaceType placeType;
	
	private long price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Country getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(Country country) {
		this.countryOrigin = country;
	}

	public PlaceType getPlaceType() {
		return placeType;
	}

	public void setPlaceType(PlaceType placeType) {
		this.placeType = placeType;
	}

	public Country getCountryDestination() {
		return countryDestination;
	}

	public void setCountryDestination(Country countryDestination) {
		this.countryDestination = countryDestination;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}



	
	

}
