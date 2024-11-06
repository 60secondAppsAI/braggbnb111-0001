package com.braggbnb111.dao;

import java.util.List;

import com.braggbnb111.dao.GenericDAO;
import com.braggbnb111.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


