package application;

import java.util.Locale;
import java.util.Scanner;

public class Aula69 {

	public static final double PI = 3.14159;//membro estatico consante e nao variavel
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter radium: ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);		
		System.out.printf("PI Value: %.2f%n", PI);		
			
		sc.close();

	}
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
