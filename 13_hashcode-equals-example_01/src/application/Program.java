package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

//		String a = "Maria";
//		String b = "Alex";
//		
//		System.out.println(a.equals(b));
//		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "mariaxoxo@gmail.com");

		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode()); // try hashCode first
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // then try Equals
		System.out.println(c1 == c2); // FALSE: different position at memory / reference counts when use ==
		System.out.println(s1 == s2); // TRUE: tratamento diferente para literais (se fosse String s2 = new String "Test"; seria FALSE)
	}
}