package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String filePath = "C:\\temp\\ws-eclipse\\15_stream-activity_01\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");				
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream() //criar stream a partir da lista
					.map(p -> p.getPrice()) //novo stream com o preco dos produtos
					.reduce(0.0, (x,y) -> x + y) / list.size(); //funcao reduce faz a somatoria dos precos 
					
			System.out.println("Average price: " + String.format("%.2f", avg));
		
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); //comparador de strings independentemente de letras maiusculas ou minusculas
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg) // produtos filtrados se o preco for menor que a media avg
					.map(p -> p.getName()) //pegar o nome de cada produto e criar nova stream com os nomes dos produtos filtrados
					.sorted(comp.reversed()) //.sorted ordena em ordem alfabetica crescente, .reversed faz em ordem decrescente alfabetica
					.collect(Collectors.toList()); // transforma a string em lista
			
			names.forEach(System.out::println);
					
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}