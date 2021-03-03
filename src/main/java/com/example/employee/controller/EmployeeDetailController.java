package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeDetailService;

@RestController
public class EmployeeDetailController {
	
private static final Logger LOG = LoggerFactory.getLogger(EmployeeDetailController.class);
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	
	
	
	@GetMapping("/getemployees")
	public List<Employee> getEmployeeList(){
		LOG.info("entered inside EmployeeDetailController::getEmployeeList");
		List<Employee> emplist = new ArrayList<>();
		emplist = employeeDetailService.getAllEmployee();
		LOG.info("before leaving EmployeeDetailController::getEmployeeList");
		return emplist;
	}
	
	@GetMapping("/getemployeesbyFirstname/{firstname}")
	public Employee getEmployeesByFirstname(@PathVariable("firstname") String firstName){
		LOG.info("entered inside EmployeeDetailController::getEmployeeList");
		Employee emplist = new Employee();
		emplist = employeeDetailService.getEmployeesByFirstname(firstName);
		LOG.info("before leaving EmployeeDetailController::getEmployeeList");
		return emplist;
	}
	
	@GetMapping("/getDept")
	public List<Department> getdepartment() {
		System.out.println(employeeDetailService.getdepartment());
		return employeeDetailService.getdepartment();
		
	}

}
