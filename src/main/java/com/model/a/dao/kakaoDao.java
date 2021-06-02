package com.model.a.dao;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.a.dto.userDto;

@Repository
public class kakaoDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public userDto kakaoLogin(String id) {
		return sql.selectOne("Kakao.kakaoLogin", id);
	}

	public int kakaoCheck(String id) {
		return sql.selectOne("Kakao.kakaoCheck", id);
	}
}
