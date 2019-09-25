package com.bit.day05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class Ex01Controller implements Controller {

	@Override
	@RequestMapping("/ex01") //url과 연결짓는것 - 매핑
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("ex01"); //view에 들어가는 파일
		return mav;
	}

}
