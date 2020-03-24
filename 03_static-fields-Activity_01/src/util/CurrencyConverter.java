package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dollarAmount, double dollarPrice) {
		return dollarAmount * dollarPrice * (IOF + 1);
	}
}
