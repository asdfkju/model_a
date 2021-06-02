package com.model.a.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class googleDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public boolean idCheck( String id ) {
		System.out.println("오지?");
		boolean checkId = false;
		if( sql.selectOne( "Google.idCheck", id ) != null )
			checkId = true;
		return checkId;
	}
	
}
