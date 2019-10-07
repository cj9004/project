package com.project.model.services.countryPlan;

/**
 * 
 * CountryPlan Class
 * @author Cj
 * @since 7/10/2019
 *
 */
public class CountryPlan {
	
	private String id;
	
	private String idCountry;
	
	private String description; 
	
	private String idPlaceType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdPlaceType() {
		return idPlaceType;
	}

	public void setIdPlaceType(String idPlaceType) {
		this.idPlaceType = idPlaceType;
	}
	

}
