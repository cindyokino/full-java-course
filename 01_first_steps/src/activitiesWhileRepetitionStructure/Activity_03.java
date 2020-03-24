package activitiesWhileRepetitionStructure;

import java.util.Scanner;

public class Activity_03 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int alcohol = 0, gas = 0, diesel = 0;
		
		while (code != 4) {
			switch(code) {
			case 1:
				alcohol ++;
				break;
			case 2:
				gas ++;
				break;	
			case 3:
				diesel ++;
				break;	
			}
			code = sc.nextInt();
		}
		System.out.println("Thank You!");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gas: " + gas);
		System.out.println("Diesel: " + diesel);
		
		sc.close();		
	}	
}
