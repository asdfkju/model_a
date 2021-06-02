package com.model.a.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.a.util.kakaoApi;


@Controller
public class kakaoController {

	private ModelAndView mav;
	
	@Autowired
	HttpSession session;
	
	
	@RequestMapping(value = "/createUserByKakao", method = RequestMethod.GET)
	public ModelAndView createUserByKakao() {
		String kakao_Url= kakaoApi.getAuthorizationUrl(session);
		mav=new ModelAndView();
		mav.addObject("kakao_url",kakao_Url);
		mav.setViewName("kakao/createUser");
		return 	mav;
	}
}
