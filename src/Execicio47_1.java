import java.util.Scanner;

public class Execicio47_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		
		while (x != y) {

			if (x < y) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
