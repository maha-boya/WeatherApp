package com.maha.weatherapp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maha.weatherapp.model.DarkSkyAPIRequestLog;

public interface MongoDBApiReqRepo extends MongoRepository<DarkSkyAPIRequestLog, Integer>{

}
