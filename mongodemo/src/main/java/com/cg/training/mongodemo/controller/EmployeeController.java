package com.cg.training.mongodemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.mongodemo.bean.Employeeentity;
import com.cg.training.mongodemo.service.EmployeeService;





@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	Employeeentity emp;
	@GetMapping("/employee")
	public List<Employeeentity> getAllEmployee()
	{
		return service.getAllEmployee();
	}
@PostMapping("/employee")

public void addEmployee(@RequestBody Employeeentity emp)
{
	service.addEmployee(emp);

}
@DeleteMapping("/employee/{id}")
public void deleteEmployee(@PathVariable("id") String id)

{
	service.deleteEmployee(id);

	
}
@PutMapping("/employee/{id}")
public void updateEmployee(@RequestBody Employeeentity emp , @PathVariable("id") String id)
{
	emp.set_id(id);
	service.updateEmployee(emp);
}
}