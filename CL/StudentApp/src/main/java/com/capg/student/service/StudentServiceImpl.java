package com.capg.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.student.beans.Student;
import com.capg.student.dao.StudentRepository;
import com.capg.student.exceptions.StudentException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() throws StudentException {
		try {
			return studentRepository.findAll();
		} catch (Exception e) {
			throw new StudentException(e.getMessage());
		}
	}

	@Override
	public List<Student> addStudent(Student st) throws StudentException {
		if(studentRepository.existsById(st.getId())) {
			throw new StudentException("Student with id "+st.getId()+" already existing");
			
		}
		else {
			studentRepository.save(st);
			return getAllStudents();
		}
	}

	@Override
	public Student getStudentById(int id) throws StudentException {
		if(!studentRepository.existsById(id)) {
			throw new StudentException("Student with id "+id+" does not exists");
		}
		else {
			return studentRepository.findById(id).get();
		}
	}

	@Override
	public List<Student> deleteStudent(int id) throws StudentException {
		if(!studentRepository.existsById(id)) {
			throw new StudentException("Student with id "+id+" does not exists");
		}
		else {
			studentRepository.deleteById(id);
			return getAllStudents();
		}
	}

	@Override
	public List<Student> updateStudent(Student st) throws StudentException {
		if(!studentRepository.existsById(st.getId())) {
			throw new StudentException("Student with id "+st.getId()+" does not exists");
		}
		else {
			studentRepository.save(st);
			return getAllStudents();
		}
	}

	@Override
	public List<Student> getStudentByStream(String stream) throws StudentException {
		return studentRepository.findStudentByStream(stream);
	}

}
