package com.studentdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentdemo.model.TestModel;

@Repository
public interface TestRepository extends CrudRepository<TestModel,String> {

}
