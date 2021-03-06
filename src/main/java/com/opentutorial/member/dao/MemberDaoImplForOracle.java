package com.opentutorial.member.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.opentutorial.member.vo.MemberVO;

public class MemberDaoImplForOracle extends SqlSessionDaoSupport implements MemberDao{
	
	@Override
	public MemberVO selectMember(MemberVO memberVO) {
		return getSqlSession().selectOne("MemberDao.selectMember", memberVO);
	}

	@Override
	public int insertMember(MemberVO memberVO) {
		return getSqlSession().insert("MemberDAO.insertMember",memberVO);


	}

}
