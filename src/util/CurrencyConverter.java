package util;

public class CurrencyConverter {
	
	public static void currencyConverter(double p, double b) {
		double amount = (p * b) + (0.06 * (p * b));
		System.out.printf("Amount to be paid in reais =  %.2f%n", amount);
	}
}
