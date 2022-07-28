package com.unisys.RestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.RestDemo.model.Student;
import com.unisys.RestDemo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentService studentService;
	
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping()
	public List<Student> getAllStudents() {
		List<Student> students = studentService.getAllStudents();
		System.out.println("======================");
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println("======================");
		return students;
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") long id) {
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
	}

}
