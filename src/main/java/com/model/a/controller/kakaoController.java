package com.model.a.controller;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.model.a.service.kakaoService;
import com.model.a.util.kakaoApi;


@Controller
public class kakaoController {

	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private kakaoService kService;
	
	
	@RequestMapping(value = "/kakao/join/getCode", method = RequestMethod.GET)
	public ModelAndView getCodeToJoin() {
		String kakao_Url = kakaoApi.getAuthorizationUrl();
		mav = new ModelAndView();
		System.out.println( "kakao_url : " + kakao_Url );
		mav.addObject( "kakao_url",kakao_Url );
		mav.setViewName( "kakao/getJoinCode" );
		return mav;
	}
	
	@RequestMapping(value = "/kakao/join/getToken", method = RequestMethod.GET)
	public ModelAndView getTokenToJoin( @RequestParam("code") String code ) {
		mav = new ModelAndView();
		JsonNode token = kakaoApi.getAccessToken( code );
		JsonNode profile =kakaoApi.getKakaoUserInfo( token.path( "access_token" ) );
		mav = kService.kakaoJoin( profile.get("id").asText() );
		return mav;
	}
}
