package com.studentdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentdemo.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {

}
