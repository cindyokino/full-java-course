package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, TRIANGLE, CIRCLE, TRAPEZOID, SQUARE, RECTANGLE;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGLE = A * C / 2;
		CIRCLE = 3.14156 * C * C;
		TRAPEZOID = (A + B) * C / 2;
		SQUARE = B * B;
		RECTANGLE = A * B;
				
		System.out.println("AREAS:");
		System.out.printf("TRIANGLE: %.3f%n", TRIANGLE);
		System.out.printf("CIRCLE: %.3f%n", CIRCLE);
		System.out.printf("TRAPEZOID: %.3f%n", TRAPEZOID);
		System.out.printf("SQUARE: %.3f%n", SQUARE);
		System.out.printf("RECTANGLE: %.3f%n", RECTANGLE);
		
		sc.close();
	}	
}
