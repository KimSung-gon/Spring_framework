package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {

	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {

		System.out.println("�� ���� ó��");
		
//		String seq = request.getParameter("seq");
//		
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		return "getBoardList.do";
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("getBoardList.do");
//		return mav;
	}

}
