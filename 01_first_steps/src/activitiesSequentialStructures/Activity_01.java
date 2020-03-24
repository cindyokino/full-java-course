package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		int sum = firstNumber + secondNumber;
		
		System.out.println("SUM = " + sum);
		
		sc.close();
	}
}
