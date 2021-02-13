package com.studentdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentdemo.model.Department;
import com.studentdemo.model.Student;
import com.studentdemo.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepo;

	public List<Department> getAllData(){
		List<Department> listofdepartment=(List<Department>) departmentrepo.findAll();
		return listofdepartment;
		
	}
	
	public Department getDataById(int id) {
		return departmentrepo.findById(id).get();
	}

	public Department save(Department department) {
		return departmentrepo.save(department);
	}
	
	public void delete(int id) {
		departmentrepo.deleteById(id);
	}
	
	public void update(Department department,int id) {
		departmentrepo.save(department);
	}

	
	
}
