package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
	
		list.add("Maria"); 
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // add "Marco" at position (2)
		System.out.println(list.size()); 
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------"); 
//		list.remove("Anna"); // remove correspondent value
//		list.remove(1); // remove item at position 1
		list.removeIf(x -> x.charAt(0) == 'M'); // predicate, remove if first character is equal to 'M'
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------"); 
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Indes of Marco: " + list.indexOf("Marco")); // if the item doesn't exists the result at the console prints "-1"
		
		System.out.println("-----------------------------"); 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}	
		
		System.out.println("-----------------------------"); 
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null); // if there's no one with the name starting with Z
		System.out.println(name2);
	}
}
