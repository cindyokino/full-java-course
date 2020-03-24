package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, total;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		total = A * B - C * D;
		
		System.out.println("TOTAL = " + total);
		
		sc.close();
		
	}
}
