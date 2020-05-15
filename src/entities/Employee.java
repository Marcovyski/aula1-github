package entities;

public class Employee {
	
	public String name;
	public double grossSalary; // salario bruto
	public double tax;
	
	public double netSalary() {
	   	return grossSalary - tax;

	}
	public void increaseSalary(double percentagem) {
		
		System.out.println();
		grossSalary = (grossSalary * (percentagem/100)+grossSalary-tax);
		System.out.print("Updated data: " + name
							+ ", $"
							+ String.format("%.2f ", grossSalary));
	}
	
	

}
