package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Product002;

public class Array002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double soma =0.0;
		
		Product002[] vect = new Product002[n];
		for ( int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product002(name, price);
			soma += vect[i].getPrice();
		}
		System.out.printf("AVERAGE PRICE = %.2f%n", soma/vect.length);
		
		
		sc.close();
		
		
	}

}
