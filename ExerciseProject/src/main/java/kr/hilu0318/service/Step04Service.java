package kr.hilu0318.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.hilu0318.dao.Step04DAO;

@Service
public class Step04Service {

	@Inject
	private Step04DAO dao;
		
	public int totalCount() throws Exception {
		return dao.selectTotalCount();
	}
	
	public List<Map> dataListLimitService(int start, int count)throws Exception{
		return dao.selectListLimit(start, count);
	}
}
