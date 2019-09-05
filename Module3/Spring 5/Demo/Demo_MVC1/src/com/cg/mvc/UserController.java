package com.cg.mvc;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Scope("session")
@Controller
@RequestMapping(value="user")
public class UserController {
	
	ArrayList<String> cityList;
	ArrayList<String> skillList;
	
	@RequestMapping(value="/showRegister")
	public String showRegister(Model model)
	{
		cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Hyd");
		cityList.add("Delhi");
		cityList.add("Punjab");
		
		skillList= new ArrayList<String>();
		skillList.add("Java");
		skillList.add("Python");
		skillList.add("Android");
		skillList.add("Devops");
		
		model.addAttribute("cityList",cityList);
		model.addAttribute("skillList", skillList);
		model.addAttribute("register",new Register());
		
		return "register";
	}
	
	@RequestMapping(value="/successRegister",method=RequestMethod.POST)
	public String successRegister(@ModelAttribute("register") @Valid Register register, BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("cityList",cityList);
			model.addAttribute("skillList", skillList);
			return "register";
		}
		else
		{
		model.addAttribute("register",register);
		return "successReg";
		}
	}
}








