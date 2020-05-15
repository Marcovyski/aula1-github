package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Agenda;
import entities.EmployeeArray;


public class Exercicio94_2 {

	public static void main(String[] args) {
		/*
		 * Crie um obj chamado Cliente com os atributos
		 * id, nome, idade, telefone. Faca um prg para
		 * solicitar os dados de v[arios clientes e armazenar
		 * e um ArrayList at[e que se digite um n[umero de ID 
		 * negativo. Em seguida exiba os dados de todos os
		 * clientes via SystemOut, formatando cada obj por linhas.
		 * */
		Scanner sc = new Scanner(System.in);

		List <Agenda> list = new ArrayList<>();

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
			list.add(new Agenda(id, nome, idade, telefone));
			
		
			System.out.println();
			System.out.println();
			
			System.out.print("Entre com o ID: ");
			id = sc.nextInt();	

		}
		
		for (Agenda obj : list) {
			System.out.println(obj);
		}

		sc.close();
	
	}

}
