package com.maha.weatherapp.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.maha.weatherapp.dao.MongoDbRepository;
import com.maha.weatherapp.model.DarkSkyApiResponce;
import com.maha.weatherapp.service.WeatherAPIService;
import com.maha.weatherapp.util.Constants;
import com.maha.weatherapp.util.DarkSkyApiService;
/**
 * @author Maha
 * @version 1.0
 * @since July 30,2019
 * @see It  is service class used for validating the input data and processing the API request as well as invoking the Mongo DB to perform persistent operation
 */
@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {
	private static final Logger logger = LogManager.getLogger(WeatherAPIServiceImpl.class);
	@Autowired
	private MongoDbRepository mongoDBRepo;
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private DarkSkyApiService darkSkyApiService;

	/**
	 * This method is called when only once per city for the day.It will store the DarkSky API Response in Mongo DB database.
	 */
	public DarkSkyApiResponce fetchWeatherDataFromAPI(String city) {
		DarkSkyApiResponce apiResponce = null;
		try {
			
			// Hard coded the latitude and longitude values 
			// These latitude and longitude values can fetch it through Google GeoCode API also. But the GeoCode API are free only for few requests.
			String latitude = null;
			String longitutde = null;

			if (city.equalsIgnoreCase("Campbell")) {
				latitude = "37.2872";
				longitutde = "121.9500";
			} else if (city.equalsIgnoreCase("Omaha")) {
				latitude = "41.2565";
				longitutde = "95.9345";
			} else if (city.equalsIgnoreCase("Austin")) {
				latitude = "30.2672";
				longitutde = "97.7431";
			} else if (city.equalsIgnoreCase("Niseko")) {
				latitude = "42.8048";
				longitutde = "140.6874";
			} else if (city.equalsIgnoreCase("Nara")) {
				latitude = "34.6851";
				longitutde = "135.8048";
			} else if (city.equalsIgnoreCase("Jakarta")) {
				latitude = "6.2088";
				longitutde = "106.8456";
			} else {
				latitude = "";
				longitutde = "";
			}
			// Invoking the DARK SKY API
			if(!(latitude.equals("")&&longitutde.equals(""))) {
				ResponseEntity<DarkSkyApiResponce> responseEntity = darkSkyApiService.callAPI(latitude, longitutde);
				logger.info("Dark API Invocation completed");
				apiResponce = responseEntity.getBody();
				apiResponce.setCity(city);
				apiResponce.setDate(LocalDate.now());
				System.out.println(apiResponce.getCurrently().getTemperature());
				System.out.println(responseEntity.getBody());
				//Below line will insert the data into Mongo DB collection. It will store the entire DarkSky API response along with 2 additional filed City and Date.
				mongoDBRepo.insert(apiResponce);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return apiResponce;
	}

	/**
		This method used to validate weather the data is already exist in Mongo DB collection for entered city.If data found then 
		it will return whole response of the row for given city else it will return null.

	*/	@Override
	public DarkSkyApiResponce validateWeatherDataInMongoDB(String city) {
		DarkSkyApiResponce apiResponce = null;
		try {
			logger.info("validateWeatherDataInMongoDB method");
			Query query = new Query();
			query.addCriteria(
					Criteria.where(Constants.CITY_FILED).is(city).and(Constants.DATE_FILED).is(LocalDate.now()));

			List<DarkSkyApiResponce> list = mongoTemplate.find(query, DarkSkyApiResponce.class);
			for (DarkSkyApiResponce darkApiResponceObj : list) {
				apiResponce = darkApiResponceObj;
				logger.info(
						"City ::" + darkApiResponceObj.getCity() + "\n Longitude" + darkApiResponceObj.getLongitude());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return apiResponce;
	}
}
