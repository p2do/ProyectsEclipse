package aplicacion;

import Figuras.Cuadrado;

public class Main {

	public static void main(String[] args) {
		
		Cuadrado c1=new Cuadrado(3);
		double area= c1.calcularArea();
		double perimetro= c1.calcularPerimetro();
		System.out.println("Area: "+area);
		
		
	}

}
