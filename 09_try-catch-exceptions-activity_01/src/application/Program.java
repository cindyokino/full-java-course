package application;

import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();		
		System.out.print("Enter amount for withdraw: ");
		Double withdraw = sc.nextDouble();
		
		try {
			account.withdraw(withdraw);
			System.out.println("New balance " + String.format("%.2f", account.getBalance()));
		}
		
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
				
		sc.close();		
	}
}
