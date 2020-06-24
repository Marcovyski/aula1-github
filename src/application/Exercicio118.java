package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client118;
import entities.Order118;
import entities.OrderItem118;
import entities.Product118;
import entities.enums.OrderStatus118;

public class Exercicio118 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();	
		System.out.print("Birth date (DD/MM/YYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		//aqui esta a relacao com Client
		Client118 client = new Client118(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: " );
		OrderStatus118 status = OrderStatus118.valueOf(sc.next());
		
		//aqui esta a relacao com Order
		Order118 order = new Order118(new Date(), status, client, null);
			
		System.out.print("How many items to this order? ");
		Integer n = sc.nextInt();

		for(int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");			
			Double productPrice = sc.nextDouble();
			
			//aqui esta a relacao com Product
			Product118 product = new Product118(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			//aqui esta a relacao com OrderItem
			OrderItem118 orderItem = new OrderItem118(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);

		sc.close();
		
	}

}
