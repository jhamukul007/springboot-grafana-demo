package com.grafana.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grafana.main.model.Employee;
import com.grafana.main.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path ="/data" ,produces = "application/json")
	public ResponseEntity<Employee> getEmployee(){
		return new ResponseEntity<Employee>(employeeService.getDefaultEmployee(),HttpStatus.OK);
	}
}
