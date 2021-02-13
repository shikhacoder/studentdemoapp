package com.studentdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentdemo.model.Student;
import com.studentdemo.model.TestModel;
import com.studentdemo.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public List<TestModel> getAllStudent() {
		return testService.getAllData();
	}
	
	@PostMapping("/testCreate")
	public TestModel createStudent(@RequestBody TestModel testModel) {
		return testService.saveTestModel(testModel);
	
	}
}
