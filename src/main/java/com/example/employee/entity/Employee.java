package com.example.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "email")
	private String email;
	
	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="dept_id",referencedColumnName = "dept_id")
	private Department department; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee() {
		
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int id, String firstName, String lastname, String email, Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email
				+ ", department=" + department + "]";
	}
	
	
	

}
