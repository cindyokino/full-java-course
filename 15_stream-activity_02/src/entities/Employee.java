package entities;

public class Employee {
	
	private String name;
	private String email;
	private double price;
	
	public Employee() {		
	}
	
	public Employee(String name, String email, double price) {
		this.name = name;
		this.email = email;
		this.price = price;				
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}	
}
