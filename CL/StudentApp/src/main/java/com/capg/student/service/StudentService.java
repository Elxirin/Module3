package com.capg.student.service;

import java.util.List;

import com.capg.student.beans.Student;
import com.capg.student.exceptions.StudentException;

public interface StudentService {
	
	List<Student> getAllStudents()  throws StudentException;
	List<Student> addStudent(Student st) throws StudentException;
	Student getStudentById(int id) throws StudentException;
	List<Student> deleteStudent(int id)  throws StudentException;
	List<Student> updateStudent(Student st) throws  StudentException;
	List<Student> getStudentByStream(String stream) throws StudentException;

}
