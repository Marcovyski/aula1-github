package entities;

public class Triangle {
	/*
	 * 
	 * aqui Triangle eh uma classe
	 * e os atributos sao os lados 
	 * do triangulo
	 * 
	 */
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * ( p - a) * (p - b) * (p - c));
	}

}
