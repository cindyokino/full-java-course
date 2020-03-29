package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); //vou ler varios dados em uma mesma linha, cada dado é separado por um espaco e sera um elemento do vetor chamado vect
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) { //excecao quando tento acessar a posicao de um array fora do limite
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException e) { //excecao quando digito um valor invalido para o inteiro
			System.out.println("Input error!");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}
}
