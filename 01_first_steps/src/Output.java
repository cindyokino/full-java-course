

public class Output {
	
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.5;
		double measure = 53.234657;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f%n", product1, price1);		
		System.out.printf("%s, which price is %.2f%n", product2, price2);
		System.out.printf("%n");
		System.out.println("Record: " + age + " years old, code " + code + " and gender: "+ gender);
		System.out.printf("\n");
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f", measure);
	}
}
