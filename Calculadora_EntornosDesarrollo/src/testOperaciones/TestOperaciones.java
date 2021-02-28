package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operacion;

class TestOperaciones {

	Operacion opr = new Operacion();

	@Test
	void testEsPrimo() {
		int num1 = 3;
		int num2 = 10;

		assertTrue(opr.esPrimo(num1));
		assertFalse(opr.esPrimo(num2));
	}

	@Test
	void testResta2Enteros() {
		int num1 = 3;
		int num2 = 2;
		int esperado = 1;
		assertEquals(esperado, rest.resta2Enteros(num1, num2));	
	
	}

	@Test
	void testResta3Reales() {
		double num1 = 18.2;
		double num2 = 12.3;
		double num3 = 2.5;
		double esperado = 3.4;
		assertEquals(esperado, rest.resta3Reales(num1, num2, num3));
	}

	@Test
	void IesimoPrimo() {
		int num1=5;
		String output = opr.iesimoPrimo(num1);
		assertEquals(output, "El numero primo " + num1 + "# es: 11");
		
	}
}
