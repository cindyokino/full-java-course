package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
		
	public Double increaseSalary(Double percentage) {
		return salary += salary * percentage/100;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f%n", salary);
	}
}
