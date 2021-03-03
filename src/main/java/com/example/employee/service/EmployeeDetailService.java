package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;

public interface EmployeeDetailService {

	List<Employee> getAllEmployee();

	Employee getEmployeesByFirstname(String firstName);

	List<Department> getdepartment();

}
