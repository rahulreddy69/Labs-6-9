package com.cg.eis.beans;


import java.util.HashMap;
import java.util.Set;

import com.cg.eis.exception.SalaryException;
import com.cg.eis.service.EmployeeService;

public class Employee implements EmployeeService {
	
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String designation, int salary, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee(int id, String name, String designation,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	@Override
	public HashMap<Set<Employee>, String> insertEmployee(Employee e) throws SalaryException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HashMap<Set<Employee>, String> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HashMap<Set<Employee>, String> getAllEmployeesByInsurance(String insurance) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}