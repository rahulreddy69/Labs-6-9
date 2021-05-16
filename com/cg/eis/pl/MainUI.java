package com.cg.eis.pl;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.cg.eis.beans.Employee;
import com.cg.eis.exception.SalaryException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainUI {
	
	static Scanner sc = new Scanner(System.in);
	static EmployeeServiceImpl emps = new EmployeeServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainUI m = new MainUI();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Enter employee"+"\n"+"2. Display employees"+"\n"+"3. Display Insurance Scheme"+"\n"+"0. Exit");
			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1: 
				m.insertEmp();
				break;
			case 2:
				m.displayEmployees1();
				break;
			case 3:
				m.getEmpByInsurance();
				break;
			case 0:
				System.exit(0);
				
			}
			
		}


	}

	public static void insertEmp() {
		System.out.println("Enter Id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter designation: ");
		String designation = sc.nextLine();
		System.out.println("Enter salary");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Insurance Scheme");
		String insuranceScheme = sc.nextLine();
		
		try {
			HashMap<Set<Employee>, String> x = emps.insertEmployee(new Employee(id, name, designation, salary, insuranceScheme));
		} catch (SalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//System.out.println(hs);
	}
	
	public  void getEmpByInsurance() {
		System.out.println("Enter scheme and available schemes are : \n 1. Scheme A \n 2. Scheme B \n 3. Scheme C \n 4. No Scheme");
		String insurance = sc.nextLine();
		HashMap<Set<Employee>, String> hs = emps.getAllEmployeesByInsurance(insurance);
		displayEmployees(hs);
	}
	
	public void getAllEmp() {
		HashMap<Set<Employee>, String>hs = emps.getAllEmployees();
		displayEmployees(hs);
	}
	
	
	public void displayEmployees(HashMap<Set<Employee>, String> hs) 
	{
		System.out.println("---------------Employee Information-----------------");
			print(hs);
		System.out.println("-----------------------------------------------------");
		
	}
		
		public void displayEmployees1()
		{
			HashMap<Set<Employee>, String>hs = emps.getAllEmployees();
			
			displayEmployees(hs);
			
		}
		public void print(HashMap<Set<Employee>, String> hs) {
			for(Entry<Set<Employee>, String> i : hs.entrySet()) {
				System.out.println("Employee details are: "+printSet(i.getKey())+"\n"+"Insurance Scheme : "+i.getValue());
				System.out.println();
			}
		}
		public Set<Employee> printSet(Set<Employee> se) {
			for(Employee e : se) {
				
				System.out.print("Name: "+e.getName()+"\nId : "+ e.getId()+"\nSalary : "+e.getSalary()+"\nDesignation : "+e.getDesignation());
				
			}
			return null;
		}
 }