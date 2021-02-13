package com.studentdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.studentdemo.model.Student;
import com.studentdemo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository studentrepo;

	public List<Student> getAllData() {
		List<Student> listofStudent = (List<Student>) studentrepo.findAll();
		return listofStudent;

	}

	public Student getDataById(int id) {
		return studentrepo.findById(id).get();
	}

	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}
	
	public void delete(int id) {
		studentrepo.deleteById(id);
	}
	
	public void update(Student student) {
		studentrepo.save(student);
	}




}
