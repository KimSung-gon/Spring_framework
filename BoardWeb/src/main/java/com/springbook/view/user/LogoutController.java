package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController{

	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) {

		System.out.println("�α׾ƿ� ó��");
		
//		HttpSession session = request.getSession();
		session.invalidate();
//		
		return "login.jsp";
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("login.jsp");
//		return mav;
	}

}
