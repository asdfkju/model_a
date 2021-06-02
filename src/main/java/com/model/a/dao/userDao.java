package com.model.a.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class userDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public String testDB() {
		return sql.selectOne("User.testDB");
	}
	
}
