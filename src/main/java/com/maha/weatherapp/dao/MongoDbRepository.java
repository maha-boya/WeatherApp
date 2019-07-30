package com.maha.weatherapp.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maha.weatherapp.model.DarkSkyApiResponce;

@Repository
public interface MongoDbRepository extends MongoRepository<DarkSkyApiResponce, Integer> {

}