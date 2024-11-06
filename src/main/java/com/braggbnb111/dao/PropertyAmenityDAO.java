package com.braggbnb111.dao;

import java.util.List;

import com.braggbnb111.dao.GenericDAO;
import com.braggbnb111.domain.PropertyAmenity;





public interface PropertyAmenityDAO extends GenericDAO<PropertyAmenity, Integer> {
  
	List<PropertyAmenity> findAll();
	






}


