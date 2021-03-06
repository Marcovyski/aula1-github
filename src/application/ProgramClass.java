package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ler as 3 areas de um triangulo e 
		 * apresentar a menor area
		 * 
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of tirangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of tirangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle Y area: %.4f%n",areaY);
		
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		sc.close();
	}

}
