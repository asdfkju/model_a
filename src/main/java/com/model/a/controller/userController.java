package com.model.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.a.service.userService;

@Controller
public class userController {
	
	@Autowired
	userService uService;
	
	private static ModelAndView mav;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String home() {
			String test = uService.testDB();
			System.out.println(test + " 값은? ");
		return "home";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET )
	public ModelAndView goJoinForm( @RequestParam( "kind" ) String kind) {
		mav = new ModelAndView();
		mav.addObject( "kind", kind );
		mav.setViewName( "user/joinForm" );
		return mav;
	}
	
	@RequestMapping(value = "/choiceJoinType", method = RequestMethod.GET )
	public String goChoiceJoinType() {
		return "user/choiceJoinType";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET )
	public String goLoginForm() {
		return "user/loginForm";
	}
}
