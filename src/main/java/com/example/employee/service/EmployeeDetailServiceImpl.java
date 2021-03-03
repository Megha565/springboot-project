package com.example.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.example.employee.repository.DepartmentRepository;
import com.example.employee.repository.EmployeeDetailRepository;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

	@Autowired
	EmployeeDetailRepository employeeDetailRepository;
	
	@Autowired
	DepartmentRepository DepartmentRepository;
	
	


	/*public List<Employee> getAllEmployee() {
		List<Employee> employeeDetails = new ArrayList<>();
		employeeDetailRepository.queryBy().forEach(employeeDetails::add);
		return employeeDetails;
	}*/
	
	public List<Employee> getAllEmployee() {
		List<Employee> employeeDetails = new ArrayList<>();
		employeeDetailRepository.findAll().forEach(employeeDetails::add);
		return employeeDetails;
	}


	@Override
	public Employee getEmployeesByFirstname(String firstName) {
		Employee empl = new Employee();
		empl = employeeDetailRepository.findByFirstName(firstName);
		return empl;
		
	}


	@Override
	public List<Department> getdepartment() {
		return DepartmentRepository.findAll();
	}

}
