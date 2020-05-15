package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Agenda;

public class Testes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//List <Agenda> list = new ArrayList<>();

		System.out.print("Entre com o ID: ");
		int id = sc.nextInt();	
		
		
		while (id > 0) {
		
			System.out.print("Entre com nome......: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Entre com a idade...: ");
			int idade = sc.nextInt();
			
			System.out.print("Entre com o telefone: ");
			sc.nextLine();
			String telefone = sc.nextLine();
			//list.add(new Agenda(id, nome, idade, telefone));
		}
		
		//sc.close;
		
	}

}
