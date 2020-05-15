import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Ola mundo! ");
		System.out.println("Bom dia");

		
		int y = 32;
		System.out.println("Variável Y = " + y );
			
		System.out.println("-------------------------------------------");
		
		double x = 10.35784;
		
		System.out.println("Valor da variável x = " + x);
		System.out.printf("Valor da variável x = "+"%.2f%n", x);//printf-impressão formatada 2 equivale a 2 casas decimais
		System.out.printf("Valor da variável x = "+"%.4f%n", x);//printf-impressão formatada
		
		Locale.setDefault(Locale.US);
		System.out.printf("Valor da variável x = "+"%.4f%n", x);//printf-impressão formatada
		
		
		
		System.out.printf("Valor da variável x = %.2f metros%n", x);//printf-impressão formatada
		
		
		System.out.println("-------------------------------------------");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganhar R$ %.2f reais.%n", nome, idade, renda);
		/*
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = string
		 * %n = quebra de linha
		 * %.2f
		 * Valores interpolados dentro de uma string
		 */
		
		System.out.println("-------------------------------------------");	
		
		
		
	}

}
