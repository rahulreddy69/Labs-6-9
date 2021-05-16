package lab_9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {
		Department account = new Department(501,"Account", 75); 
	      Department hr = new Department(502,"HR", 50);
	      Department ops = new Department(503,"OP", 25);
	      Department tech = new Department(504,"Tech", 150);     
	      
	      Employee e1 = new Employee(101,"A","a","a@gmail.com","3234345",LocalDate.of(2014, Month.JANUARY, 1),"Account", 50000,account);
			Employee e2 = new Employee(102,"B","c","b@gmail.com","3234346",LocalDate.of(2014, Month.MARCH, 3),"HR", 40000,hr);
			Employee e3 = new Employee(103,"C","c","c@gmail.com","3234347",LocalDate.of(2014, Month.SEPTEMBER, 15),"Op", 30000,ops);
			Employee e4 = new Employee(104,"","d","d@gmail.com","3234348",LocalDate.of(2014, Month.OCTOBER, 21),"Tech", 30000,tech);
			Employee e5 = new Employee(105,"E","e","e@gmail.com","3234349",LocalDate.of(2013, Month.DECEMBER, 21),"HR", 30000,hr);
	   
	     /* List<Employee> employeeList = Arrays.asList(new  Employee("David", 32, "Matara", account), 
	                           new  Employee("Brayan", 25, "Galle", hr),
	                           new  Employee("JoAnne", 45, "Negombo", ops),
	                           new  Employee("Jake", 65, "Galle", hr),
	                           new  Employee("Brent", 55, "Matara", hr),
	                           new  Employee("Allice", 23, "Matara", ops),
	                           new  Employee("Austin", 30, "Negombo", tech),
	                           new  Employee("Gerry", 29, "Matara", tech),
	                           new  Employee("Scote", 20, "Negombo", ops),
	                           new  Employee("Branden", 32, "Matara", account),
	                           new  Employee("Iflias", 31, "Galle", hr));
	      */
			
		  EmployeeService obj = new EmployeeService();
	      List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
	      
	      obj.sumOfSalaries(employeeList);
	      
	      obj.displayEmployees(employeeList);
	      
	      obj.seniorMostEmployee(employeeList);
	      
	      obj.employeeWithoutDepartment(employeeList);
	    
	      obj.DepartmentWithoutEmployees(employeeList);
	      
	     // obj.departmentWithHighestNumberOfEmployees(employeeList);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		