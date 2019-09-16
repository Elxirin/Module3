package org.cg.chn.employee.controller;

import java.util.List;

import org.cg.chn.employee.beans.Employee;
import org.cg.chn.employee.exception.EmployeeException;
import org.cg.chn.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() throws EmployeeException {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) throws EmployeeException {
		return employeeService.getEmployeeById(id);
	}
	
	//@RequestMapping(value="/employees", method = RequestMethod.POST)
	@PostMapping("/employees")
	public List<Employee> addEmployee(@RequestBody Employee emp) throws EmployeeException {
		return employeeService.addEmployee(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id) throws EmployeeException {
		return employeeService.deleteEmployee(id);
	}
	
	
}
