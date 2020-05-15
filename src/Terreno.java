import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.println("Entre com a Largura/Comprimento/Vlr do Metro do Terreno:");
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		//System.out.printf("%s tem %d anos e ganhar R$ %.2f reais.%n", nome, idade, renda);
				/*
				 * %f = ponto flutuante
				 * %d = inteiro
				 * %s = string
				 * %n = quebra de linha
				 * %.2f
				 * Valores interpolados dentro de uma string
				 */
				
		/*
		 * System.out.println("Largura do terreno.....: "+ largura);
		 * System.out.println("Comprimento do terreno.: "+ comprimento);
		 * System.out.println("Valor do metro quadrado: "+ metroQuadrado);
		 */
		
		
		System.out.printf("Valor da área..........: %.2f%n", area);
		System.out.printf("Preço do terreno.......: %.2f%n", preco);

		sc.close();
	}

}
