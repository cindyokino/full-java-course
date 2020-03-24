package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date: ");
		Date birthDate = sdf1.parse(sc.nextLine());
		
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		client.setBirthDate(birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order ();
		order.setClient(client);
		order.setStatus(status);
				
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();

			Product product = new Product(productName, price);
					
//			OrderItem orderItem = new OrderItem(quantity, product); //equivale as 3 linhas abaixo:
			OrderItem orderItem = new OrderItem();
			orderItem.setQuantity(quantity);
			orderItem.setProduct(product);

			order.addItem(orderItem);
		}
		System.out.println(order);
		sc.close();
	}
}
