package entities;

public class NaturalPerson extends Person {
	
	private double healthExpenses;
		
	public NaturalPerson(String name, double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthEspenses() {
		return healthExpenses;
	}

	public void setHealthEspenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public double tax() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenses * 0.50;
		} else {
			return getAnnualIncome() * 0.25 - healthExpenses * 0.50;
		}
	}	
}
