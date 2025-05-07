package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Figuras.Cuadrado;

class TestCuadrado {

	static Cuadrado c;
	
	@BeforeAll  //Se usa para ejecutar algo antes de los test
	
	static void setup() {
		c=new Cuadrado(2);
		
		//Sirve para crear el cuadrado de manera estatica 
		//y asi no tienes que crearlo varias veces
	}
	
		//Se crea un testException
	@Test
	void testException() {
		
		Exception e = assertThrows(IllegalArgumentException.class,
					() -> new Cuadrado(-1)
				);
		
		//Esto se hace para comprobar denuevo si el mensaje de la excepcion colocada
		//Es la misma que la que esperamos que llegue, ya que muchas veces
		//Aunque sea del mismo tipo puede provenir de otro lado
		String mensajeEsperado = "El lado debe ser superior a 0";
		String mensajeObtenido = e.getMessage();
		
		//Se compara que el mensaje que esperamos es igual al mensaje que recibimos del throw
		assertEquals(mensajeEsperado, mensajeObtenido);
		
	}
	@Test
	void testCalcularArea() {
		
		//	Calculamos el area que nos da el metodo
		double areaObtenida=c.calcularArea();
		//	Hardcoreamos el area que sabemos que debería de dar
		double areaEsperada=4;
		
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testCalcularPerimetro() {

		//	Calculamos el perimetro que nos da el metodo
		double perimetroObtenido=c1.calcularPerimetro();
		//	Hardcoreamos el perimetro que sabemos que debería de dar
		double perimetroEsperado=8;
		//	vemos si los valores son iguales o no
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

	
	
}
