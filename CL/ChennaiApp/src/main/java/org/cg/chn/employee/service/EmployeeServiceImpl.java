package org.cg.chn.employee.service;

import java.util.List;
import java.util.Optional;

import org.cg.chn.employee.beans.Employee;
import org.cg.chn.employee.dao.EmployeeRepository;
import org.cg.chn.employee.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			return employeeRepo.findAll();
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> addEmployee(Employee emp) throws EmployeeException {
		if(employeeRepo.existsById(emp.getId())) {
			throw new EmployeeException("Employee with id " + emp.getId() +" already existing");
		}
		else {
			employeeRepo.save(emp);
			return getAllEmployees();
		}
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		
		/*
		 * Optional<Employee> o = employeeRepo.findById(id); if(!o.isPresent()) { throw
		 * new EmployeeException("Employee with "+id+"Id does not exist"); }
		 */
		
		
		if(!employeeRepo.existsById(id)) {
			throw new EmployeeException("Employee with "+id+"Id does not exist");
		}else
		return employeeRepo.findById(id).get();
	}

	@Override
	public List<Employee> deleteEmployee(int id) throws EmployeeException {
		if(!employeeRepo.existsById(id)) {
			throw new EmployeeException("Employee with id " + id +" does not exists");
		}
		else {
			employeeRepo.deleteById(id);
			return getAllEmployees();
		}
	
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) throws EmployeeException {
		if(!employeeRepo.existsById(emp.getId())) {
			throw new EmployeeException("Employee with id " + emp.getId() +" does not exists");
		}
		else {
			employeeRepo.save(emp);
			return getAllEmployees();
		}
	}

	@Override
	public List<Employee> getEmployeeByGender(String gender) throws EmployeeException {
		
		return employeeRepo.findEmployeeByGender(gender);
	}

}
