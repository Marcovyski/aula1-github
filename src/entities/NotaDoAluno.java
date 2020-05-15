package entities;

public class NotaDoAluno {
	
	public String nome;
	public static double nota1;
	public static double nota2;
	public static double nota3;
	
	public static void notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;
		if (notaFinal >= 90.00) {
			System.out.println();
			System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
			System.out.println("PASS");
		}else {
			System.out.println();
			System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS FAILED", (60.00-notaFinal));			
		}
	
	}
	
	

}
