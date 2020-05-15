package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaDoAluno;

public class Exercicio68_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Aluno e as 3 notas:");
		NotaDoAluno nta = new NotaDoAluno();
		nta.nome = sc.nextLine();
		NotaDoAluno.nota1 = sc.nextDouble();
		NotaDoAluno.nota2 = sc.nextDouble();
		NotaDoAluno.nota3 = sc.nextDouble();
		
		NotaDoAluno.notaFinal();

		
		sc.close();

	}

}
