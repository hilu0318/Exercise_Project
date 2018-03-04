package kr.hilu0318.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.hilu0318.dao.Step01DAO;

@Service
public class Step01Service {

	@Inject
	private Step01DAO dao;
	
	public String selectDataOne() throws Exception{
		return dao.selectDataOne();
	}
}
