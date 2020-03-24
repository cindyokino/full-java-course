package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	
	public double missing() {
		return 60 - finalGrade();
	}

	public void printFinalResult() {
		
		System.out.println("FINAL GRADE = " + String.format("%.2f%n", finalGrade()));

		if (finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING " + String.format("%.2f%n", missing()) + " POINTS");
		} else {
			System.out.println("SUCCESS!");
		}
		

	}

}
