import java.util.Scanner;

public class WhileRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while ( x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Resultado da soma.: " + soma);
		
		sc.close();

	}

}
