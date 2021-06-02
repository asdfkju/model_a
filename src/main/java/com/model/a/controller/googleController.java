package com.model.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.model.a.service.googleService;


@Controller
public class googleController {

	@Autowired
	private googleService gService;
	
	private ModelAndView mav;
	
	@RequestMapping( value="/google/checkId", method=RequestMethod.GET )	   
	private ModelAndView googleApiLogin( @RequestParam( "google_id" ) String google_id ) {		 
		mav = new ModelAndView();
		System.out.println( "google id : " + google_id );
		boolean idCheck = gService.idCheck( google_id );
		if( idCheck ) {
			mav.setViewName("home");
		}
		else {
			mav.addObject("kind", "nomal");
			mav.addObject("google_id", google_id);
			mav.setViewName("user/joinForm");
		}
		return mav;
	 }
}
