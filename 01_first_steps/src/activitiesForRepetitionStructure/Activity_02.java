package activitiesForRepetitionStructure;

import java.util.Scanner;

public class Activity_02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 1; i <= N; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			}
			else {
				out++;
			}			
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
