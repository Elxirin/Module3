package org.cg.chn.employee.dao;

import java.util.List;

import org.cg.chn.employee.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("from Employee where gender=:gender")
	List<Employee> findEmployeeByGender(@Param("gender") String gender);
}
