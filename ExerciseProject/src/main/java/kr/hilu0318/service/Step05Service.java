package kr.hilu0318.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.hilu0318.dao.Step05DAO;

@Service
public class Step05Service {

	@Inject
	private Step05DAO dao;
	
	public int totalCount() throws Exception {
		return dao.selectTotalCount();
	}
	
	public List<Map> dataListLimitService(int start, int count)throws Exception{
		return dao.selectListLimit(start, count);
	}
}
