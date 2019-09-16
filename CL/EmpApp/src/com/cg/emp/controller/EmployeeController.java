package com.cg.emp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.service.EmployeeService;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "greet";
	}
	
	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv;
		
		try {
			List<Employee>  employees = employeeService.getAllEmployees();
			mv = new ModelAndView("index");
			mv.addObject("employees", employees);
		} catch (EmployeeException e) {
			mv = new ModelAndView("error");
			mv.addObject("error", e);
		}
		
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		ModelAndView mv;
		try {
			List<Employee>  employees = employeeService.deleteEmployee(id);
			mv = new ModelAndView("index");
			mv.addObject("employees", employees);
		} catch (EmployeeException e) {
			mv = new ModelAndView("error");
			mv.addObject("error", e);
		}
		
		return mv;
	}
	
	
	@RequestMapping("/addEmployee")
	public String showAddForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "add";
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute(employee);
			return new ModelAndView("add");
		}
		
		ModelAndView mv;
		try {
			List<Employee> employees = employeeService.addEmployee(employee);
			mv = new ModelAndView("index");
			mv.addObject("employees", employees);
		} catch (EmployeeException e) {
			mv = new ModelAndView("error");
			mv.addObject("error", e);
		}
		
		return mv;
	}
	
	
}
