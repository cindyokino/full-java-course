package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int studentAmount = 0;
		
		System.out.print("How many students for course A? ");	
		studentAmount = sc.nextInt();	
		sc.nextLine();
		Course courseA = new Course();
		courseA.courses(studentAmount);
		
		System.out.print("How many students for course B? ");
		studentAmount = sc.nextInt();	
		sc.nextLine();
		Course courseB = new Course();
		courseB.courses(studentAmount);

		System.out.print("How many students for course C? ");	
		studentAmount = sc.nextInt();
		sc.nextLine();
		Course courseC = new Course();
		courseC.courses(studentAmount);
		
		Set<Integer> totalStudents = new HashSet<>();
		
		totalStudents.addAll(courseA.getStudents());
		totalStudents.addAll(courseB.getStudents());
		totalStudents.addAll(courseC.getStudents());
		
		System.out.print("Total students: " + totalStudents.size());
		
		sc.close();
	}
}
