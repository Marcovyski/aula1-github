import java.util.Locale;
import java.util.Scanner;

public class Exercicio35_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double nota1, nota2, media;
		
		System.out.println("Entre com a primeira nota.: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota.: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if (media > 60.0) {
			System.out.printf("NOTA FINAL = %.2f%n ", media);
		}else {
			System.out.printf(" NOTA FINAL = %.2f%n ", media);
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}

