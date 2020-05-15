import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23456700;
		
		//System.out.printf("%s tem %d anos e ganhar R$ %.2f reais.%n", nome, idade, renda);
		/*
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = string
		 * %n = quebra de linha
		 * %.2f
		 * Valores interpolados dentro de uma string
		 */
		
		System.out.println("Products:");
		System.out.printf("%s, which price is %.2f.%n", product1,  price1);	
		System.out.printf("%s, which price is %.2f.%n", product2,  price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %s.", age, code, gender);
		System.out.println("");	
		System.out.printf("Measue with eight decimal places: %.8f.%n", measure);
		System.out.printf("Rounded (three decimal places: %.3f.%n", measure);	
		
		Locale.setDefault(Locale.US);
		System.out.printf("Rounded (three decimal places: %.3f.%n", measure);	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
