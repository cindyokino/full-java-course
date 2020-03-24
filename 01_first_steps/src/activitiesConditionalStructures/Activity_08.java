package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_08 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		double tax;
		
		if (salary <= 2000) {
			tax = 0.0;
		}
		else if (salary <= 3000) {
			tax = (salary - 2000) * 0.08;
		}
		else if (salary <= 4500) {
			tax = (salary-3000) * 0.18 + 1000 * 0.08;	
		}
		else {
			tax = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		if (tax == 0.0) {
			System.out.println("Tax free");
		}
		else {
			System.out.printf("U$ %.2f%n", tax);
		}
				
		sc.close();
	}
}
