package entities.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Contract;
import entities.Installment;

public class ContractService {

	public void processContract(Contract contract, Integer months) {
		Double amount = contract.getTotalValue() / months;

		List<Installment> installments = new ArrayList<>();

		OnlinePaymentService onlinePaymentService = new PaypalService();

		for (int i = 1; i <= months; i++) {
			Double totalAmount = onlinePaymentService.paymentFee(onlinePaymentService.interest(amount, i));
			LocalDate paymentDate = contract.getDate().plusMonths(i);

			installments.add(new Installment(paymentDate, totalAmount));
		}
		contract.setInstallments(installments);
	}
}