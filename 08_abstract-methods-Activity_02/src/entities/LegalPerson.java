package entities;

public class LegalPerson extends Person {
	
	private int numberEmployees;
		
	public LegalPerson(String name, double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		if (numberEmployees > 10){
			return getAnnualIncome() * 0.14;
		} 
		else {
			return getAnnualIncome() * 0.16;
		}
	}
}
