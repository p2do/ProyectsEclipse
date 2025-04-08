package Figuras;

public class Circulo {

	private double radio;
	/**
	 * Crea un circulo con el radio especificado en metros
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio=radio;
	}
	/**
	 * Crea un circulo con el radio de 1 metro
	 */
	public Circulo() {
		this.radio=1;
	}
	/**
	 * Calcula el area de un circulo
	 * 
	 * @return el area del circulo en metros cuadrados
	 */
	public double calcularArea() {
		return Math.PI*(radio*radio);
	}
	
	/**
	 * Calcula el perimetro de un circulo
	 * 
	 * @return el perimetro del circulo en metros cuadrados
	 */
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public void setradio(double radio) {
		this.radio=radio;
	}
	
	public double getradio() {
		return this.radio;
	}
	
	public String toString() {
		return "circulo de radio = "+ this.radio;
		
	}
}
