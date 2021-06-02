package com.model.a.service;

import javax.servlet.http.HttpSession;



import org.codehaus.jackson.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.model.a.dao.kakaoDao;
import com.model.a.dto.userDto;

@Service
public class kakaoService {
	
	@Autowired
	private kakaoDao kdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;

	public ModelAndView kakaoJoin( JsonNode profile ) {
		mav = new ModelAndView();
		String id = profile.get( "id" ).asText();
		int result = kdao.kakaoCheck( id );
		if( result > 0 ) {
			userDto user_id = kdao.kakaoLogin( id );
			session.setAttribute( "id", user_id );
			session.setAttribute( "kind", "normal" );
			mav.setViewName( "redirect:/" );
			return mav;
		}
		else {
			mav.addObject( "kind", "normal" );
			mav.addObject( "kakaoid", id );
			mav.setViewName( "redirect:createKakaoMembers" );
			return mav;
		}
	}
	
}
