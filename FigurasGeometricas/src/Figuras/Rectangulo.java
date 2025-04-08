package Figuras;

public class Rectangulo {
	private double base;
	private double altura;
	/**
	 * Crea un rectangulo con la base y la altura especificado en metros
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	/**
	 * Crea un rectangulo con la base y la altura en 1 metros
	 */
	public Rectangulo() {
		this.base=1;
		this.altura=1;
	}
	
	/**
	 * Calcula el area de un rectangulo
	 * 
	 * @return el area del rectangulo en metros cuadrados
	 */
	public double calcularArea() {
		return this.base*this.altura;
	}
	/**
	 * Calcula el perimetro de un rectangulo
	 * 
	 * @return el perimetro del rectangulo en metros cuadrados
	 */
	public double calcularPerimetro() {
		return 2*(this.base+this.altura);
	}
	
	public void setbase(double base) {
		this.base=base;
	}
	
	public void setaltura(double altura) {
		this.altura=altura;
	}
	
	public double getbase() {
		return this.base;
	}
	
	public double getaltura() {
		return this.altura;
	}
	
	public String toString() {
		return "rectangulo de base = "+ this.base+" altura = "+this.altura;
		
	}
}
