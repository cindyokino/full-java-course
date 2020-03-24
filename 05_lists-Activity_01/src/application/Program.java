package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeesList = new ArrayList<>();	
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; i++) {			
			System.out.println("Employee #" + (i+1) + " :");			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
//			List<Employee> employeeId = employeesList.stream().filter(employee -> employee.getId() == id).collect(Collectors.toList());
//			if (List<Employee> employeeId = employeesList.stream().filter(employee -> employee.getId() == id).collect(Collectors.toList())) {
//				System.out.print("This id already exists, please insert a new Id: ");
//				newId = sc.nextInt();
//			}					
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
//			employeesList.add(employee = new Employee(id, name, salary)); // eu fiz assim
			employeesList.add(new Employee(id, name, salary));

		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idToRaiseSalarie = sc.nextInt();
		Employee employee = employeesList.stream()
				.filter(x -> x.getId() == idToRaiseSalarie)
				.findFirst()
				.orElse(null); 
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double amount = sc.nextDouble();
			employee.increaseSalary(amount);
		}
		
		System.out.println();;
		System.out.println("List of employees:");
		for (Employee emp : employeesList) {
			System.out.print(emp);			
		}
		sc.close();				
	}	
}

