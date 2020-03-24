package applicaton;

import java.util.Scanner;
import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		
	Account account;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();		
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);
		System.out.println(account);

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println(account);				
		
		sc.close();		
	}
}
