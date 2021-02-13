package com.studentdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdemo.model.Student;
import com.studentdemo.model.TestModel;
import com.studentdemo.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepository;

	public List<TestModel> getAllData() {
		List<TestModel> listofTestModel = (List<TestModel>) testRepository.findAll();
		return listofTestModel;

	}

	public TestModel getDataById(String id) {
		return testRepository.findById(id).get();
	}

	public TestModel saveTestModel(TestModel student) {
		return testRepository.save(student);
	}
	
	public void delete(String id) {
		testRepository.deleteById(id);
	}
	
	public void update(TestModel student) {
		testRepository.save(student);
	}

}
