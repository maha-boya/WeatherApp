package com.maha.weatherapp.service;

import org.springframework.stereotype.Service;

import com.maha.weatherapp.model.DarkSkyApiResponce;
@Service
public interface WeatherAPIService {
	public DarkSkyApiResponce fetchWeatherDataFromAPI(String city);
	public DarkSkyApiResponce validateWeatherDataInMongoDB(String city);
}
