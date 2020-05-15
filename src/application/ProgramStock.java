package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramStock {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter produt data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		//System.out.println(product.toString());
		//System.out.println(product);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: " );		
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);			
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: " );		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
				
		System.out.println();
		System.out.println("Updated data: " + product);			
						
				
				
		sc.close();
		
		
		
	}

}
