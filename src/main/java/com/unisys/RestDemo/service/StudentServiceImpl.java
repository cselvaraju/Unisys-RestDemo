package com.unisys.RestDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unisys.RestDemo.model.Student;
import com.unisys.RestDemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		Optional<Student> s = studentRepository.findById(id);
		Student student = null;
		if (s.isPresent()) {
			student = s.get();
		} else {
			throw new RuntimeException("Resource not found!!");
		}
		return student;
	}

}
