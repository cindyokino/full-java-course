package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start, end, duration;
		
		start = sc.nextInt();
		end = sc.nextInt();
			
		if (start < end) {
			duration = end - start;
		}
		else {
			duration = 24 - start + end;
		}
		
		System.out.println("The match lasted " + duration + "hour(s)");
				
		sc.close();
		
	}

}
