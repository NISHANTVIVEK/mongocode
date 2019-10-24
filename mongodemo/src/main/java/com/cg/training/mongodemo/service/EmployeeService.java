package com.cg.training.mongodemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.mongodemo.bean.Employeeentity;
import com.cg.training.mongodemo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo repo;


	
	public List<Employeeentity> getAllEmployee()
	{
		return repo.findAll();
	
	}


public void addEmployee(Employeeentity emp)
{
	repo.insert(emp);
	//return "inserted";
}

public void deleteEmployee(String id)

{
	repo.deleteById(id);
	 //return "delete";
	
}
public void updateEmployee(Employeeentity emp)
{
	repo.save(emp);
}

}
