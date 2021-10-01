package com.grafana.main.services;
import org.springframework.stereotype.*;

import com.github.javafaker.Faker;
import com.grafana.main.model.Employee;
@Service
public class EmployeeService {
	private Faker faker=new Faker();
	
	public Employee getDefaultEmployee() {
		Employee emp=new Employee();
		emp.setId(faker.dog().name());
		emp.setName(faker.name().fullName());
		emp.setCity(faker.address().fullAddress());
		return emp;
	}
	
}
