package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Agenda;
import entities.AgendaFull;

public class AgendaMac {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		List<AgendaFull> agd = new ArrayList<>();
		
		System.out.println("Bem vindo a Agenda");
		System.out.println();
		System.out.println("Menu de opcoes:");
		System.out.println("1 - Adicionar contados");
		System.out.println("2 - Ediar contados");
		System.out.println("3 - Remover contados");		
		System.out.println("4 - Localizar contados");
		System.out.println("5 - Imprimir os contados");		
		System.out.println("0 - Sair da Agenda");		
		System.out.println();	
		System.out.print("Faca sua opcao: ");	
		int opc = sc.nextInt();

		while (opc != 0){
			System.out.println();
			switch(opc) {
				case 1:{

					System.out.println("Nome do Contato....: ");
					sc.nextLine();
					String nome = sc.nextLine();
				
					System.out.print("Telefone do Contato: ");
					//sc.nextLine();
					String telefone = sc.nextLine();
				
					System.out.print("e-Mail do Contato..: ");
					//sc.nextLine();
					String email = sc.nextLine();
					agd.add(new AgendaFull( nome, telefone, email));
					
					break;

				}
				case 5:{
					for (AgendaFull obj : agd) {
						System.out.println(obj);
					}
					break;
				}
				case 0:{
					System.out.println("Saida pelo usuario!");
					break;
				}
			}
			
		}		
			
		sc.close();

	}

}
