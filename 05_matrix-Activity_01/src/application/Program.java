package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] < 0 ) {
					sum ++;
				}
			}
		}
		System.out.println("Negative numbers: " + sum);
		
		sc.close();
	}
}
