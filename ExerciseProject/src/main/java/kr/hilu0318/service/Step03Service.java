package kr.hilu0318.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.hilu0318.dao.Step03DAO;

@Service
public class Step03Service {

	@Inject
	private Step03DAO dao;
	
	public List<Map> selectListService() throws Exception{
		return dao.selectList();
	}
	
	@Transactional
	public List<Map> registerService(String data) throws Exception{
		dao.insertData(data);
		return dao.selectList();
	}
}
