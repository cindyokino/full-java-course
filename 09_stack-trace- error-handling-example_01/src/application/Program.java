package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();	
		
		System.out.println("End of program");		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" "); //vou ler varios dados em uma mesma linha, cada dado é separado por um espaco e sera um elemento do vetor chamado vect
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) { //excecao quando tento acessar a posicao de um array fora do limite
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) { //excecao quando digito um valor invalido para o inteiro
			System.out.println("Input error!");
		}		
		sc.close();
		System.out.println("***METHOD2 END***");

	}
}