package app;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarAmount, dollarPrice);
		
		System.out.printf("Amount to be paid in Reais = %.2f%n", result);		
		sc.close();
	}
}
