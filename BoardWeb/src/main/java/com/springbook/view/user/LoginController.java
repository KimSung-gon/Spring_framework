package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController{

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		
		System.out.println("�α��� ó��");
		
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("���̵�� �ݵ�� �Է��ؾ� �մϴ�.");
		}
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		
//		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
//		ModelAndView mav = new ModelAndView();
		if(user != null) {
//			mav.setViewName("getBoardList.do");
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		} else {
//			mav.setViewName("login.jsp");
			return "login.jsp";
		}
//		return mav;
	}
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginPage(@ModelAttribute("user")UserVO vo) {
		
		System.out.println("�α��� ȭ�������̵�");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}

}
