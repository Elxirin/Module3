package com.cg.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	Login login;
	
	@RequestMapping("/loginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("login",login);
		return "login";
	}
	
	@RequestMapping("/showPage")
	public String showPage(Login login)
	{
		if(login.getUserName().equals("Ishaque"))
		{
		return "success";
		}
		else
		return "login";
	}
	
	@RequestMapping("/showData")
	public String loginData(@RequestParam("uname") String username,
							@RequestParam("pwd") String password, Model model)
	{
		model.addAttribute("uname", username);
		model.addAttribute("pwd", password);
		return "success";
	}
}
