package com.studentdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentdemo.model.Department;
import com.studentdemo.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	private DepartmentService departmentservice;

	@GetMapping("/all-department-data")
	public List<Department> getAllStudent() {
		return departmentservice.getAllData();

	}
	
	@GetMapping("/department-data-by-id")
	public Department getDepartment(@PathVariable("id") int id) {
		return departmentservice.getDataById(id);
	}

	
	@DeleteMapping("/delete-department")
	public void deleteDepartment(@PathVariable("id") int id) {
		departmentservice.delete(id);
	}
	
	@PostMapping("/save-department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentservice.save(department);
	}
	
	@PutMapping("/update-department")
	public Department update(@RequestBody Department department) {
		departmentservice.save(department);
		return department;
	}



}
