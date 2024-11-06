package com.braggbnb111.dao;

import java.util.List;

import com.braggbnb111.dao.GenericDAO;
import com.braggbnb111.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


