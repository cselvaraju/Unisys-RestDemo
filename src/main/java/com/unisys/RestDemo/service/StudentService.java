package com.unisys.RestDemo.service;

import java.util.List;

import com.unisys.RestDemo.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student getStudentById(long id);
}
