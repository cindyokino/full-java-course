package activitiesForRepetitionStructure;

import java.util.Scanner;

public class Activity_01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
				
		for(int i = 1; i <= X; i += 2) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
