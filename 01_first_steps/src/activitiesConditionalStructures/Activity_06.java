package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		if (N >= 0 && N <= 25) {
			System.out.println("Interval [0,25]");
		}
		else if (N > 25 && N <= 50) {
			System.out.println("Interval (25,50]");
		}
		else if (N > 50 && N <= 75) {
			System.out.println("Interval (50,75]");
		}
		else if (N > 75 && N <= 100) {
			System.out.println("Interval (75,100]");
		}
		else {
			System.out.println("Does not belong to a specified interval");
		}
		
		sc.close();
	}
}
