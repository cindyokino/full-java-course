package entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Course {

	private Set<Integer> students = new HashSet<>();

	public Set<Integer> getStudents() {
		return students;
	}

	public void setStudents(Set<Integer> students) {
		this.students = students;
	}

	public void courses(int studentAmount) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < studentAmount; i++) {
			int studentId = sc.nextInt();
			sc.nextLine();

			students.add(studentId);
		}
	}
}
