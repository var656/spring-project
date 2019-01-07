package com.accenture.lkm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller {
	
	@RequestMapping(value = {"/", "/", "/default", "/index"}, method = RequestMethod.GET)
	public ModelAndView () {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Accenture - High performance. Delivered");
		mv.addObject("greeting", "Welcome Varun in the world of JEnkins!");
		return mv;
	}
	
}
