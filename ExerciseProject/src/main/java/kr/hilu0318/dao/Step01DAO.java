package kr.hilu0318.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.hilu0318.command.GeneralDBSession;

@Repository
public class Step01DAO extends GeneralDBSession {

	private static final String namespace = "kr.hilu0318.mapper.Step01.";
	
	public String selectDataOne() throws Exception{
		return session.selectOne(namespace+"selectDataOne");
	}
}
