package com.studentdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentdemo.model.Student;
import com.studentdemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/all-student-data")
	public List<Student> getAllStudent() {
		return studentService.getAllData();

	}

	@GetMapping("/student-data-by-id")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getDataById(id);
	}

	@DeleteMapping("/delete-student")
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.delete(id);
	}

	@PostMapping("/create-student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	
	}

	@PutMapping("/update-student")
	public Student update(@RequestBody Student student) {
		studentService.update(student);
		return student;
	}

}
