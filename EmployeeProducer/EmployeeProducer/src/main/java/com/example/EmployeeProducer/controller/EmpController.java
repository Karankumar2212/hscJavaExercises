package com.example.EmployeeProducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeProducer.model.Employee;

@RestController
public class EmpController {
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public Employee getEmp() {
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setName("Bill");
		emp.setSalary(10000);
		return emp;
	}

}
