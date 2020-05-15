import java.util.Scanner;

public class ComandoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String nomeCompleto = sc.nextLine();
		
		String[] nome = nomeCompleto.split(" ");
		String nome1 = nome[0];
		String nome2 = nome[1];
		String nome3 = nome[2];
		
		int x = nomeCompleto.length();
		int y = nomeCompleto.indexOf(" ");
		System.out.println("Tamanho do Array: " + x);
		System.out.println("Tamanho do Array: " + y);
		
		System.out.println("1o. Nome...: " + nome1);
		System.out.println("2o. Nome...: " + nome2);
		System.out.println("3o. Nome...: " + nome3);
		
		sc.close();

	}

}
