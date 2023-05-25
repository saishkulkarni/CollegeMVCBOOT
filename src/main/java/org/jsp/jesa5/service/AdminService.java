package org.jsp.jesa5.service;

import org.jsp.jesa5.helper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminService {

	@Autowired
	Login login;
	
	public ModelAndView load() {
		ModelAndView view = new ModelAndView("AdminLogin");
		view.addObject("login",login);
		return view;
	}

	public ModelAndView login(Login login, HttpSession session) {
		ModelAndView view=new ModelAndView();
		if(login.getEmail().equals("admin"))
		{
			if(login.getPassword().equals("admin"))
			{
				session.setAttribute("admin", "admin");
				view.setViewName("Home");
				view.addObject("msg","Login Success");
			}
			else {
				view.setViewName("AdminLogin");
				view.addObject("login",login);
				view.addObject("msg","Password Wrong");
			}
		}
		else {
			view.setViewName("AdminLogin");
			view.addObject("login",login);
			view.addObject("msg","Email Wrong");
		}
		return view;
	}

}
