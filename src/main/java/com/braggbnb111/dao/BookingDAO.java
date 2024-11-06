package com.braggbnb111.dao;

import java.util.List;

import com.braggbnb111.dao.GenericDAO;
import com.braggbnb111.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


