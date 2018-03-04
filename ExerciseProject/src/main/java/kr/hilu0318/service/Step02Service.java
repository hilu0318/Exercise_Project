package kr.hilu0318.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.hilu0318.dao.Step02DAO;

@Service
public class Step02Service {

	@Inject
	private Step02DAO dao;
	
	public List<String> selectDatalist() throws Exception{
		return dao.selectDatalist();
	}
}
