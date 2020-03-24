package activitiesSequentialStructures;

import java.util.Scanner;

public class Activity_04 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int idWorker; 
		double hours, valueHour, salary;
		
		idWorker = sc.nextInt();
		hours = sc.nextDouble();
		valueHour = sc.nextDouble();
		
		salary = hours * valueHour;
		
		System.out.println("WORKER ID = " + idWorker);
		System.out.printf("SALARY = $%.2f%n ", salary);
		
		sc.close();
	}
}
