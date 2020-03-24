package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number <= 0) {
			System.out.println("NEGATIVE");
		}
		else System.out.println("NOT NEGATIVE");
		
		sc.close();
	}
}
