package application;

import java.util.Scanner;

import entities.ArrayRoom;

public class Exercicio89_1 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		//String[] rent = new String[n];
		ArrayRoom[] rent = new ArrayRoom[10];
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			String name;
			String email;
			int dbRoom;
			String room;		
			
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();	
			System.out.print("Room: ");
			dbRoom = sc.nextInt();	
			System.out.println("");
			System.out.println("");
			room = Integer.toString(dbRoom);
			rent[dbRoom] = new ArrayRoom(name, email, room);

		}
		
		System.out.println("Busy rooms:");
		for (int j=1; j<rent.length; j++) {
			
			if (rent[j] != null) {
				System.out.println(rent[j].getRoom()
						           + ": "
						           + rent[j].getName()
						           + ", "
						           + rent[j].getEmail());
			}
		}
		
		sc.close();
		
		
	}
}
