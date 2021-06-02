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

	public ModelAndView kakaoJoin( String kakao_id ) {
		mav = new ModelAndView();
		int result = kdao.kakaoCheck( kakao_id );
		if( result > 0 ) {
			userDto user_id = kdao.kakaoLogin( kakao_id );
			session.setAttribute( "kind", "normal" );
			session.setAttribute( "id", user_id );
			mav.setViewName( "redirect:/" );
			return mav;
		}
		else {
			mav.addObject( "kind", "normal" );
			mav.addObject( "kakao_id", kakao_id );
			mav.setViewName( "redirect:/joinForm" );
			return mav;
		}
	}
}
