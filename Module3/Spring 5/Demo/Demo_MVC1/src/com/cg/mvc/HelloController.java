package com.cg.mvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		String today= new Date().toString();
		return new ModelAndView("hello", "todaysDate", today);
	}
	
	@RequestMapping("/hello1")
	public ModelAndView loginPage()
	{
		return new ModelAndView("login");
	}
	
}
