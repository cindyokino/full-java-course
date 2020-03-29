package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
						
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			sc.nextLine();	
			if (ch == 'i') {
				System.out.print("Health expenses: ");
				double healthExpenses = sc.nextDouble();
				list.add(new NaturalPerson(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt(); 
				list.add(new LegalPerson(name, annualIncome, numberEmployees));
			}
		}
		
		double totalTax = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person person : list) {
			System.out.println(person.getName()
					+ ": $ "
					+ String.format("%.2f", person.tax()));
			totalTax += person.tax();
			
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));

		sc.close();
	}
}
