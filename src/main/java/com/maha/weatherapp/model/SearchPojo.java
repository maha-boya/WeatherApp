package com.maha.weatherapp.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SearchPojo {
	@NotNull
	@NotEmpty(message = "City Should not be empty")
	private String searchCity;

	public String getSearchCity() {
		return searchCity;
	}

	public void setSearchCity(String searchCity) {
		this.searchCity = searchCity;
	}
	
}
