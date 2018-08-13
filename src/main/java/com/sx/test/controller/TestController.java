package com.sx.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sx.test.service.TestService;

@Controller
public class TestController {
	@Resource(name = "testService")
	TestService testService;

	@RequestMapping("/listCategory.do")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		// 放入jsp路径
		mav.setViewName(testService.test());
		System.out.println(testService.getCount());
		return mav;
	}

}
