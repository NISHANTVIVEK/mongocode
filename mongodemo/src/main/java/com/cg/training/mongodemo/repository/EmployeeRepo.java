package com.cg.training.mongodemo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.training.mongodemo.bean.Employeeentity;



public interface EmployeeRepo extends MongoRepository<Employeeentity, String>{

}
