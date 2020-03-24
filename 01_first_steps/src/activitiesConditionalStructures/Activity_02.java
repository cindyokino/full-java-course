package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		sc.close();
		
	}
}
