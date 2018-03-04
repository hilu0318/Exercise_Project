package kr.hilu0318.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.hilu0318.command.GeneralDBSession;

@Repository
public class Step04DAO extends GeneralDBSession {

	private static final String namespace = "kr.hilu0318.mapper.Step04.";
	
	public int selectTotalCount()throws Exception{
		return session.selectOne(namespace+"selectTotalCount");
	}
	
	public List<Map> selectListLimit(int start, int count)throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("count", count);
		return session.selectList(namespace+"selectListLimit", map);
	}
}
