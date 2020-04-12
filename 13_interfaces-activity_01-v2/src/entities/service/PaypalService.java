package entities.service;

public class PaypalService implements OnlinePaymentService {

	public Double interest(Double amount, Integer month) {
		return amount * (1 + 0.01 * month);
	}

	public Double paymentFee(Double amount) {
		return amount * 1.02;
	}
}