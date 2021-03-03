package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Employee;

public interface EmployeeDetailRepository extends JpaRepository<Employee, Integer> {

	
	/*@Query(value = "select employee.id, employee.first_name,employee.last_name,employee.email,"
			+ "department.dept_name,department.dept_id from employee join  department " + 
			"on employee.dept_id = department.dept_id;",nativeQuery = true)
	List<Employee> queryBy();*/

	Employee findByFirstName(String firstName);

}
