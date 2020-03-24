package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Multiples");
		}
		else {
			System.out.println("Not Multiples");
			}
		
		sc.close();
	}
}
