package application;

import java.util.Scanner;

public class Execicio97_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//linha
		int n = sc.nextInt();//coluna
		
		int[][] mat = new int[m][n];
		

		for (int i = 0; i < m; i ++) {// variavel LINHA
			for (int j = 0; j < n; j++) {//variavel COLUNA
				mat[i][j] = sc.nextInt();
			}
		}	
		System.out.println("Pesquisar: ");
	    int busca = sc.nextInt();
		for (int i = 0; i < m; i ++) {// variavel LINHA
			for (int j = 0; j < n; j++) {//variavel COLUNA
				if (mat[i][j] == busca) {
					System.out.println("Achei.....: "+mat[i][j]);
					System.out.println("Position..: "+ i + ","+ j +":");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("UP..: " + mat[i-1][j]);
					}		
					if (j < mat[i].length-1) {
						System.out.println("Right.: " + mat[i][j+1]);
					}	
					if (i < mat.length-1) {
						System.out.println("Down..: " + mat[i+1][j]);
					}					
					
					
					
				}
			}
		}	
		
		/*
		 * 
		 * 
		 * 
		 * //BUSCA
		 * 
		 * 
		 * for (int i = 0; i < m; i ++) {// variavel LINHA for (int j = 0; j < n; j++)
		 * {//variavel COLUNA System.out.print(mat[i][j]+ " "); } System.out.println();
		 * }
		 * 
		 */

		sc.close();
		
	}

}
