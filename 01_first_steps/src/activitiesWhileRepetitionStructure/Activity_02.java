package activitiesWhileRepetitionStructure;

import java.util.Scanner;

public class Activity_02 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
				
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0 ) {
				System.out.println("First Quadrant");			
			}
			else if(x < 0 && y > 0) {
				System.out.println("Second Quadrant");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Third Quadrant");
			}
			else {
				System.out.println("Fourth Quadrant");
			}
			x = sc.nextInt();
			y = sc.nextInt();			
		}
		sc.close();
	}
}
