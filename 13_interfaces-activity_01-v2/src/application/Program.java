package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import entities.service.ContractService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();

		System.out.print("Date (dd/MM/yyyy): ");
		DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parsedDate = LocalDate.parse(sc.nextLine(), myFormatDate);

		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, parsedDate, totalValue);

		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();

		ContractService contractService = new ContractService();
		contractService.processContract(contract, months);

		System.out.println("Installments:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		sc.close();
	}
}