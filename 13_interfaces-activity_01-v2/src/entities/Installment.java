package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private LocalDate dueDate;
	private Double amount;

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public String toString() {
		return dueDate.format(myFormatDate) + " - " + String.format("%.2f", amount);
	}
}