package application;

import java.util.Locale;
import java.util.Scanner;

public class Array001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma = 0.0;
		
		double[] vect = new double[n];
		for (int i=0; i<3; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		System.out.printf("AVARAGE HEIGHT: %.2f%n", soma/n);
		sc.close();

	}

}
