package org.cg.chn.employee.service;

import java.util.List;

import org.cg.chn.employee.beans.Employee;
import org.cg.chn.employee.exception.EmployeeException;

public interface EmployeeService {
	
	List<Employee> getAllEmployees() throws EmployeeException;
	List<Employee> addEmployee(Employee emp) throws EmployeeException;
	Employee getEmployeeById(int id) throws EmployeeException;
	List<Employee> deleteEmployee(int id) throws EmployeeException;
	List<Employee> updateEmployee(Employee emp) throws EmployeeException;
	List<Employee> getEmployeeByGender(String gender) throws EmployeeException;
}
