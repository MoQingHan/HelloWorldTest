package com.sx.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sx.test.pojo.Test;
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
	
	@RequestMapping("/zsbh.do")
	public ModelAndView getAllZsbh(){
		ModelAndView mav = new ModelAndView();
		// 放入jsp路径
		mav.setViewName(testService.test());
		List<Test>list=testService.getALlData();
		for (Test test : list) {
			System.out.println(test);
		}
		return mav;
	}
}
