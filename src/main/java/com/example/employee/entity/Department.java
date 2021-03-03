package com.example.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="dept_name")
	private String deptname;
	
	/*@OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="dept_id",referencedColumnName = "dept_id")
	private List<Employee> employees;*/

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public Department() {
		
	}

	

	

	public Department(int deptId, String deptname) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + " ]";
	}
	
	
	

}
