package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Figuras.Cuadrado;

class TestCuadrado {

	@Test
	void testCalcularArea() {
		
		Cuadrado c= new Cuadrado(2);
		//Calculamos el area que nos da el metodo
		double areaObtenida=c.calcularArea();
		//Hardcoreamos el area que sabemos que debería de dar
		double areaEsperada=4;
		
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testCalcularPerimetro() {

		Cuadrado c1= new Cuadrado(2);
		//Calculamos el perimetro que nos da el metodo
		double perimetroObtenido=c1.calcularPerimetro();
		//Hardcoreamos el perimetro que sabemos que debería de dar
		double perimetroEsperado=8;
		//vemos si los valores son iguales o no
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

}
