//package com.springbook.view.board;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class InsertBoardController {
//
//	@RequestMapping(value="/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//
//		System.out.println("글 등록 처리");
//		
////		String title = request.getParameter("title");
////		String writer = request.getParameter("writer");
////		String content = request.getParameter("content");
////		
////		BoardVO vo = new BoardVO();
////		vo.setTitle(title);
////		vo.setWriter(writer);
////		vo.setContent(content);
//		
//		//BoardDAO boardDAO = new BoardDAO();
//		boardDAO.insertBoard(vo);
//		
//		return "getBoardList.do";
//		
////		ModelAndView mav = new ModelAndView();
////		mav.setViewName("getBoardList.do");
////		return mav;
//	}
//
//	
//}
