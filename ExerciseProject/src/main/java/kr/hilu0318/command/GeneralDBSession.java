package kr.hilu0318.command;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class GeneralDBSession {

	@Inject
	protected SqlSession session;
}
