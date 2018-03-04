package kr.hilu0318.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.hilu0318.command.GeneralDBSession;

@Repository
public class Step03DAO extends GeneralDBSession {

	private static final String namespace = "kr.hilu0318.mapper.Step03.";
	
	public void insertData(String data)throws Exception {
		session.insert(namespace+"insertData", data);
	}
	
	public List<Map> selectList()throws Exception{
		return session.selectList(namespace+"selectList");
	}
}
