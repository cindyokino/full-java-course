package activitiesForRepetitionStructure;

import java.util.Scanner;

public class Activity_05 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=N; i>=1; i--) {
			factorial *= i;				
		}
		
		System.out.println(factorial);
				
		sc.close();
	}
}
 