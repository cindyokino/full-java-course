package activitiesConditionalStructures;

import java.util.Scanner;

public class Activity_07 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 double x = sc.nextDouble();
		 double y = sc.nextDouble();
		 
		 if (x == 0 && y == 0) {
			 System.out.println("Origin");
		 }
		 else if (x == 0) {
			 System.out.println("Axe Y");
		 }
		 else if (y == 0) {
			 System.out.println("Axe X");
		 }
		 else if (x >= 0  && y >= 0) {
			 System.out.println("Q1");
		 }
		 else if (x < 0  && y >= 0) {
			 System.out.println("Q2");
		 }
		 else if (x < 0  && y < 0) {
			 System.out.println("Q3");
		 }
		 else {
			 System.out.println("Q4");
		 }
		 
		 
		 sc.close();
	}
}
