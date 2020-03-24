package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.12159;
		double R = sc.nextDouble();
				
		double area = pi * Math.pow(R, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}
}
