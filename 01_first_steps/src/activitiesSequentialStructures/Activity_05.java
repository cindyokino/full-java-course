package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int code1, code2, quantity1, quantity2;
		double price1, price2, total;
		
		code1 = scan.nextInt();
		quantity1 = scan.nextInt();
		price1 = scan.nextDouble();
		
		code2 = scan.nextInt();
		quantity2 = scan.nextInt();
		price2 = scan.nextDouble();		
					
		total = quantity1 * price1 + quantity2 * price2;
		
		System.out.printf("TOTAL: $ %.2f%n", total);
		
		scan.close();
			
	}
}
