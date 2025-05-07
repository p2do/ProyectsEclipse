package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;

class TestCirculo {

	static Circulo c;

	@BeforeAll
	
	static void setup() {
		c= new Circulo(2);
	}
	@Test
	void testCalcularArea() {

		double areaObtenida=(double)Math.round((c.calcularArea()*100.0)/100.0);
		double areaEsperada=(double)Math.round( 12.56637061345917295* 100.0)/100.0;
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testCalcularPerimetro() {
	
		double perimetroObtenido=Math.round(c1.calcularPerimetro()*100.0/100.0);
		double perimetroEsperado=Math.round((12.56637061435917295*100.0)/100.0);
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

}
