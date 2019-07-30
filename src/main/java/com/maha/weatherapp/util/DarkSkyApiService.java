package com.maha.weatherapp.util;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.maha.weatherapp.dao.MongoDBApiReqRepo;
import com.maha.weatherapp.model.DarkSkyAPIRequestLog;
import com.maha.weatherapp.model.DarkSkyApiResponce;

/**
 * @author Maha
 * @version 1.0
 * @since July 30,2019
 * @see This class is used for invoking the DARK SKY API service.
 */
@Component
public class DarkSkyApiService {
	private static final Logger logger = LogManager.getLogger(DarkSkyApiService.class);
	@Autowired
	private Environment env;
	@Autowired
	private MongoDBApiReqRepo mongoDBRepo;

	public ResponseEntity<DarkSkyApiResponce> callAPI(String latitude,String longitutde) {
		ResponseEntity<DarkSkyApiResponce> responseEntity =null;
		try {
			DarkSkyAPIRequestLog reqLogObj=new DarkSkyAPIRequestLog();
			reqLogObj.setLatitude(latitude);
			reqLogObj.setLogitude(longitutde);
			reqLogObj.setDate(LocalDateTime.now());
			mongoDBRepo.insert(reqLogObj);
			//forming the DARK API URL ,By reading the URL from Properties file.
			String apiURL = env.getProperty(Constants.DARK_SKY_API_URL) + env.getProperty(Constants.DARK_SKY_API_SECRET) + "/" + latitude+ "," + longitutde;
			logger.info("Before Dark API Invocation");
			RestTemplate restTemplate = new RestTemplate();
			responseEntity = restTemplate.getForEntity(apiURL, DarkSkyApiResponce.class);
			logger.info("Dark API Invocation completed");
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		
		return responseEntity;
	}
}
