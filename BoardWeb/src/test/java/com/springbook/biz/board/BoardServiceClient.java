package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.board.impl.BoardServiceImpl;

public class BoardServiceClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		BoardVO vo = new BoardVO();

//		vo.setTitle("임시제목");
//		vo.setWriter("홍길동");
//		vo.setContent("임시 내용....");
		
//		BoardVO vo1 = new BoardVO();
//		BoardVO vo2 = new BoardVO();
//		BoardVO vo3 = new BoardVO();
//		BoardVO vo4 = new BoardVO();
//		BoardVO vo5 = new BoardVO();
//		vo1.setSeq(3);
//		vo2.setSeq(4);
//		vo3.setSeq(5);
//		vo4.setSeq(6);
//		vo5.setSeq(7);
//		boardService.deleteBoard(vo1);
//		boardService.deleteBoard(vo2);
//		boardService.deleteBoard(vo3);
//		boardService.deleteBoard(vo4);
//		boardService.deleteBoard(vo5);
		
//		boardService.insertBoard(vo);
		
//		List<BoardVO> boardList = boardService.getBoardList(vo);
//		for(BoardVO board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
		
//		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		container.close();
	}
}
