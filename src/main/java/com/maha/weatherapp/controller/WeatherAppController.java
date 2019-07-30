package com.maha.weatherapp.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maha.weatherapp.model.DarkSkyApiResponce;
import com.maha.weatherapp.model.SearchPojo;
import com.maha.weatherapp.service.WeatherAPIService;
/**
 * @author Maha
 * @version 1.0
 * @since July 30,2019
 * @see It is Controller Class to process the Weather Page requests, Process the
 *      requets and finally send the reponce to Html Page
 */
@Controller
public class WeatherAppController {
	
	private static final Logger logger = LogManager.getLogger(WeatherAppController.class);
	@Autowired
	private WeatherAPIService weatherAPIService;

	@GetMapping
	public String index() {
		return "redirect:/weather";
	}

	@GetMapping("/weather")
	public String getCustomer(Model model) {
		model.addAttribute("searchPojo", new SearchPojo());
		logger.info("Welcome To Index HTML");
		return "search.html";
	}

	@PostMapping("/findweather")
	public ModelAndView searchCity(@Valid SearchPojo model,BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			 if (bindingResult.hasErrors()) {
				 modelAndView.setViewName("search.html");
		            return modelAndView;
		     }
			logger.info("method ->searchCity :: Request Mapping-> findweather ::" + model.getSearchCity());
			String cityName = model.getSearchCity();
			DarkSkyApiResponce apiResponce = weatherAPIService.validateWeatherDataInMongoDB(cityName);
			if (apiResponce == null) {
				apiResponce = weatherAPIService.fetchWeatherDataFromAPI(cityName);
			}
			if (apiResponce != null)
				modelAndView.addObject("weatherdata", apiResponce);
			
			modelAndView.setViewName("weatherresult.html");
		}catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return modelAndView;
	}
}
