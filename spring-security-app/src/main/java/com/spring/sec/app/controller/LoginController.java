package com.spring.sec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.sec.app.model.UserLoginModel;

@Controller
public class LoginController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView login(UserLoginModel modelObj) {
		System.out.println("-------------LoginController---------------------------------");
		System.out.println("----------------------------------------------");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

}
