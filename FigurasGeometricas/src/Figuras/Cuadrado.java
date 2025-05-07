package Figuras;

public class Cuadrado {

	private double lado;
	
	/**
	 * 
	 * Crea un cuadrado con el lado especificado en metros
	 * 
	 * @param lado
	 */
	public Cuadrado(double lado) {
		if (lado<=0) {
			throw new IllegalArgumentException("El lado debe de ser superior a 0");
		}else {
			this.lado = lado;
		}
	}
	
	/**
	 * Crea un cuadrado con el lado de 1 metro
	 */
	public Cuadrado() {
		this.lado = 1;
	}
	
	/**
	 * Calcula el area de un cuadrado
	 * 
	 * @return el area del cuadrado en metros cuadrados
	 */
	public double calcularArea() {
		return this.lado*this.lado;
	}
	/**
	 * 
	 * Calcula perimetro de un cuadrado
	 * 
	 * @return el perimetro del cuadrado en metros
	 */
	public double calcularPerimetro() {
		return lado*4;
	}
	public void setlado(double lado) {
		this.lado=lado;
	}
	
	public double getlado() {
		return this.lado;
	}
	
	public String toString() {
		return "Cuadrado de lado= "+ this.lado;
		
	}

}
