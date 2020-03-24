package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private List<OrderItem> orderItems = new ArrayList<>();
	private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date();
	private OrderStatus status;
	private Client client = new Client();	
	
	public Order () {	
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		orderItems.add(item);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}
	
	public Double total() {
		Double total = 0d;
		for (OrderItem orderItem : orderItems) {
			total = total + orderItem.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY:" + "\n");
		sb.append("Order moment: ") ;
		sb.append(sdf2.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: \n");	
		for (OrderItem item : orderItems) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $" );
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
