package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle68_1;

public class Exercicio68_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle68_1 tri = new Triangle68_1();
		
		System.out.println("Enter rectangle width and height:");
	    tri.width = sc.nextDouble();
	    tri.height = sc.nextDouble();
	    

	    
	    System.out.printf("AREA = %.2f%n", tri.area());
	    System.out.printf("PERIMETER = %.2f%n", tri.perimeter());		
	    System.out.printf("DIAGONAL = %.2f%n", tri.diagonal());		
				
		sc.close();
		
	}

}
