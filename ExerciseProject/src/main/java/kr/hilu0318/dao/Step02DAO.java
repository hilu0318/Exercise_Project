package kr.hilu0318.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.hilu0318.command.GeneralDBSession;

@Repository
public class Step02DAO extends GeneralDBSession {

	private static final String namespace = "kr.hilu0318.mapper.Step02.";
	
	public List<String> selectDatalist() throws Exception{
		return session.selectList(namespace+"selectDatalist");
	}
}
