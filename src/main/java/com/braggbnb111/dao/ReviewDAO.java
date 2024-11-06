package com.braggbnb111.dao;

import java.util.List;

import com.braggbnb111.dao.GenericDAO;
import com.braggbnb111.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


