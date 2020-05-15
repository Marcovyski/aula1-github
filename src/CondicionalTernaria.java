
public class CondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * double preco = 34.5; 
		 * double desconto; 
		 * if (preco < 20.0) {
		 *    desconto = preco * 0.1; 
		 * }else {
		 *    desconto = preco * 0.05; 
		 * }
		 */
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		

		System.out.printf("Valor da compra...: %.2f%n", preco);
		preco += - desconto;			
		System.out.printf("Valor do desconto.:  %.2f%n", desconto);
		System.out.printf("Valor com desconto: %.2f%n", preco);
		

	}

}
