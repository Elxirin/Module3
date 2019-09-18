package com.capg.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.student.beans.Student;
import com.capg.student.exceptions.StudentException;
import com.capg.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudent() throws StudentException {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/students")
	public List<Student> addStudent(@Valid @RequestBody Student st) throws StudentException {
		return studentService.addStudent(st);
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) throws StudentException{
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/students/{id}")
	public List<Student> deleteStudent(@PathVariable int id) throws StudentException {
		return studentService.deleteStudent(id);
	}
	
	@PutMapping("/students/update")
	public List<Student> updateStudent(@RequestBody Student st) throws StudentException {
		return studentService.updateStudent(st);
	}
	
	@GetMapping("/students/stream")
	public List<Student> getStudentByStream(@RequestParam String stream) throws StudentException {
		return studentService.getStudentByStream(stream);
	}
	
}
