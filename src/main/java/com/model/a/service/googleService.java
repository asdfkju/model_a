package com.model.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.model.a.dao.googleDao;

@Service	
public class googleService {

	private ModelAndView mav;

	@Autowired
	private googleDao gdao;
	
	public boolean idCheck(String google_id) {
		boolean idCheck = gdao.idCheck( google_id );
		return idCheck;
	}
	
	
}
