package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity =sc.nextInt();
		double total = 0;
		
		if (code == 1) {
			total = quantity * 4;
		} 
		else if (code == 2) {
			total = quantity * 4.5;
		}
		else if (code == 3) {
			total = quantity * 5;
		}
		else if (code == 4) {
			total = quantity * 2;
		}
		else if (code == 5) {
			total = quantity * 1.5;
		}
		else {
			System.out.printf("The item '%d' does not exist!%n", code);
		}
		System.out.printf("Total: %.2f%n", total);
		
		sc.close();		
	}
}
