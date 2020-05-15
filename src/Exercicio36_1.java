import java.util.Locale;
import java.util.Scanner;

public class Exercicio36_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com consumo.: ");
		
		int consumo = sc.nextInt();
		double valor = 50.00;
	
		if (consumo <= 100) {
			System.out.println("Valor a pagar: R$ "+ valor);
		}else {
			consumo += - 100;

			valor = (consumo * 2.00) + valor;

		    System.out.printf("Valor da fatura R$ %.2f%n", valor);
		}
	
		sc.close();
		
	}
	
	
	
}
