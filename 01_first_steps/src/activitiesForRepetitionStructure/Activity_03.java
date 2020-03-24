package activitiesForRepetitionStructure;

import java.util.Scanner;

public class Activity_03 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		
		for(int i = 0; i < N; i++) {
			
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double average = (A*2 + B*3 + C*5) / 10;
			
			System.out.printf("%.1f%n", average);
		}
		
		sc.close();
	}
}
