package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		double amount = sc.nextDouble();
		sc.nextLine();

		String filePath = "C:\\temp\\ws-eclipse\\15_stream-activity_02\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");				
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<String> emails = list.stream() //criar stream a partir da lista
					.filter(p -> p.getPrice() > amount) // filtra precos menor que amount
					.map(p -> p.getEmail()) //pega os emails dos employees filtrados acima
					.sorted() // ordena em ordem alfabetica
					.collect(Collectors.toList()); // transforma a string em lista
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", amount) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M') //pega todos os nomes que comecam com M
					.map(x -> x.getPrice()) //pega o salario de todos que comecam com M
					.reduce(0.0, (x, y) -> x + y); //faz a somatoria
					
			System.out.print("Sum of salary of people whose name starts with 'M': " + sum);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}