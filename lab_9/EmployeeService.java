package lab_9;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public void sumOfSalaries(List<Employee> employeeList) {
		
		// TODO Auto-generated method stub
		System.out.print("Sum of salaries: ");
	      employeeList.stream()
        .map(e -> e.getSalary())
        .distinct().reduce(Double::sum).ifPresent(System.out::println);
		
	}

	public void displayEmployees(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		employeeList.stream()
        .map(e -> e.getFirstName()+" "+e.getLastName())
        .forEach(System.out::println);
		
	}

	public void seniorMostEmployee(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		Comparator<Employee> byExperience = (emp1,emp2)->(LocalDate.now().until(emp2.getHireDate())).getDays();
	      Employee e = employeeList.stream().max(byExperience).get();
	      System.out.println(e.getFirstName());
		
	}

	public void employeeWithoutDepartment(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		List names = employeeList.stream().filter((employee)->employee.getDepartment().equals(null)).collect(Collectors.toList());
		System.out.println(names);
	}

	public void DepartmentWithoutEmployees(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		List department = employeeList.stream().filter((employee)->employee.getFirstName().equals("")&&employee.getLastName().equals("")).collect(Collectors.toList());
		System.out.println(department);
	}

	
	
	

}
