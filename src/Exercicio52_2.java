import java.util.Scanner;

public class Exercicio52_2 {

	public static void main(String[] args) {
	
		/*
		 * 
		 * O programa deve imprimir um valor inteiro. 
		 * Este valor [e a soma dos valores impares que
		 * estao entre os valores fornecidos na
		 * entrada que devera caber em um inteiro.
		 * 
		 * (-5 -4 -3 -2 -1 0 1 2 3 4 5 6)---> 6 -5
		 * 
		 * ( i % 2 != 0) aqui ele eh impar
		 * 
		 * 
		 **/
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min,max;
		if (x < y) {
			min = x;
			max = y;
		}else{
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i = min+1; i < max; i++) {
			if ( i % 2 != 0) {
				soma += soma;
			}	
		} 
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
       