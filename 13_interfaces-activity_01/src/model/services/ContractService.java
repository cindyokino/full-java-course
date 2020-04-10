package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private Integer months;
	
	private OnlinePaymentService onlinePaymentService;
	
	List<Installment> list = new ArrayList<>();

	public ContractService(int months, OnlinePaymentService onlinePaymentService) {
		this.months = months;
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Calendar cal = Calendar.getInstance();
		Date initialDate = contract.getDate();
		cal.setTime(initialDate);
		
		double amountPerInstallment = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			
			cal.add(Calendar.MONTH, 1);
			Date dueDate = cal.getTime();
			
			double installmentAmountWithInterest = onlinePaymentService.interest(amountPerInstallment, i);
			double installmentTotalAmount = onlinePaymentService.paymentFee(installmentAmountWithInterest);
			
			Installment installment = new Installment(dueDate, installmentTotalAmount);
			contract.getInstallments().add(installment);
		}		
	}
}
