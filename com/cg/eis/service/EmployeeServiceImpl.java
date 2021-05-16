package com.cg.eis.service;

import java.util.HashMap;

import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.eis.beans.Employee;
import com.cg.eis.exception.SalaryException;

public class EmployeeServiceImpl implements EmployeeService{
	
	Set<Employee> sEmp = new HashSet<Employee>();
	
	HashMap<Set<Employee>, String> hm = new HashMap<Set<Employee>, String>();
	

	

	public HashMap<Set<Employee>, String> insertEmployee(Employee e) throws SalaryException{
		// TODO Auto-generated method stub
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("Scheme A");
		}
		else if(e.getDesignation().equals("Clerk")) {
			if(e.getSalary() > 5000) {
				throw new SalaryException(e.getSalary());
			}
			else if(e.getSalary() <= 5000) {
			e.setInsuranceScheme("No Scheme");
			}
				
		}
		Set<Employee> se = new HashSet<Employee>();
		se.add(e);
		hm.put(se, e.getInsuranceScheme());
		
		
		return hm;
	}
	
	

	public HashMap<Set<Employee>, String> getAllEmployees() {
		// TODO Auto-generated method stub
		return hm;
	}

	public HashMap<Set<Employee>, String> getAllEmployeesByInsurance(String insurance) {
		// TODO Auto-generated method stub
		HashMap<Set<Employee>, String> resMap = new HashMap<Set<Employee>, String>();
		for(Entry<Set<Employee>, String> i : hm.entrySet()) {
			if(i.getValue().equals(insurance)) {
				resMap.put(i.getKey(), i.getValue());
			}
		}
		
		return resMap;
	}



	

}