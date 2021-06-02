package com.model.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.a.dao.userDao;

@Service
public class userService {

	@Autowired
	userDao udao;
	
	public String testDB() {
		String test = udao.testDB();
		return test;
	}
}
