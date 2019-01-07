package com.accenture.lkm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/", "/default", "/index"}, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Accenture - High performance. Delivered");
		mv.addObject("greeting", "Welcome in the world of Jenkins!");
		return mv;
	}
	
}
