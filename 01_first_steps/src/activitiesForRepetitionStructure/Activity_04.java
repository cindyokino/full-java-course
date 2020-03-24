package activitiesForRepetitionStructure;

import java.util.Scanner;

public class Activity_04 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(B == 0) {
				System.out.println("can't divide by zero");
			}
			else {
				double div = (double) A / B;
				System.out.printf("%.1f%n", div);
			}
		}		
		sc.close();		
	}
}
