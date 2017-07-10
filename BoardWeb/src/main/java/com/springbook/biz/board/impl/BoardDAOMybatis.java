package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository("BoardDAOMybatis")
public class BoardDAOMybatis extends SqlSessionDaoSupport{
//{
//	@Autowired
//	private SqlSessionTemplate mybatis;
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� insertBoard() ��� ó��");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
//		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� updateBoard() ��� ó��");
		getSqlSession().insert("BoardDAO.updateBoard", vo);
//		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� deleteBoard() ��� ó��");
		getSqlSession().insert("BoardDAO.deleteBoard", vo);
//		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoard() ��� ó��");
		return getSqlSession().selectOne("BoardDAO.getBoard", vo);
//		return mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoardList() ��� ó��");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
//		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}