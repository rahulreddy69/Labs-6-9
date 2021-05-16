package lab_9;

import java.time.LocalDate;

public class Employee {
	int employeeID;
	String firstName;
	String LastName;
	String email;
	String phoneNumber;
	LocalDate hireDate;
	String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeID, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, String designation, double salary, Department department) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	double salary;
	//int managerID;
	Department department;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	//public int getManagerID() {
		//return managerID;
	//}
	public Department getDepartment() {
		return department;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//public void setManagerID(int managerID) {
		//this.managerID = managerID;
	//}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
