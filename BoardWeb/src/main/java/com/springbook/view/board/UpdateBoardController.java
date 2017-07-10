//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class UpdateBoardController{
//
//	@RequestMapping(value="/updateBoard.do")
//	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//
//		System.out.println("글 수정 처리");
//		
////		String title = request.getParameter("title");
////		String content = request.getParameter("content");
////		String seq = request.getParameter("seq");
////		
////		BoardVO vo = new BoardVO();
////		vo.setTitle(title);
////		vo.setContent(content);
////		vo.setSeq(Integer.parseInt(seq.trim()));
////		
////		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.updateBoard(vo);
//		
//		return "getBoardList.do";
//		
////		ModelAndView mav = new ModelAndView();
////		mav.setViewName("getBoardList.do");
////		return mav;
//	}
//
//}
