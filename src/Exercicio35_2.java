

import java.util.Locale;
import java.util.Scanner;

public class Exercicio35_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Equação do segundo grau
		 * - Denta não pode ser negativo
		 * - A não pode ser zero
		 * - ax2 + bx + c = 0
		 * 
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = b * b - 4.0 * a * c;
		/*
		 * denta ao quadrado b*b
		 * -4.0 *a*c
		 * */
		if (a == 0 || delta <0.0) {
			System.out.println("Impossível calcular");
		}else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R1 = %.5f%n", r2);
		}
	
		sc.close();
		
		
	}

}
